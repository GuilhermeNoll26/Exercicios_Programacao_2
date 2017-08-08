package lista02.Exe06;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {

    private double valor;
    
    public View() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Jogo da matemática");
    }
    
    public double getRespostaUsuario(){
        return Double.parseDouble(CampoTextoEntrada.getText().trim().replaceAll(",", "."));
    }
    
    public void setPergunta(double n1, double n2, int operador){
        String pergunta = "Qual e o valor de " + n1 + " ";
        if(operador == 1){
            pergunta += "mais ";
        }else if(operador == 2){
            pergunta += "menos ";
        }else if(operador == 3){
            pergunta += "multiplicado por ";
        }else{
            pergunta += "dividido por ";
        }
        pergunta += n2 + "?R:" + valor;
        LabelPergunta.setText(pergunta);
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setResposta(String mensagem){
        LabelResposta.setText(mensagem);
    }
    
    public void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }
    
    public void adicionarListenerBotaoQueroOutro(ActionListener l){
        BotaoqueroOutro.addActionListener(l);
    }
    
    public void adicionarListenerBotaoDesisto(ActionListener l){
        BotaoDesisto.addActionListener(l);
    }
    
    public void adicionarListenerBotaoChecar(ActionListener l){
        BotaoChecar.addActionListener(l);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PainelSuperior = new javax.swing.JPanel();
        LabelPergunta = new javax.swing.JLabel();
        BotaoqueroOutro = new javax.swing.JButton();
        BotaoDesisto = new javax.swing.JButton();
        PainelInferior = new javax.swing.JPanel();
        CampoTextoEntrada = new javax.swing.JTextField();
        BotaoChecar = new javax.swing.JButton();
        LabelResposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelSuperior.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 287;
        gridBagConstraints.ipady = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 48, 0, 65);
        PainelSuperior.add(LabelPergunta, gridBagConstraints);

        BotaoqueroOutro.setText("Quero outro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 17, 0);
        PainelSuperior.add(BotaoqueroOutro, gridBagConstraints);

        BotaoDesisto.setText("Aff, Desisto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 107, 17, 65);
        PainelSuperior.add(BotaoDesisto, gridBagConstraints);

        getContentPane().add(PainelSuperior, java.awt.BorderLayout.PAGE_START);

        PainelInferior.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 85, 0, 104);
        PainelInferior.add(CampoTextoEntrada, gridBagConstraints);

        BotaoChecar.setText("Checar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 150, 0, 0);
        PainelInferior.add(BotaoChecar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 211;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 85, 51, 104);
        PainelInferior.add(LabelResposta, gridBagConstraints);

        getContentPane().add(PainelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoChecar;
    private javax.swing.JButton BotaoDesisto;
    private javax.swing.JButton BotaoqueroOutro;
    private javax.swing.JTextField CampoTextoEntrada;
    private javax.swing.JLabel LabelPergunta;
    private javax.swing.JLabel LabelResposta;
    private javax.swing.JPanel PainelInferior;
    private javax.swing.JPanel PainelSuperior;
    // End of variables declaration//GEN-END:variables
}
