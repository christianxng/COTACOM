/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.View;


public class Encomenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public Encomenda() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encomenda");
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
        btSalvar.setBounds(10, 430, 110, 41);

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
        btSair.setBounds(130, 430, 110, 41);

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
        jLabel2.setText("Itens da Encomenda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 130, 140, 18);

        jLabel1.setText("* Fornecedor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 30, 80, 14);

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(170, 50, 130, 20);

        jLabel4.setText("* Emiss�o");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 30, 50, 14);

        jLabel6.setText("* N�mero");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 30, 50, 14);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Dados da Encomenda");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 10, 140, 18);

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("�#,##0.0000"))));
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(10, 170, 130, 20);

        jLabel9.setText("* Quantidade");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 150, 80, 14);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(290, 170, 310, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(450, 50, 150, 20);

        jLabel11.setText("* Produto");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 150, 50, 14);

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

        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(jFormattedTextField5);
        jFormattedTextField5.setBounds(310, 50, 130, 20);

        jLabel15.setText("* Previs�o");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 30, 60, 14);

        jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("�#,##0.0000"))));
        getContentPane().add(jFormattedTextField6);
        jFormattedTextField6.setBounds(150, 170, 130, 20);

        jLabel16.setText("* Unit�rio");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(150, 150, 80, 14);

        jFormattedTextField7.setEditable(false);
        jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("�#,##0.0000"))));
        getContentPane().add(jFormattedTextField7);
        jFormattedTextField7.setBounds(10, 400, 140, 20);

        jLabel17.setText("Total dos Produtos");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 380, 100, 14);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(10, 100, 590, 20);

        jLabel18.setText("Observa��o");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 80, 80, 14);

        jFormattedTextField8.setEditable(false);
        jFormattedTextField8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("�#,##0.0000"))));
        getContentPane().add(jFormattedTextField8);
        jFormattedTextField8.setBounds(460, 400, 140, 20);

        jLabel19.setText("Total L�quido");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(460, 380, 100, 14);

        jFormattedTextField9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("�#,##0.0000"))));
        getContentPane().add(jFormattedTextField9);
        jFormattedTextField9.setBounds(160, 400, 140, 20);

        jLabel20.setText("* Frete");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(160, 380, 80, 14);

        jLabel21.setText("* Desconto");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(310, 380, 80, 14);

        jFormattedTextField10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("�#,##0.0000"))));
        getContentPane().add(jFormattedTextField10);
        jFormattedTextField10.setBounds(310, 400, 140, 20);

        setSize(new java.awt.Dimension(631, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encomenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Encomenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel txtPassowrdSenha;
    // End of variables declaration//GEN-END:variables
}
