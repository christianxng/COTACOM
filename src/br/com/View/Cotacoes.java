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
public class Cotacoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public Cotacoes() {
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

        
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btRetorno = new javax.swing.JButton();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cota��es");
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(null);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Novo.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/novo.png"))); // NOI18N
        btNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovo);
        btNovo.setBounds(10, 10, 110, 41);

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Editar.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/editar.png"))); // NOI18N
        btEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(130, 10, 110, 41);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/excluir.png"))); // NOI18N
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(btExcluir);
        btExcluir.setBounds(250, 10, 110, 41);

        btFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Fornecedor.png"))); // NOI18N
        btFornecedor.setText("Fornecedor");
        btFornecedor.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/fornecedor.png"))); // NOI18N
        btFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(btFornecedor);
        btFornecedor.setBounds(370, 10, 130, 41);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Descri��o"}
            },
            new String [] {
                "C�digo", "Descri��o"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 630, 290);

        txtPesquisa.setText("Pesquisa");
        txtPesquisa.setToolTipText("");
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(10, 360, 630, 20);

        btRetorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones/Retorno.png"))); // NOI18N
        btRetorno.setText("Retorno");
        btRetorno.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Imagens/icones_desabilitados/retorno.png"))); // NOI18N
        btRetorno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornoActionPerformed(evt);
            }
        });
        getContentPane().add(btRetorno);
        btRetorno.setBounds(510, 10, 130, 41);

        setSize(new java.awt.Dimension(667, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorActionPerformed
        CotacaoFornecedor telaCotacaoFornecedor = new CotacaoFornecedor();
        telaCotacaoFornecedor.setVisible(true);
    }//GEN-LAST:event_btFornecedorActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        Cotacao telaCotacao = new Cotacao();
        telaCotacao.setVisible(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetornoActionPerformed
        CotacaoRetorno telaCotacaoRetorno = new CotacaoRetorno();
        telaCotacaoRetorno.setVisible(true);
    }//GEN-LAST:event_btRetornoActionPerformed

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
            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Cotacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRetorno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtPassowrdSenha;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
