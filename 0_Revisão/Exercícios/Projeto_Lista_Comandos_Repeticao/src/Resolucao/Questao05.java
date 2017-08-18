package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao05 {
    public void executar(){
        int auxiliar, maior = 0, menor = 0;
        
        for(int i = 0; i < 15; i++){
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Digíte o próximo número !!"));
            
            if(i == 0){
                maior = auxiliar;
                menor = auxiliar;
            }else{
                if(maior < auxiliar){
                    maior = auxiliar;
                }
                if(menor > auxiliar){
                    menor = auxiliar;
                }
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
    }
}
