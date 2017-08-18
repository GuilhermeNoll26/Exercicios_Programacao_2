package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao04 {
    public void executar(){
        int auxiliar, qtdPares = 0;
        for(int i = 0; i < 10; i++){
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte o pŕoximo número"));
            
            if(auxiliar % 2 == 0){
                qtdPares++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quantidade de número pares: " + qtdPares);
    }
}
