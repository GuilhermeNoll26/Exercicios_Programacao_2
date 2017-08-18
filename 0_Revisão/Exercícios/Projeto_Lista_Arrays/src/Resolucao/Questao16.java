package Resolucao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao16 {
    public void executar(){
        int n;
        String s = "";
        Random gerador = new Random();
        
        n =Integer.parseInt(JOptionPane.showInputDialog("Digite a ordem da matriz !!"));
                
        int matriz[][] = new int[n][n];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = gerador.nextInt(10);
            }
        }
        
        s += "Matriz original:\n";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                s += matriz[i][j] + "  ";
            }
            s += "\n";
        }
        
        s += "Número da diagonal principal:\n";
        for(int i = 0; i < matriz.length; i++){
            s += matriz[i][i] + ", ";
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
