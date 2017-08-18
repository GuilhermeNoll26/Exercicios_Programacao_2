package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao11 {

    public void executar() {
        int numeroDecimal;
        String numeroBinario = "";

        numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog("Digíte um número !!"));

        while (numeroDecimal > 0) {
            numeroBinario = (numeroDecimal % 2) + numeroBinario;
            numeroDecimal = numeroDecimal / 2;
        }
        
        JOptionPane.showMessageDialog(null, numeroBinario);
    }
}
