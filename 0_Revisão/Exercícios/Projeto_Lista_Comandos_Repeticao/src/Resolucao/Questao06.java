package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao06 {
    public void executar() {
        int auxiliar, contador = 0; 
        double soma = 0, media = 0;
        
        do{
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte um número !!"));
            
            if(auxiliar < 0){
                break;
            }
            
            soma += auxiliar;
            contador++;
        }while(true);
        
        media = soma / contador;
        
        JOptionPane.showMessageDialog(null, "Média: " + media);
    }
}
