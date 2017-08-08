package Lista01;

import javax.swing.JOptionPane;

/**
 * @author Tiago Funk
 */
public class Exe03 {

    private static double[] notas = new double[0];

    public static void main(String[] args) {
        coletarValores();
        fazerTudo();
        JOptionPane.showMessageDialog(null, "Tchau otário!!");
    }

    private static void coletarValores() {
        double valor;
        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite um valor. Para acabar digite -1.").replaceAll(",", ".").trim());
            if (valor != -1) {
                AcrescentaValorVetor(valor);
            }
        } while (valor != -1);

    }

    private static void AcrescentaValorVetor(double numero) {
        double novoVetor[] = new double[notas.length + 1];
        for (int i = 0; i < notas.length; i++) {
            novoVetor[i] = notas[i];
        }
        novoVetor[notas.length] = numero;

        notas = novoVetor;
    }

    private static void fazerTudo() {
        String mostrar = "";
        double media;
        mostrar += "Foram digitados " + notas.length + " valores.\n";
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        mostrar += "Todos os valores somados é igual: " + soma + "\n";
        media = soma / notas.length;
        mostrar += "A média: " + soma / notas.length + "\n";
        
        String s1 = "", s2 = "";
        for (int i = 0; i < notas.length; i++) {
            if(media < notas[i]){
                s1 += notas[i] + ", ";
            }
            if(notas[i] > 7){
                s2 += notas[i] + ", ";
            }
        }
        mostrar += "Valores acima da média: " + s1 + "\n";
        mostrar += "Valores acima de sete: " + s2 + "\n";
        
        JOptionPane.showMessageDialog(null, mostrar);

    }

}
