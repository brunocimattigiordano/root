/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoiestruturadedados;
    
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import partegrafica.Teladejogo;

/**
 *
 * @author FATEC
 */
public class HanoiEstruturaDeDados extends JFrame {
    
    /*ImageIcon icone= newImageIcon(getClass().getResource(""));

    public HanoiEstruturaDeDados(){
        editarjanela();
    }
            
    public void editarjanela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(618,417);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
    }*/
            
    public static void main(String[] args) {
        // TODO code application logic here
        //new HanoiEstruturaDeDados();
        Teladejogo tela=new Teladejogo();
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela.setSize(618,417);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setLayout(null);
    }

}
