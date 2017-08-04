package Lista01;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Exe01 {

    public static void main(String[] args) {
        double vetor[] = new double[10];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i+1) + "º numero:")
                    .replaceAll(",", ".").trim());
        }
        
        String mostrar = "";
        for(int i = vetor.length-1; i >= 0; i--){
            mostrar += "O " + (i+1) + "º numero digitado: " + vetor[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
}
