package lista02.Exe07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class Controller {

    private Miniloteria ml;

    public Controller() {
        Miniloteria ml = new Miniloteria();
        this.ml = ml;
        ml.setVisible(true);
        ml.setLocationRelativeTo(ml);
        ml.addApostarListener(new ApostarListener());
    }
    
    class ApostarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int[] selecoes = ml.getSelecoes();
            if(checarVetor(selecoes)){
                String mostrar = "Aposta:\n\n";
                
                for(int i = 0; i < selecoes.length; i++){
                    mostrar += "Jogo " + i + ": ";
                    if(selecoes[i] == 1){
                        mostrar += "Time A vence.";
                    }else if (selecoes[i] == 2){
                        mostrar += "Empate.";
                    }else{
                        mostrar += "Time B vence.";
                    }
                    mostrar += "\n";
                }
                
                ml.LimparCampos();
                ml.mostrarMensagem(mostrar);
            }else{
                ml.mostrarMensagem("Você esqueceu de selecionar um dos jogos !!");
            }
        }
        
    }
    
    private boolean checarVetor(int[] vetor){
        for(int i : vetor){
            if(i == 0){
                return false;
            }
        }
        return true;
    }
    
}
