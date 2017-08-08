package lista02.Exe04;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Conversor extends javax.swing.JFrame {

    private Color AZUL = new Color(0,0,255);
    private ButtonGroup grupo = new ButtonGroup();
    
    public Conversor() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        setTitle("Conversor monetário");
        setLocationRelativeTo(null);
        LabelTitulo.setForeground(AZUL);
        BotaoRadioDolar.setSelected(true);
        
        grupo.add(BotaoRadioDolar);
        grupo.add(BotaoRadioEuros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PainelInferior = new javax.swing.JPanel();
        LabelResultado = new javax.swing.JLabel();
        PainelCentral = new javax.swing.JPanel();
        BotaoRadioDolar = new javax.swing.JRadioButton();
        BotaoRadioEuros = new javax.swing.JRadioButton();
        BotaoLimpar = new javax.swing.JButton();
        BotaoConverter = new javax.swing.JButton();
        PainelSuperior = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelDigite = new javax.swing.JLabel();
        CampoTextoDigite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelInferior.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 212;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 46, 29, 147);
        PainelInferior.add(LabelResultado, gridBagConstraints);

        getContentPane().add(PainelInferior, java.awt.BorderLayout.PAGE_END);

        PainelCentral.setLayout(new java.awt.GridBagLayout());

        BotaoRadioDolar.setText("Dólar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 28, 0, 0);
        PainelCentral.add(BotaoRadioDolar, gridBagConstraints);

        BotaoRadioEuros.setText("Euros");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 28, 42, 0);
        PainelCentral.add(BotaoRadioEuros, gridBagConstraints);

        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 0, 0);
        PainelCentral.add(BotaoLimpar, gridBagConstraints);

        BotaoConverter.setText("Converter");
        BotaoConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConverterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 51, 0, 58);
        PainelCentral.add(BotaoConverter, gridBagConstraints);

        getContentPane().add(PainelCentral, java.awt.BorderLayout.CENTER);

        PainelSuperior.setLayout(new java.awt.GridBagLayout());

        LabelTitulo.setText("Conversor monetário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 123, 0, 0);
        PainelSuperior.add(LabelTitulo, gridBagConstraints);

        LabelDigite.setText("Digite o valor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 43, 0, 0);
        PainelSuperior.add(LabelDigite, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 36, 66);
        PainelSuperior.add(CampoTextoDigite, gridBagConstraints);

        getContentPane().add(PainelSuperior, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        CampoTextoDigite.setText("");
        LabelResultado.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void BotaoConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConverterActionPerformed
        try{
            if(!CampoTextoDigite.getText().equals("")){
                double valor = Double.parseDouble(CampoTextoDigite.getText().trim().replaceAll(",", "."));
                
                if(BotaoRadioDolar.isSelected()){
                    LabelResultado.setText(String.format("%.2f", valor*3.109) + " Reais");
                }
                
                if(BotaoRadioEuros.isSelected()){
                    LabelResultado.setText(String.format("%.2f", valor*3.372) + " Reais");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Digite algum valor para ser convertido");
            }
        }catch (NumberFormatException e1){
            JOptionPane.showMessageDialog(this, "Digite apenas numeros no campo de entrada.");
            CampoTextoDigite.setText("");
        }
    }//GEN-LAST:event_BotaoConverterActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoConverter;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JRadioButton BotaoRadioDolar;
    private javax.swing.JRadioButton BotaoRadioEuros;
    private javax.swing.JTextField CampoTextoDigite;
    private javax.swing.JLabel LabelDigite;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel PainelCentral;
    private javax.swing.JPanel PainelInferior;
    private javax.swing.JPanel PainelSuperior;
    // End of variables declaration//GEN-END:variables
}
