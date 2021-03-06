/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import java.util.ArrayList;

/**
 *
 * @author willi
 */
public class TelaGeral extends javax.swing.JFrame {

    /**
     * Creates new form TelaGeral
     */
    public TelaGeral() {
        this.fun = new ArrayList<Funcionario>();
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private ArrayList<Funcionario> fun;
    
    public TelaGeral(ArrayList<Funcionario> funcionarios) {
        this.fun = funcionarios;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cadastrarEquipamento = new javax.swing.JButton();
        cadastrarDespesas = new javax.swing.JButton();
        cadastrarEquipe = new javax.swing.JButton();
        gerarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setText("Bem Vindo!");

        cadastrarEquipamento.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cadastrarEquipamento.setText("Cadastro de Equipamento e Materiais");
        cadastrarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEquipamentoActionPerformed(evt);
            }
        });

        cadastrarDespesas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cadastrarDespesas.setText("Cadastrar Outras Despesas");
        cadastrarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarDespesasActionPerformed(evt);
            }
        });

        cadastrarEquipe.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cadastrarEquipe.setText("Cadastrar Equipe");
        cadastrarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEquipeActionPerformed(evt);
            }
        });

        gerarRelatorio.setText("Fechar");
        gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gerarRelatorio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastrarEquipamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarDespesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarEquipamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarDespesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarEquipe)
                .addGap(29, 29, 29)
                .addComponent(gerarRelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEquipamentoActionPerformed
        // TODO add your handling code here:
        CadastroEquipamento cadastrarEquipa = new CadastroEquipamento();
        cadastrarEquipa.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cadastrarEquipamentoActionPerformed

    private void cadastrarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarDespesasActionPerformed
        // TODO add your handling code here:
        CadastroDespesas cadastrarDesp = new CadastroDespesas();
        cadastrarDesp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cadastrarDespesasActionPerformed

    private void gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_gerarRelatorioActionPerformed

    private void cadastrarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEquipeActionPerformed
        // TODO add your handling code here:
        TelaCusto cust = new TelaCusto(fun);
        cust.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_cadastrarEquipeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarDespesas;
    private javax.swing.JButton cadastrarEquipamento;
    private javax.swing.JButton cadastrarEquipe;
    private javax.swing.JButton gerarRelatorio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
