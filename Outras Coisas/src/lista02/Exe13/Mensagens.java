package lista02.Exe13;

import javax.swing.JOptionPane;

/**
 *
 */
public class Mensagens {
    
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "VOCÊ ERROU!", "Jogo do clique", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Tchau !!");
//        
//        switch (JOptionPane.showConfirmDialog(null, "Boa noite?")){
//            case 0:
//                JOptionPane.showMessageDialog(null, "AInda bem que eu acertei");
//                break;
//            case 1:
//                JOptionPane.showMessageDialog(null, "Como assim não é de noite");
//                break;
//            case 2:
//                JOptionPane.showMessageDialog(null, "Cancelando...");
//                break;
//        }
//        
//        String nome = JOptionPane.showInputDialog("Digíte o seu nome:");
//        JOptionPane.showMessageDialog(null, "O seu nome é " + nome);
        
        String menu[] = {"Sim", "Não"};
        int aux = JOptionPane.showOptionDialog(null, "Desejar jogar?", "Jogo do clique", JOptionPane.YES_NO_OPTION, 
                                     JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
        
        if(aux == 0){
            JOptionPane.showMessageDialog(null, "Vamos lá");
        }else{
            JOptionPane.showMessageDialog(null, "Cancelando...");
        }
    }
}
