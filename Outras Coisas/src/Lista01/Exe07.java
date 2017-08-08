package Lista01;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author Tiago Funk
 */
public class Exe07 {

    private static String[] palavras = {"carro", "bola", "pessoa"};

    public static void main(String[] args) {
        Random gerador = new Random();
        boolean perdeu = true;
        int tentativas = 6;
        int[] posicoes;
        char[] letrasUsadas = new char[0];
        String palavraOriginal = palavras[gerador.nextInt(3)];
        String editado = criarPalavraVazia(palavraOriginal.length());

        do {
            char letraDigitada = JOptionPane.showInputDialog("Palavra: " + editado + "    com " + palavraOriginal.length()
                    + " letras\n" + imprimirLetrasUsadas(letrasUsadas)
                    + "Digite uma letra: ").toLowerCase().trim().charAt(0);
            posicoes = acharPosicao(palavraOriginal, letraDigitada);
            editado = revelarLetras(palavraOriginal, editado, letraDigitada);

            if (!acharLetra(letrasUsadas, letraDigitada)) {
                if (posicoes.length == 0) {
                    tentativas--;
                    JOptionPane.showMessageDialog(null, "Você errou!!\nVocê tem ainda " + tentativas + " tentativas.");
                } else {
                    JOptionPane.showMessageDialog(null, "Você acertou!!");
                }
                letrasUsadas = AcrescentarValorVetor(letrasUsadas, letraDigitada);
            } else {
                JOptionPane.showMessageDialog(null, "Essa letra já foi digitada.");
            }

            if (!editado.contains("_")) {
                JOptionPane.showMessageDialog(null, "Você ganhou!!\nA palavra era " + palavraOriginal);
                perdeu = false;
                break;
            }
        } while (tentativas != 0);

        if (perdeu) {
            JOptionPane.showMessageDialog(null, "Você perdeu o jogo!!\nA palavra era " + palavraOriginal);
        }
    }

    private static int[] acharPosicao(String palavra, char letra) {
        int[] posicoes = new int[0];
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                posicoes = AcrescentaValorVetor(posicoes, i);
            }
        }
        return posicoes;
    }

    private static int[] AcrescentaValorVetor(int[] vetor, int numero) {
        int novoVetor[] = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        novoVetor[vetor.length] = numero;
        return novoVetor;
    }

    private static char[] AcrescentarValorVetor(char[] vetor, char letra) {
        char novoVetor[] = new char[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        novoVetor[vetor.length] = letra;
        return novoVetor;
    }

    private static String revelarLetras(String palavra, String palavraEditada, char letra) {
        String retorno = "";
        String[] letras = palavraEditada.split(" ");
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                retorno += letra + " ";
            } else {
                retorno += letras[i] + " ";
            }
        }
        return retorno;
    }

    private static String criarPalavraVazia(int n) {
        String retorno = "";
        for (int i = 0; i < n; i++) {
            retorno += "_ ";
        }
        return retorno;
    }

    private static String imprimirLetrasUsadas(char[] letras) {
        String mostrar = "Letras já digitadas:  ";
        if (letras.length == 0) {
            mostrar += " nenhuma.";
        } else {
            for (int i = 0; i < letras.length; i++) {
                mostrar += letras[i] + ", ";
            }
        }
        mostrar += "\n";
        return mostrar;
    }

    private static boolean acharLetra(char[] letras, char letra) {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                return true;
            }
        }
        return false;
    }

}
