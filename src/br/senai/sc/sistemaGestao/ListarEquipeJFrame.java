/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sistemaGestao;

import br.senai.sc.sisGestao.modelo.CadastrarEquipe;
import br.senai.sc.sisloja.dao.EquipeDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ListarEquipeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ListarEquipeJFrame
     */
    public ListarEquipeJFrame() {
        initComponents();
        popularTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEquipe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void popularTabela() {
        EquipeDao eq = new EquipeDao();
        List<CadastrarEquipe> listaEquipe;

        try {
            listaEquipe = eq.listarEquipes();

            DefaultTableModel model = (DefaultTableModel) tblEquipe.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaEquipe.size(); i++) {
                CadastrarEquipe e = listaEquipe.get(i);
                lista.add(new Object[]{e.getCodEquipe(), e.getNome(), e.getDescricao()});
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter os clientes do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListarEquipeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEquipe;
    // End of variables declaration//GEN-END:variables
}
