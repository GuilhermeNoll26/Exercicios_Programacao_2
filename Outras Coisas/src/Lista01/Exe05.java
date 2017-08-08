package Lista01;

import javax.swing.JOptionPane;

/**
 * @author Tiago Funk
 */
public class Exe05 {
    
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");
        
        String mostrar = "";
        for(int i = 0; i < palavra.length(); i++){
            mostrar += palavra.substring(0, i+1) + "\n";
        }
        mostrar += "\n";
        for(int i = 0; i < palavra.length(); i++){
            mostrar += palavra.substring(0, palavra.length()-i) + "\n";
        }
        
        JOptionPane.showMessageDialog(null, mostrar);
    }
}
