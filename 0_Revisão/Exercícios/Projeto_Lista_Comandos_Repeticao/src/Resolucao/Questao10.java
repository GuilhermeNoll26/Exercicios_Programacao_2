package Resolucao;

import Modelos.Moca;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao10 {
    public void executar(){
        ArrayList<Moca> listaMocas = new ArrayList<>();
        Moca maiorMoca = null;
        String s = "";
        
        do{
            String nome = JOptionPane.showInputDialog("Digíte o nome da moça !!");
            
            if(nome.equalsIgnoreCase("fim")){
                break;
            }
            
            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Digíte a altura da moça !!")
                            .replaceAll(",", "."));
            
            listaMocas.add(new Moca(nome, altura));
        }while(true);
        
        maiorMoca = listaMocas.get(0);
        for(int i = 0; i < listaMocas.size(); i++){
            if(maiorMoca.getAltura() < listaMocas.get(i).getAltura()){
                maiorMoca = listaMocas.get(i);
            }
        }
 
        
        s += "Moca mais alto: " + maiorMoca.toString() + "\n";
        
        s += "Número de moças: " + listaMocas.size();
        
        JOptionPane.showMessageDialog(null, s);
    }
}
