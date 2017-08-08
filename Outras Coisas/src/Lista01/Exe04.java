package Lista01;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Tiago Funk
 */
public class Exe04 {
    
    private static int[] valores = new int[100];
    private static int[] contagem = new int[6];
    
    public static void main(String[] args) {
        lancarDados();
        mostrar();
    }
    
    private static void lancarDados(){
        Random gerador = new Random();
        int n;
        for(int i = 0; i < valores.length; i++){
            n = gerador.nextInt(6)+1;
            contagem[n-1]++;
        }
    }
    
    private static void mostrar(){
        String mostrar = "";
        for(int i = 0; i < contagem.length; i++){
            mostrar += "O valor " + (i+1) + " foi lançado " + contagem[i] + " vezes.\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
}
