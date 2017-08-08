package Lista01;

import javax.swing.JOptionPane;

/**
 * @author Tiago Funk
 */

public class Exe02 {
    
    private static double notas[][] = new double[10][4];
    private static double medias[] = new double[10];

    public static void main(String[] args) {
        coletarValores();
        calcularMedias();
        mostrarNotas();
    }
    
    private static void coletarValores(){
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " 
                        + (j+1) + "º nota do " + (i+1) + "º aluno.").replaceAll(",", ".").trim());
            }
        }
    }
    
    private static void calcularMedias(){
        double media;
        for(int i = 0; i < notas.length; i++){
            media = 0;
            for(int j = 0; j < notas[i].length; j++){
                media += notas[i][j];
            }
            media = media/4;
            medias[i] = media;
        }
    }
    
    private static void mostrarNotas(){
        String mostrar = "";
        for(int i = 0; i < medias.length; i++){
            if(medias[i] >= 7){
                mostrar += "O aluno " + (i+1) + " ficou com média maior que sete!!\n";
            }
        }
        
        if(mostrar.length() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum aluno tirou média maior ou igual a sete");
        }else{
            JOptionPane.showMessageDialog(null, mostrar);
        }
    }
    
}
