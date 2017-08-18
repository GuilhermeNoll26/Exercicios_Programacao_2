package Resolucao;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Questao14 {

    private int assentos[] = new int[10];

    public void executar() {
        int auxiliar;
        boolean acentoReservado, fumante = false;

        do {
            auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Favor digitar 1 para \"Fumante\"\n"
                    + "Favor digitar 2 para \"Nâo fumante\""
                    + "\nPara cancelar digite -1."));
            acentoReservado = false;

            /**
             * Testa se todos os acentos estão todos ocupados, se verdadeiro,
             * para a execução do programa.
             */
            if(todosAssentoOcupados()){
                JOptionPane.showMessageDialog(null, "Todos os acentos do avião estão ocupados !!");
                break;
            }
            /**
             * Se for digitado -1, o break para o a execução do doWhile.
             */
            if (auxiliar == -1) {
                break;
            }
            
            /**
             * Se não for digitado um valor válido, mostra mensagem e volta 
             * para o inicio do doWhile.
             */
            if(auxiliar != 1 && auxiliar != 2 && auxiliar != -1){
                JOptionPane.showMessageDialog(null, "Opção inválida !!");
                continue;
            }

            /**
             * Se foi digitado o 1 ou 2, tenta reservar o acento.
             */
            if(auxiliar == 1){
                fumante = true;
                acentoReservado = reservarAcento(true);
            }else if(auxiliar == 2){
                fumante = false;
                acentoReservado = reservarAcento(false);
            }
            
            /**
             * Se a tentativa de reservar o acento retornar true 
             * imprime a cartão e volta para o inicio do doWhile.
             * 
             * Se retorna false mostra mensagem customizada.
             */
            if(acentoReservado){
                imprimirCartao();
                continue;
            }else{
                String s = "Sessão dos ";
                if(auxiliar==1){
                    s += "fumantes ";
                }else if(auxiliar==2){
                    s += "não fumantes ";
                }
                s += "já esta cheia!!";
                JOptionPane.showMessageDialog(null, s);
            }

            /**
             * doWhile que fica pedindo uma confirmação ou negação 
             * válida para a opção de trocar de sessão.
             */
            do{
                auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de ir em outra sessão?\n"
                    + "Para aceitar digite 1."
                    + "\nPara não aceitar digite 2."));
                
                if(auxiliar != 1 && auxiliar != 2){
                    JOptionPane.showMessageDialog(null, "Opção inválida !!");
                }
                
                if(auxiliar==1){
                    reservarAcento( !fumante );
                    imprimirCartao();
                }else if(auxiliar==2){
                    JOptionPane.showMessageDialog(null, "O próximo voo sai em 3 horas !!");
                }
            }while(auxiliar != 1 && auxiliar != 2);
            
            
        } while (true);
    }

    /**
     * Reservar acento levando em consideração se é fumante ou não.
     *
     * @param fumante true se for fumante, false caso contrário.
     *
     * @return True se se foi possível reservar acento. false senão foi
     * possível.
     */
    private boolean reservarAcento(boolean fumante) {
        if (fumante) {
            for (int i = 0; i < 5; i++) {
                if (assentos[i] == 0) {
                    assentos[i] = 1;
                    return true;
                }
            }
            return false;
        } else {
            for (int i = 5; i < 10; i++) {
                if (assentos[i] == 0) {
                    assentos[i] = 1;
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * Imprime os assentos em tela.
     */
    private void imprimirAcentos() {
        String s = "";

        s += "_ _ _ _ _\n";
        s += "|  " + assentos[0] + "  " + assentos[1] + "  |\n";
        s += "|  " + assentos[2] + "  " + assentos[3] + "  |\n";
        s += "|          |\n";
        s += "|  " + assentos[4] + "  " + assentos[5] + "  |\n";
        s += "|  " + assentos[6] + "  " + assentos[7] + "  |\n";
        s += "|  " + assentos[8] + "  " + assentos[9] + "  |\n";
        s += "- - - - - -";

        JOptionPane.showMessageDialog(null, s);
    }

    /**
     * Imprime a cartão de confirmação do voo.
     */
    private void imprimirCartao() {
        String s = "";
        
        s += "Nome: Seu nome\n";
        s += "Data: hoje\n";
        s += "Horário: agora\n";
        
        JOptionPane.showMessageDialog(null, s);
        
        imprimirAcentos();
    }

    /**
     * Verifica se todos os acentos do avião estão cheios.
     * @return true para o avião totalmente ocupado, false caso contrário.
     */
    private boolean todosAssentoOcupados(){
        for(int i = 0; i < assentos.length; i++){
            if(assentos[i] == 0){
                return false;
            }
        }
        return true;
    }
}
