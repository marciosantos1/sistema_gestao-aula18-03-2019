package br.senai.sc.sisloja.dao;

import br.senai.sc.sisGestao.modelo.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorDao extends ConnectionFactory {

    private Connection con;

    public ColaboradorDao() {
        this.con = this.getConnection();
    }

    public void inserir(Colaborador col) throws SQLException {

        String sql = "insert into colaborador "
                + "(tipo, usuario, "
                + "senha, nome, endereco, Equipe_codEquipe) "
                + "values (?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getTipo());
            st.setString(2, col.getUsuario());
            st.setString(3, col.getSenha());
            st.setString(4, col.getNome());
            st.setString(5, col.getEndereco());
            st.setInt(6, col.getEquipe());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void eliminar(int codigoC) throws SQLException {

        String sql = "delete from colaborador where codColaborador = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codigoC);
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void alterar(Colaborador col) throws SQLException {

        String sql = "update colaborador set tipo = ?, usuario = ?, senha = ?, "
                + "nome = ?, endereco = ? where codColaborador = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, col.getTipo());
            st.setString(2, col.getUsuario());
            st.setString(3, col.getSenha());
            st.setString(4, col.getNome());
            st.setString(5, col.getEndereco());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<Colaborador> listarColaboradores() throws SQLException {
        String sql = "select * from colaborador";
        List<Colaborador> colaboradores = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            colaboradores = new ArrayList<Colaborador>();

            while (rs.next()) {
                Colaborador c = new Colaborador();
                c.setTipo("tipo");
                c.setUsuario("usuario");
                c.setSenha("senha");
                c.setNome("nome");
                c.setEndereco("endereco");
               

                colaboradores.add(c);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return colaboradores;
    }

    public Colaborador getColaborador(int codColaborador) throws SQLException {
        String sql = "select * from colaborador where codColaborador = ?";
        Colaborador colaborador = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codColaborador);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    Colaborador c = new Colaborador();
                    c.setTipo("tipo");
                    c.setUsuario("usuario");
                    c.setSenha("senha");
                    c.setNome("nome");
                    c.setEndereco("endereco");

                }
            }
            st.close();
        }

        this.con.close();
        return colaborador;
    }

}
