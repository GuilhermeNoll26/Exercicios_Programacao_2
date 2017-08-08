package Lista01;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author Tiago Funk
 */
public class Exe08 {

    private static String palavras[] = {"bola", "pessoa", "carro"};

    public static void main(String[] args) {
        Random gerador = new Random();
        int n = gerador.nextInt(3);
        String palavraEmbaralhada = embaralharPalavra(palavras[n]);
        String palavraOriginal = palavras[n];

        int tentativas = 6;
        String resposta = "";
        boolean perdeu = false;

        do {
            resposta = JOptionPane.showInputDialog("Palavra embaralhada: " + palavraEmbaralhada
                    + "\nVocê tem ainda " + tentativas + " tentativas para acertar!!");
            if (resposta.equalsIgnoreCase(palavraOriginal)) {
                tentativas = 0;
                JOptionPane.showMessageDialog(null, "Parábens, você acertou!!");
                perdeu = false;
                break;
            } else {
                tentativas--;
                perdeu = true;
                JOptionPane.showMessageDialog(null, "Você errou!!");
            }
        } while (tentativas != 0);
        
        if(perdeu){
            JOptionPane.showMessageDialog(null, "Você perdeu !!\n A palavra era " + palavraOriginal);
        }
    }

    private static String embaralharPalavra(String palavra) {
        String palavraEmbaralhada = "";
        int n = palavra.length();
        char[] letrasPares, letrasImpares;

        if (n % 2 == 0) {
            letrasPares = new char[n / 2];
            letrasImpares = new char[n / 2];
        } else {
            letrasPares = new char[n / 2 + 1];
            letrasImpares = new char[n / 2];
        }

        for (int i = 0; i < palavra.length(); i++) {
            if (i % 2 == 0) {
                letrasPares[i / 2] = palavra.charAt(i);
            } else {
                letrasImpares[i / 2] = palavra.charAt(i);
            }
        }

        for (int i = 0; i < letrasPares.length; i++) {
            palavraEmbaralhada += letrasPares[i];
        }

        for (int i = 0; i < letrasImpares.length; i++) {
            palavraEmbaralhada += letrasImpares[i];
        }

        return palavraEmbaralhada;
    }
}
