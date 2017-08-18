package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao13 {
    public void executar(){
        int numero;
        String s = "";
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digíte um número !!"));
        s += numero + ", ";
        do{
            numero = numero * 3;
            s += numero + ", ";
        }while(numero <= 100);
            
        JOptionPane.showMessageDialog(null, s);
    }
}
