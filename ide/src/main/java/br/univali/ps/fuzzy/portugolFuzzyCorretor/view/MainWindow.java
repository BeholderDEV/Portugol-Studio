/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.ps.fuzzy.portugolFuzzyCorretor.view;

import com.alee.laf.WebLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicFileChooserUI;
import br.univali.ps.fuzzy.portugolFuzzyCorretor.control.MainWindowController;

/**
 *
 * @author Augustop
 */
public class MainWindow extends javax.swing.JFrame {
    private MainWindowController controller;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow(MainWindowController ctr) {
        WebLookAndFeel webLookAndFeel = new WebLookAndFeel();
        webLookAndFeel.getDefaults().put("FileChooserUI", BasicFileChooserUI.class);
        try {
            javax.swing.UIManager.setLookAndFeel(webLookAndFeel);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.controller = ctr;
        initComponents();
        this.textAreaCodigo.setTabSize(3);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanelCodigo = new javax.swing.JScrollPane();
        textAreaCodigo = new javax.swing.JTextArea();
        paineiBotoesCodigo = new javax.swing.JPanel();
        botaoCarregarCodigo = new com.alee.laf.button.WebButton();
        botaoInterpretarCodigo = new com.alee.laf.button.WebButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMensagens = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portugol Fuzzy Corretor");

        textAreaCodigo.setColumns(20);
        textAreaCodigo.setRows(5);
        scrollPanelCodigo.setViewportView(textAreaCodigo);

        paineiBotoesCodigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoCarregarCodigo.setText("Carregar Código Portugol");
        botaoCarregarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarregarCodigoActionPerformed(evt);
            }
        });
        paineiBotoesCodigo.add(botaoCarregarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        botaoInterpretarCodigo.setText("Interpretar Código");
        botaoInterpretarCodigo.setMaximumSize(new java.awt.Dimension(140, 24));
        botaoInterpretarCodigo.setMinimumSize(new java.awt.Dimension(140, 24));
        botaoInterpretarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInterpretarCodigoActionPerformed(evt);
            }
        });
        paineiBotoesCodigo.add(botaoInterpretarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 150, -1));

        areaMensagens.setColumns(20);
        areaMensagens.setRows(5);
        jScrollPane1.setViewportView(areaMensagens);

        jLabel1.setText("Console de Mensagens");

        jLabel2.setText("Programa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelCodigo)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(paineiBotoesCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paineiBotoesCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCarregarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarregarCodigoActionPerformed
        this.controller.prepararCarregamentoCodigo();
    }//GEN-LAST:event_botaoCarregarCodigoActionPerformed

    private void botaoInterpretarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInterpretarCodigoActionPerformed
        this.controller.prepararInterpretacaoCodigo();
    }//GEN-LAST:event_botaoInterpretarCodigoActionPerformed
     
    public void setMensagens(String t){
        areaMensagens.setText(t);
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    public JTextArea getTextAreaCodigo() {
        return textAreaCodigo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMensagens;
    private com.alee.laf.button.WebButton botaoCarregarCodigo;
    private com.alee.laf.button.WebButton botaoInterpretarCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paineiBotoesCodigo;
    private javax.swing.JScrollPane scrollPanelCodigo;
    private javax.swing.JTextArea textAreaCodigo;
    // End of variables declaration//GEN-END:variables
}
