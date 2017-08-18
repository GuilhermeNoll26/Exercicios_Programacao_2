package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao03 {
    public void executar(){
        int contador = 10;
        while(contador >= 0){
            JOptionPane.showMessageDialog(null, contador);
            contador--;
        }
        JOptionPane.showMessageDialog(null, "FIM");
    }
}
