package lista02.Exe06;

import java.util.Random;

public class Model {
    
    private double n1;
    private double n2;
    private int operador;
    
    public void gerarValores(){
        Random r = new Random();
        n1 = r.nextInt(100);
        n2 = r.nextInt(100);
        operador = r.nextInt(4) + 1;
    }
    
    public double realizarOperacao(){
        if(operador == 1){
            return n1 + n2;
        }else if(operador == 2){
            return n1 - n2;
        }else if(operador == 3){
            return n1 * n2;
        }else{
            return n1 / n2;
        }
    }
    
    public double getNumero1(){
        return n1;
    }
    
    public double getNumero2(){
        return n2;
    }
    
    public int getOperador(){
        return operador;
    }
}
