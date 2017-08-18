package Resolucao;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao13 {
    public void executar(){
        String artigo[] = { "O", "Um", "Algum", "Todo", "Qualquer" };
        String substantivo[] = { "menino", "homen", "cachorro", "carro", "gato" };
        String verbo[] = { "passou", "pulou", "correu", "saltou", "andou" };
        String preposicao[] = { "sobre", "sob", "ante", "ate", "com" };
        Random gerador = new Random();
        String frase = "";
        
        frase += artigo[gerador.nextInt(artigo.length)] + " ";
        frase += substantivo[gerador.nextInt(substantivo.length)] + " ";
        frase += verbo[gerador.nextInt(verbo.length)] + " ";
        frase += preposicao[gerador.nextInt(preposicao.length)] + " ";
        frase += artigo[gerador.nextInt(artigo.length)].toLowerCase() + " ";
        frase += substantivo[gerador.nextInt(substantivo.length)];
        frase += ".";
        
        
        JOptionPane.showMessageDialog(null, frase);
    }
}
