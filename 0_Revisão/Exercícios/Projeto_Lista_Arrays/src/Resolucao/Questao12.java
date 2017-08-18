package Resolucao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao12 {
    public void executar(){
        Random gerador = new Random();
        int numeros[] = new int[15];
        int maior, posicaoMaior, menor, posicaoMenor;
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = gerador.nextInt(100);
        }
        
        maior = numeros[0];
        posicaoMaior = 0;
        menor = numeros[0];
        posicaoMenor = 0;
        for(int i = 1; i < numeros.length; i++){
            if(maior < numeros[i]){
                maior = numeros[i];
                posicaoMaior = i;
            }
            
            if(menor > numeros[0]){
                menor = numeros[i];
                posicaoMenor = i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Maior: " + maior + 
                "\nPosição do maior número: " + posicaoMaior + 
                 "\nMenor: " + menor +
                "\nPosição do menor número: " + posicaoMenor);
        
    }
}
