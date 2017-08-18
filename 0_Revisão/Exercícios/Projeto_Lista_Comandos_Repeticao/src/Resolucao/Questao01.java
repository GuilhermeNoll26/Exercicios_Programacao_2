package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao01 {
    public void executar(){
        int soma = 0, numerosDigitados = 0, auxiliar;
        
        do{
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte o próximo valor !!"));
            
            if(auxiliar == 0){
                break;
            }
            
            soma += auxiliar;
            numerosDigitados++;
        }while(true);
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma + "\nNúmero digitados: " + numerosDigitados);
    }
}
