/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;

/**
 *
 * @author thiag
 */
public class Requisicao extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public Requisicao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Requisi��o");
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(null);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/salvar.png"))); // NOI18N
        btSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(btSalvar);
        btSalvar.setBounds(10, 380, 110, 41);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/sair.png"))); // NOI18N
        btSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(130, 380, 110, 41);

        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Adicionar.png"))); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/adicionar.png"))); // NOI18N
        btAdicionar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(btAdicionar);
        btAdicionar.setBounds(490, 210, 110, 30);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(10, 50, 150, 20);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Itens da Requisi��o");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 130, 140, 18);

        jLabel1.setText("* Motivo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 30, 50, 14);

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(170, 50, 110, 20);

        jLabel3.setText("Observa��o");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 80, 80, 14);

        jLabel4.setText("* Data");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 30, 50, 14);

        jLabel5.setText("* Respons�vel");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 30, 90, 14);

        jLabel6.setText("* N�mero");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 30, 50, 14);

        jLabel7.setText("* Setor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 80, 50, 14);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 100, 430, 20);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Dados da Requisi��o");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 10, 140, 18);

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("�#,##0.0000"))));
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(10, 170, 110, 20);

        jLabel9.setText("* Quantidade");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 150, 80, 14);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(130, 170, 350, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(290, 50, 150, 20);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(450, 50, 150, 20);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(10, 100, 150, 20);

        jLabel11.setText("* Produto");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(130, 150, 50, 14);

        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(jFormattedTextField4);
        jFormattedTextField4.setBounds(490, 170, 110, 20);

        jLabel13.setText("* Necessidade");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(490, 150, 110, 14);

        jLabel14.setText("Observa��o");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 200, 80, 14);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(10, 220, 470, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 250, 590, 120);

        setSize(new java.awt.Dimension(631, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(Requisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requisicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel txtPassowrdSenha;
    // End of variables declaration//GEN-END:variables
}
