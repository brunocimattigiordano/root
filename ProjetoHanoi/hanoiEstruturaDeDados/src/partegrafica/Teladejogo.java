/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partegrafica;

import hanoiestruturadedados.Logicadojogo;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC
 */
public class Teladejogo extends javax.swing.JFrame {

    Logicadojogo logica = new Logicadojogo();
    int posicaodamao = 10;
    int base = 300;
    int prebase = 280;
    int pretopo = 260;
    int topo = 240;
    int peca1torreA = 70;
    int peca1torreB = 290;
    int peca1torreC = 490;
    int peca2torreA = 45;
    int peca2torreB = 265;
    int peca2torreC = 465;
    int peca3torreA = 25;
    int peca3torreB = 245;
    int peca3torreC = 445;
    int peca4torreA = 5;
    int peca4torreB = 220;
    int peca4torreC = 420;
    int contador = 0;

    /**
     * Creates new form Teladejogo
     */
    public Teladejogo() {
        initComponents();
        iniciajogo();
    }

    public void iniciajogo() {
        peca4.setBounds(peca4torreA, base, 200, 40);
        peca3.setBounds(peca3torreA, prebase, 150, 40);
        peca2.setBounds(peca2torreA, pretopo, 110, 40);
        peca1.setBounds(peca1torreA, topo, 60, 40);
        logica.novojogo();
        contador = 0;
        lblmovimentos.setText("Movimentos: " + contador);
    }

    void peganamao() {
        switch (logica.getPecanamao()) {
            case 1:
                peca1.setBounds(posicaodamao, posicaodamao, 60, 40);
                break;
            case 2:
                peca2.setBounds(posicaodamao, posicaodamao, 110, 40);
                break;
            case 3:
                peca3.setBounds(posicaodamao, posicaodamao, 150, 40);
                break;
            case 4:
                peca4.setBounds(posicaodamao, posicaodamao, 200, 40);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao pegar na mao");
                break;
        }
    }

    void poepecanatorre(Stack<Integer> pilhadestino, int peca) {
        switch (olhaposicaoquevai(pilhadestino, peca)) {
            case 1:
                poeimagemnatorre(peca, 1, pilhadestino);
                break;
            case 2:
                poeimagemnatorre(peca, 2, pilhadestino);
                break;
            case 3:
                poeimagemnatorre(peca, 3, pilhadestino);
                break;
            case 4:
                poeimagemnatorre(peca, 4, pilhadestino);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ocorreu um erro na peca na torre ->" + olhaposicaoquevai(pilhadestino, peca));
        }
    }

    void poeimagemnatorre(int peca, int altura, Stack<Integer> pilhadestino) {
        //torreA
        if (pilhadestino == logica.getTorreA()) {
            switch (pilhadestino.size() - altura) {
                case 0:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreA, base, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreA, base, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreA, base, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreA, base, 200, 40);
                    }
                    break;
                case 1:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreA, prebase, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreA, prebase, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreA, prebase, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreA, prebase, 200, 40);
                    }
                    break;
                case 2:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreA, pretopo, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreA, pretopo, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreA, pretopo, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreA, pretopo, 200, 40);
                    }
                    break;
                case 3:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreA, topo, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreA, topo, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreA, topo, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreA, topo, 200, 40);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "torreA");
                    break;
            }
        }//torreB
        else if (pilhadestino == logica.getTorreB()) {
            switch (pilhadestino.size() - altura) {
                case 0:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreB, base, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreB, base, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreB, base, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreB, base, 200, 40);
                    }
                    break;
                case 1:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreB, prebase, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreB, prebase, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreB, prebase, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreB, prebase, 200, 40);
                    }
                    break;
                case 2:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreB, pretopo, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreB, pretopo, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreB, pretopo, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreB, pretopo, 200, 40);
                    }
                    break;
                case 3:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreB, topo, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreB, topo, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreB, topo, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreB, topo, 200, 40);
                    }
                    break;
                default:
                    break;
            }
        }//torreC
        else if (pilhadestino == logica.getTorreC()) {
            switch (pilhadestino.size() - altura) {
                case 0:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreC, base, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreC, base, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreC, base, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreC, base, 200, 40);
                    }
                    break;
                case 1:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreC, prebase, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreC, prebase, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreC, prebase, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreC, prebase, 200, 40);
                    }
                    break;
                case 2:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreC, pretopo, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreC, pretopo, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreC, pretopo, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreC, pretopo, 200, 40);
                    }
                    break;
                case 3:
                    switch (peca) {
                        case 1:
                            peca1.setBounds(peca1torreC, topo, 60, 40);
                            break;
                        case 2:
                            peca2.setBounds(peca2torreC, topo, 110, 40);
                            break;
                        case 3:
                            peca3.setBounds(peca3torreC, topo, 150, 40);
                            break;
                        case 4:
                            peca4.setBounds(peca4torreC, topo, 200, 40);
                    }
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao por peca na torre");
        }
    }

    int olhaposicaoquevai(Stack<Integer> pilhadestino, int peca) {
        return pilhadestino.search(peca);
    }

    public void quandoclicka(Stack<Integer> pilhaclickada) {
        if (logica.naotempecanamao()) {
            logica.pegapecadapilha(pilhaclickada);
            peganamao();
        } else if (pilhaclickada.isEmpty()) {
            logica.poepecanapilha(pilhaclickada);
            poepecanatorre(pilhaclickada, logica.getPecanamao());
            logica.soltapecadamao();
        } else if (logica.pecaatualpodesercolocadanapilhadestino(pilhaclickada)) {
            logica.poepecanapilha(pilhaclickada);
            poepecanatorre(pilhaclickada, logica.getPecanamao());
            logica.soltapecadamao();
        } else {
            JOptionPane.showMessageDialog(null, "Não é possivel colocar a peça neste pino");
        }
        contador++;
        lblmovimentos.setText("Movimentos: " + contador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblmovimentos = new javax.swing.JLabel();
        btnnovojogo = new javax.swing.JButton();
        btnsolucao = new javax.swing.JButton();
        areadatorreA = new javax.swing.JLabel();
        areadatorreB = new javax.swing.JLabel();
        areadatorreC = new javax.swing.JLabel();
        peca4 = new javax.swing.JLabel();
        peca3 = new javax.swing.JLabel();
        peca2 = new javax.swing.JLabel();
        peca1 = new javax.swing.JLabel();
        torreb = new javax.swing.JLabel();
        torrec = new javax.swing.JLabel();
        torrea = new javax.swing.JLabel();
        planodefundo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblmovimentos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblmovimentos.setText("Movimentos: ");
        getContentPane().add(lblmovimentos);
        lblmovimentos.setBounds(240, 20, 160, 22);

        btnnovojogo.setText("Novo Jogo");
        btnnovojogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnovojogoMousePressed(evt);
            }
        });
        btnnovojogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovojogoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnovojogo);
        btnnovojogo.setBounds(470, 10, 120, 23);

        btnsolucao.setText("Solução");
        btnsolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsolucaoMouseClicked(evt);
            }
        });
        btnsolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolucaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnsolucao);
        btnsolucao.setBounds(470, 40, 120, 23);

        areadatorreA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areadatorreAMouseClicked(evt);
            }
        });
        getContentPane().add(areadatorreA);
        areadatorreA.setBounds(0, 200, 210, 130);

        areadatorreB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areadatorreBMouseClicked(evt);
            }
        });
        getContentPane().add(areadatorreB);
        areadatorreB.setBounds(210, 200, 210, 130);

        areadatorreC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areadatorreCMouseClicked(evt);
            }
        });
        getContentPane().add(areadatorreC);
        areadatorreC.setBounds(420, 200, 210, 130);

        peca4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peca4.png"))); // NOI18N
        getContentPane().add(peca4);
        peca4.setBounds(10, 300, 200, 40);

        peca3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peca3.png"))); // NOI18N
        getContentPane().add(peca3);
        peca3.setBounds(30, 280, 150, 40);

        peca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peca2.png"))); // NOI18N
        getContentPane().add(peca2);
        peca2.setBounds(50, 260, 110, 40);

        peca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/peca1.png"))); // NOI18N
        getContentPane().add(peca1);
        peca1.setBounds(70, 240, 60, 40);

        torreb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/torreX.png"))); // NOI18N
        getContentPane().add(torreb);
        torreb.setBounds(300, 220, 40, 100);

        torrec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/torreX.png"))); // NOI18N
        getContentPane().add(torrec);
        torrec.setBounds(500, 220, 40, 100);

        torrea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/torreX.png"))); // NOI18N
        torrea.setAlignmentY(0.0F);
        torrea.setAutoscrolls(true);
        torrea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        torrea.setIconTextGap(0);
        getContentPane().add(torrea);
        torrea.setBounds(80, 220, 60, 100);

        planodefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        getContentPane().add(planodefundo);
        planodefundo.setBounds(0, 0, 620, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsolucaoActionPerformed

    private void btnnovojogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovojogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnovojogoActionPerformed

    private void areadatorreAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areadatorreAMouseClicked
        // TODO add your handling code here:
        quandoclicka(logica.getTorreA());
    }//GEN-LAST:event_areadatorreAMouseClicked

    private void areadatorreBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areadatorreBMouseClicked
        // TODO add your handling code here:
        quandoclicka(logica.getTorreB());
    }//GEN-LAST:event_areadatorreBMouseClicked

    private void areadatorreCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areadatorreCMouseClicked
        // TODO add your handling code here:
        quandoclicka(logica.getTorreC());
        if (logica.houvevitoria()) {
            JOptionPane.showMessageDialog(null, "Vitória");
            iniciajogo();
        }
    }//GEN-LAST:event_areadatorreCMouseClicked

    private void btnnovojogoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovojogoMousePressed
        // TODO add your handling code here:
        iniciajogo();
    }//GEN-LAST:event_btnnovojogoMousePressed

    private void btnsolucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsolucaoMouseClicked
        // TODO add your handling code here:
        iniciajogo();
        resolve(4, 1, 3, 2);
        JOptionPane.showMessageDialog(null, "\"Vitória\"");
        iniciajogo();
    }//GEN-LAST:event_btnsolucaoMouseClicked

    static void espera() {
        JOptionPane.showMessageDialog(null, "Aperte para continuar");
    }

    void mover(int origem, int destino) {
        switch (origem) {
            case 1:
                quandoclicka(logica.getTorreA());
                break;
            case 2:
                quandoclicka(logica.getTorreB());
                break;
            case 3:
                quandoclicka(logica.getTorreC());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Fudeu de vez, o soluciona tá loko!!!");
                break;
        }
        espera();
        switch (destino) {
            case 1:
                quandoclicka(logica.getTorreA());
                break;
            case 2:
                quandoclicka(logica.getTorreB());
                break;
            case 3:
                quandoclicka(logica.getTorreC());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Fudeu de vez, o soluciona tá loko!!!");
                break;
        }
        espera();
    }

    void resolve(int n, int O, int D, int T) {
        if (n > 0) {
            resolve(n - 1, O, T, D);
            mover(O, D);
            resolve(n - 1, T, D, O);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teladejogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teladejogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teladejogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teladejogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teladejogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areadatorreA;
    private javax.swing.JLabel areadatorreB;
    private javax.swing.JLabel areadatorreC;
    private javax.swing.JButton btnnovojogo;
    private javax.swing.JButton btnsolucao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblmovimentos;
    private javax.swing.JLabel peca1;
    private javax.swing.JLabel peca2;
    private javax.swing.JLabel peca3;
    private javax.swing.JLabel peca4;
    private javax.swing.JLabel planodefundo;
    private javax.swing.JLabel torrea;
    private javax.swing.JLabel torreb;
    private javax.swing.JLabel torrec;
    // End of variables declaration//GEN-END:variables

}
