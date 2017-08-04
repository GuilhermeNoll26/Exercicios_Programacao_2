package lista02.Exe05;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
        iniciar();
    }
    
    private void iniciar(){
        setLocationRelativeTo(null);
        setTitle("Calculadora");
    }
    
    public double[] acharNumeros(){
        String entrada = CampoTextoEntrada.getText();
        int posicaoSinal = 0;
        
        if(entrada.contains("+")){
            posicaoSinal = entrada.indexOf("+");
        }
        if(entrada.contains("-")){
            posicaoSinal = entrada.indexOf("-");
        }
        if(entrada.contains("*")){
            posicaoSinal = entrada.indexOf("*");
        }
        if(entrada.contains("/")){
            posicaoSinal = entrada.indexOf("/");
        }
        
        double[] numeros = new double[2];
        
        numeros[0] = Double.parseDouble(entrada.substring(0, posicaoSinal).replaceAll(",", "."));
        numeros[1] = Double.parseDouble(entrada.substring(posicaoSinal+1, entrada.length()).replaceAll(",", "."));
        return numeros;
    }
    
    public char acharOperador(){
        String entrada = CampoTextoEntrada.getText();
        int posicaoSinal = 0;
        
        if(entrada.contains("+")){
            posicaoSinal = entrada.indexOf("+");
        }
        if(entrada.contains("-")){
            posicaoSinal = entrada.indexOf("-");
        }
        if(entrada.contains("*")){
            posicaoSinal = entrada.indexOf("*");
        }
        if(entrada.contains("/")){
            posicaoSinal = entrada.indexOf("/");
        }
        
        return entrada.charAt(posicaoSinal);
    }
    
    public void setResultado(double resultado){
        LabelResultado.setText(Double.toString(resultado));
    }
    
    public void mostrarMensagemErro(String msgErro){
        JOptionPane.showMessageDialog(this, msgErro);
    }
    
    public  void addResultadoListener(ActionListener l){
        BotaoIgual.addActionListener(l);
    }
    
    public void limparCampo(){
        CampoTextoEntrada.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PainelSuperior = new javax.swing.JPanel();
        CampoTextoEntrada = new javax.swing.JTextField();
        BotaoLimpar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        LabelResultado = new javax.swing.JLabel();
        PainelInferior = new javax.swing.JPanel();
        Botao1 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        BotaoPonto = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoSomar = new javax.swing.JButton();
        BotaoSubtracao = new javax.swing.JButton();
        BotaoMultiplicacao = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelSuperior.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 139;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 0);
        PainelSuperior.add(CampoTextoEntrada, gridBagConstraints);

        BotaoLimpar.setText("Limpar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 34, 0, 108);
        PainelSuperior.add(BotaoLimpar, gridBagConstraints);

        BotaoExcluir.setText("Excluir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 34, 19, 108);
        PainelSuperior.add(BotaoExcluir, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 0);
        PainelSuperior.add(LabelResultado, gridBagConstraints);

        getContentPane().add(PainelSuperior, java.awt.BorderLayout.PAGE_START);

        PainelInferior.setLayout(new java.awt.GridBagLayout());

        Botao1.setText("1");
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 57, 0, 0);
        PainelInferior.add(Botao1, gridBagConstraints);

        Botao2.setText("2");
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        PainelInferior.add(Botao2, gridBagConstraints);

        Botao3.setText("3");
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 0);
        PainelInferior.add(Botao3, gridBagConstraints);

        Botao4.setText("4");
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 57, 0, 0);
        PainelInferior.add(Botao4, gridBagConstraints);

        Botao5.setText("5");
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao5, gridBagConstraints);

        Botao6.setText("6");
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao6, gridBagConstraints);

        Botao7.setText("7");
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 57, 0, 0);
        PainelInferior.add(Botao7, gridBagConstraints);

        Botao8.setText("8");
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao8, gridBagConstraints);

        Botao9.setText("9");
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        PainelInferior.add(Botao9, gridBagConstraints);

        Botao0.setText("0");
        Botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 57, 50, 0);
        PainelInferior.add(Botao0, gridBagConstraints);

        BotaoPonto.setText(",");
        BotaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPontoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 50, 0);
        PainelInferior.add(BotaoPonto, gridBagConstraints);

        BotaoIgual.setText("=");
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 50, 0);
        PainelInferior.add(BotaoIgual, gridBagConstraints);

        BotaoSomar.setText("+");
        BotaoSomar.setPreferredSize(new java.awt.Dimension(45, 23));
        BotaoSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 18, 0, 96);
        PainelInferior.add(BotaoSomar, gridBagConstraints);

        BotaoSubtracao.setText("-");
        BotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSubtracaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 96);
        PainelInferior.add(BotaoSubtracao, gridBagConstraints);

        BotaoMultiplicacao.setText("x");
        BotaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicacaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 96);
        PainelInferior.add(BotaoMultiplicacao, gridBagConstraints);

        BotaoDivisao.setText("/");
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 50, 96);
        PainelInferior.add(BotaoDivisao, gridBagConstraints);

        getContentPane().add(PainelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "4");
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "7");
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao0ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "0");
    }//GEN-LAST:event_Botao0ActionPerformed

    private void BotaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPontoActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "1");
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "2");
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "3");
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
       CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "5");
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "6");
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "7");
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "9");
    }//GEN-LAST:event_Botao9ActionPerformed

    private void BotaoSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSomarActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "+");
    }//GEN-LAST:event_BotaoSomarActionPerformed

    private void BotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSubtracaoActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "-");
    }//GEN-LAST:event_BotaoSubtracaoActionPerformed

    private void BotaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicacaoActionPerformed
        CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "*");
    }//GEN-LAST:event_BotaoMultiplicacaoActionPerformed

    private void BotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisaoActionPerformed
       CampoTextoEntrada.setText(CampoTextoEntrada.getText() + "/");
    }//GEN-LAST:event_BotaoDivisaoActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed

    }//GEN-LAST:event_BotaoIgualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoMultiplicacao;
    private javax.swing.JButton BotaoPonto;
    private javax.swing.JButton BotaoSomar;
    private javax.swing.JButton BotaoSubtracao;
    private javax.swing.JTextField CampoTextoEntrada;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JPanel PainelInferior;
    private javax.swing.JPanel PainelSuperior;
    // End of variables declaration//GEN-END:variables
}
