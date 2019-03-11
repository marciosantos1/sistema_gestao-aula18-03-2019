
package br.senai.sc.sisGestao.telas;

import br.senai.sc.sistemaGestao.GestaoJFrame;
import javax.swing.JFrame;


public class Principal {
    public static void main(String[]args){
        JFrame frame = new JFrame("PAINEL");
        GestaoJFrame painel = new GestaoJFrame();
        
        frame.setSize(500, 500);
        frame.add(painel);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
