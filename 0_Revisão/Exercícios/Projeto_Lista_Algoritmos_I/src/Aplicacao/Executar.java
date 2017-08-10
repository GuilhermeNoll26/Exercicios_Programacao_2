package Aplicacao;

import Resoluções.Questao01;
import Resoluções.Questao02;
import Resoluções.Questao03;
import Resoluções.Questao04;
import Resoluções.Questao05;
import Resoluções.Questao06;
import Resoluções.Questao07;
import Resoluções.Questao08;
import Resoluções.Questao09;
import Resoluções.Questao10;
import Resoluções.Questao11;
import Resoluções.Questao12;
import Resoluções.Questao13;
import Resoluções.Questao14;
import Resoluções.Questao15;
import Resoluções.Questao16;
import Resoluções.Questao17;
import Resoluções.Questao18;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago Funk
 */
public class Executar {
    
    public static void main(String[] args) {
        
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da questão para ve-la executar !!"
                    + "\nPara sair digíte -1."));
            
            switch (opcao){
                case 1:
                    Questao01 q01 = new Questao01();
                    q01.executar();
                    break;
                case 2:
                    Questao02 q02 = new Questao02();
                    q02.executar();
                    break;
                case 3:
                    Questao03 q03 = new Questao03();
                    q03.executar();
                    break;
                case 4:
                    Questao04 q04 = new Questao04();
                    q04.executar();
                    break;
                case 5:
                    Questao05 q05 = new Questao05();
                    q05.executar();
                    break;
                case 6:
                    Questao06 q06 = new Questao06();
                    q06.executar();
                    break;
                case 7:
                    Questao07 q07 = new Questao07();
                    q07.executar();
                    break;
                case 8:
                    Questao08 q08 = new Questao08();
                    q08.executar();
                    break;
                case 9:
                    Questao09 q09 = new Questao09();
                    q09.executar();
                    break;
                case 10:
                    Questao10 q10 = new Questao10();
                    q10.executar();
                    break;
                case 11:
                    Questao11 q11 = new Questao11();
                    q11.executar();
                    break;
                case 12:
                    Questao12 q12 = new Questao12();
                    q12.executar();
                    break;
                case 13:
                    Questao13 q13 = new Questao13();
                    q13.executar();
                    break;
                case 14:
                    Questao14 q14 = new Questao14();
                    q14.executar();
                    break;
                case 15:
                    Questao15 q15 = new Questao15();
                    q15.executar();
                    break;
                case 16:
                    Questao16 q16 = new Questao16();
                    q16.executar();
                    break;
                case 17:
                    Questao17 q17 = new Questao17();
                    q17.executar();
                    break;
                case 18:
                    Questao18 q18 = new Questao18();
                    q18.executar();
                    break;
                case -1:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida !!");
            }
        }while(opcao != -1);
        
    }
}
