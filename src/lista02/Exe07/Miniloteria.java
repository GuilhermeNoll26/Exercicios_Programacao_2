package lista02.Exe07;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Miniloteria extends javax.swing.JFrame {

    private ButtonGroup jogo1;
    private ButtonGroup jogo2;
    private ButtonGroup jogo3;
    private ButtonGroup jogo4;
    private ButtonGroup jogo5;
    
    public Miniloteria() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Loteria esportiva");
        
        jogo1 = new ButtonGroup();
        jogo1.add(Botao11);
        jogo1.add(Botao12);
        jogo1.add(Botao13);
        
        jogo2 = new ButtonGroup();
        jogo2.add(Botao21);
        jogo2.add(Botao22);
        jogo2.add(Botao23);
        
        jogo3 = new ButtonGroup();
        jogo3.add(Botao31);
        jogo3.add(Botao32);
        jogo3.add(Botao33);
        
        jogo4 = new ButtonGroup();
        jogo4.add(Botao41);
        jogo4.add(Botao42);
        jogo4.add(Botao43);
        
        jogo5 = new ButtonGroup();
        jogo5.add(Botao51);
        jogo5.add(Botao52);
        jogo5.add(Botao53);
    }
    
    public void addApostarListener (ActionListener l){
        BotaoApostar.addActionListener(l);
    }
    
    public void LimparCampos(){
        jogo1.clearSelection();
        jogo2.clearSelection();
        jogo3.clearSelection();
        jogo4.clearSelection();
        jogo5.clearSelection();
    }
    
    public int[] getSelecoes(){
        int[] selecoes = new int[5];
        
        if(Botao11.isSelected()){
            selecoes[0] = 1;
        }else if(Botao12.isSelected()){
            selecoes[0] = 2;
        }else if(Botao13.isSelected()){
            selecoes[0] = 3;
        }else{
            selecoes[0] = 0;
        }
        
        if(Botao21.isSelected()){
            selecoes[1] = 1;
        }else if(Botao22.isSelected()){
            selecoes[1] = 2;
        }else if(Botao23.isSelected()){
            selecoes[1] = 3;
        }else{
            selecoes[1] = 0;
        }
        
        if(Botao31.isSelected()){
            selecoes[2] = 1;
        }else if(Botao32.isSelected()){
            selecoes[2] = 2;
        }else if(Botao33.isSelected()){
            selecoes[2] = 3;
        }else{
            selecoes[2] = 0;
        }
        
        if(Botao41.isSelected()){
            selecoes[3] = 1;
        }else if(Botao42.isSelected()){
            selecoes[3] = 2;
        }else if(Botao43.isSelected()){
            selecoes[3] = 3;
        }else{
            selecoes[3] = 0;
        }
        
        if(Botao51.isSelected()){
            selecoes[4] = 1;
        }else if(Botao52.isSelected()){
            selecoes[4] = 2;
        }else if(Botao53.isSelected()){
            selecoes[4] = 3;
        }else{
            selecoes[4] = 0;
        }
        
        return selecoes;
    }
    
    public void mostrarMensagem(String m){
        JOptionPane.showMessageDialog(this, m);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PainelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotaoApostar = new javax.swing.JButton();
        PainelInferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Botao11 = new javax.swing.JRadioButton();
        Botao12 = new javax.swing.JRadioButton();
        Botao13 = new javax.swing.JRadioButton();
        Botao21 = new javax.swing.JRadioButton();
        Botao22 = new javax.swing.JRadioButton();
        Botao31 = new javax.swing.JRadioButton();
        Botao32 = new javax.swing.JRadioButton();
        Botao23 = new javax.swing.JRadioButton();
        Botao33 = new javax.swing.JRadioButton();
        Botao41 = new javax.swing.JRadioButton();
        Botao42 = new javax.swing.JRadioButton();
        Botao43 = new javax.swing.JRadioButton();
        Botao51 = new javax.swing.JRadioButton();
        Botao52 = new javax.swing.JRadioButton();
        Botao53 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelSuperior.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Loteria esportiva");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 87, 12, 0);
        PainelSuperior.add(jLabel1, gridBagConstraints);

        BotaoApostar.setText("Apostar");
        BotaoApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoApostarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 115, 0, 99);
        PainelSuperior.add(BotaoApostar, gridBagConstraints);

        getContentPane().add(PainelSuperior, java.awt.BorderLayout.PAGE_START);

        PainelInferior.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 29, 0, 0);
        PainelInferior.add(jLabel2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("x");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 21, 0, 0);
        PainelInferior.add(jLabel3, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(jLabel4, gridBagConstraints);

        jLabel5.setText("São Paulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 31, 0, 0);
        PainelInferior.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Internacional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 31, 0, 0);
        PainelInferior.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Santos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 31, 0, 0);
        PainelInferior.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Flamengo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 31, 0, 0);
        PainelInferior.add(jLabel8, gridBagConstraints);

        jLabel9.setText("Botafogo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 31, 45, 0);
        PainelInferior.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Palmeiras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 41, 0, 0);
        PainelInferior.add(jLabel10, gridBagConstraints);

        jLabel11.setText("Grêmio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 41, 0, 0);
        PainelInferior.add(jLabel11, gridBagConstraints);

        jLabel12.setText("Corinthians");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 41, 0, 90);
        PainelInferior.add(jLabel12, gridBagConstraints);

        jLabel13.setText("Vasco");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 41, 0, 0);
        PainelInferior.add(jLabel13, gridBagConstraints);

        jLabel14.setText("Fluminense");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 41, 45, 0);
        PainelInferior.add(jLabel14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 22, 0, 0);
        PainelInferior.add(Botao11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 22, 0, 0);
        PainelInferior.add(Botao21, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao22, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 22, 0, 0);
        PainelInferior.add(Botao31, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        PainelInferior.add(Botao32, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao23, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        PainelInferior.add(Botao33, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 22, 0, 0);
        PainelInferior.add(Botao41, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        PainelInferior.add(Botao42, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        PainelInferior.add(Botao43, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 22, 45, 0);
        PainelInferior.add(Botao51, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 45, 0);
        PainelInferior.add(Botao52, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 45, 0);
        PainelInferior.add(Botao53, gridBagConstraints);

        getContentPane().add(PainelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoApostarActionPerformed
        
    }//GEN-LAST:event_BotaoApostarActionPerformed

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
            java.util.logging.Logger.getLogger(Miniloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miniloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miniloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miniloteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Controller c = new Controller();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Botao11;
    private javax.swing.JRadioButton Botao12;
    private javax.swing.JRadioButton Botao13;
    private javax.swing.JRadioButton Botao21;
    private javax.swing.JRadioButton Botao22;
    private javax.swing.JRadioButton Botao23;
    private javax.swing.JRadioButton Botao31;
    private javax.swing.JRadioButton Botao32;
    private javax.swing.JRadioButton Botao33;
    private javax.swing.JRadioButton Botao41;
    private javax.swing.JRadioButton Botao42;
    private javax.swing.JRadioButton Botao43;
    private javax.swing.JRadioButton Botao51;
    private javax.swing.JRadioButton Botao52;
    private javax.swing.JRadioButton Botao53;
    private javax.swing.JButton BotaoApostar;
    private javax.swing.JPanel PainelInferior;
    private javax.swing.JPanel PainelSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    // End of variables declaration//GEN-END:variables
}
