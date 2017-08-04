package Lista01;

import java.text.Normalizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Exe06 {
    
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra!!")
                .toLowerCase().replaceAll(" ", "");
        
        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD);
        palavra = palavra.replaceAll("[^\\p{ASCII}]", "");

        String invertida = "";
        char[] letras = palavra.toCharArray();
        
        for(int i = letras.length-1; i >= 0; i--){
            invertida += letras[i];
        }
        
        if(invertida.equalsIgnoreCase(palavra)){
            JOptionPane.showMessageDialog(null, "São polindromos");
        }else{
            JOptionPane.showMessageDialog(null, "Não são polindromos");
        }
    }
}
