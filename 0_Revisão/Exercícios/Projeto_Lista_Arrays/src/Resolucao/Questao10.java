package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao10 {

    public void executar() {
        int numero, soma, contador;
        boolean quadradoPerfeito;
        String s;

        for (int j = 0; j < 3; j++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (j+1) + " número !!"));
            contador = 0;
            soma = 0;
            s = "";
            quadradoPerfeito = false;
            /**
             * Comando que testa e acha a raiz do número.
             */
            for (int i = 1;; i += 2) {
                soma += i;
                contador++;
                s += i + ", ";

                if (soma == numero) {
                    quadradoPerfeito = true;
                    break;
                }

                if (soma > numero) {
                    break;
                }
            }

            if (quadradoPerfeito) {
                JOptionPane.showMessageDialog(null, "Quadrado perfeito."
                        + "\nRaiz do número: " + contador
                        + "\nNúmero impares: " + s);
            } else {
                JOptionPane.showMessageDialog(null, "Não é um quadrado perfeito !!");
            }
        }
    }
}
