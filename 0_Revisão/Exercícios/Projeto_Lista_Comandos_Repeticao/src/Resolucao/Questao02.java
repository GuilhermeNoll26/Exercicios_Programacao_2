package Resolucao;

/**
 *
 * @author Tiago Funk
 */
public class Questao02 {
    public void executar(){
        int contador = 1;
        
        for(int i = 1; i <= 300; i++){
            System.out.println(i);
        }
        
        while(contador <= 300){
            System.out.println(contador);
            contador++;
        }
        
        contador = 1;
        do{
            System.out.println(contador);
            contador++;
        }while(contador <= 300);
    }
}
