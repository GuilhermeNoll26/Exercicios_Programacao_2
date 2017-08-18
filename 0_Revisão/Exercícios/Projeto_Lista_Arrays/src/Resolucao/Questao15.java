package Resolucao;

import Modelos.Jogador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao15 {
    public void executar(){
        final int TAMANHO_TIME = 4;
        ArrayList<Jogador> listaJogadores = new ArrayList<>(TAMANHO_TIME);
        ArrayList<Jogador> listaJogadoresMaisAltosMedia = new ArrayList<>();
        Jogador maiorJogador = null;
        double soma = 0, media;
        String s = "";
        
        for(int i = 0; i < TAMANHO_TIME; i++){
            String nome = JOptionPane.showInputDialog("Digíte o nome do " + (i+1) + "º jogador !!");
            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Digíte a altura do " + (i+1) + "º jogador !!")
                            .replaceAll(",", "."));
            
            listaJogadores.add(new Jogador(nome, altura));
        }
        
        maiorJogador = listaJogadores.get(0);
        for(int i = 0; i < listaJogadores.size(); i++){
            soma += listaJogadores.get(i).getAltura();
            
            if(maiorJogador.getAltura() < listaJogadores.get(i).getAltura()){
                maiorJogador = listaJogadores.get(i);
            }
        }
        
        media = soma/listaJogadores.size();
        media = Double.parseDouble(String.format("%.2f", media).replaceAll(",", "."));
        
        for(int i = 0; i < listaJogadores.size(); i++){
            if(listaJogadores.get(i).getAltura() > media){
                listaJogadoresMaisAltosMedia.add(listaJogadores.get(i));
            }
        }
        
        s += "Jogador mais alto: " + maiorJogador.toString() + "\n";
        
        s += "Média de altura: " + media + "\n\n";
        
        s += "Jogadores mais altos que a média:\n";
        for(Jogador j: listaJogadoresMaisAltosMedia){
            s += "   " + j.toString();
        }
        
        JOptionPane.showMessageDialog(null, s);
    }
}
