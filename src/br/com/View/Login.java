/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;

import br.com.Controller.Login_acesso;

/**
 *
 * @author thiag
 */
public class Login extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form TelaLogin
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPassowrdSenha = new javax.swing.JLabel();
        txtEntradaUsuario = new javax.swing.JTextField();
        txtEntradaSenha = new javax.swing.JPasswordField();
        btAcessar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(txtEntradaUsuario);
        txtEntradaUsuario.setBounds(10, 30, 200, 30);
        getContentPane().add(txtEntradaSenha);
        txtEntradaSenha.setBounds(220, 30, 200, 30);

        btAcessar.setText("Entrar");
        btAcessar.setToolTipText("");
        btAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btAcessar);
        btAcessar.setBounds(260, 70, 80, 30);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(350, 70, 70, 30);

        lbUsuario.setText("Usu�rio:");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(10, 10, 50, 14);

        lbSenha.setText("Senha:");
        getContentPane().add(lbSenha);
        lbSenha.setBounds(220, 10, 50, 14);

        setSize(new java.awt.Dimension(444, 148));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
	private void btAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarActionPerformed
    	Login_acesso la = new Login_acesso();
    	la.acesso(txtEntradaUsuario.getText(), txtEntradaSenha.getText());
    	if(Login_acesso.acesso ==true)
    	{
    		Principal telaPrincipal = new Principal();
            telaPrincipal.setVisible(true);
            dispose();    		
    	}
    	if(Login_acesso.acesso ==false)
    	{
    		txtEntradaUsuario.setText("");
    		txtEntradaSenha.setText("");
    		txtEntradaUsuario.requestFocus(); 		
    		
    	}
       // la.acesso = false;
       
    }//GEN-LAST:event_btAcessarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessar;
    private javax.swing.JButton btSair;
    private javax.swing.JPasswordField txtEntradaSenha;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel txtPassowrdSenha;
    private javax.swing.JTextField txtEntradaUsuario;
    // End of variables declaration//GEN-END:variables
}