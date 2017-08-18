package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao07 {
    public void executar(){
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digíte um número !!"));
        
        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }
    }
}
