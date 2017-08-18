package Resolucao;

/**
 *
 * @author Tiago Funk
 */
public class Questao12 {
    public void executar(){
        int i = 233;
        do{
            System.out.println(i);
            if(i >= 300 && i <= 400){
                i += 3;
            }else{
                i += 5;
            }
        }while (i < 456);
    }
}
