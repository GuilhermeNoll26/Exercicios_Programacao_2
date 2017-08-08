package Lista01;

/**
 *
 * @author Tiago Funk
 */
public class Exe10 {
    
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public void envelhecer(){
        if(idade <= 21){
            altura += 0.5;
        }
        idade++;
    }
    
    public void engordar(){
        peso++;
    } 
    
    public void emagrecer(){
        peso--;
    }
    
    public void crescer(){
        altura++;
    }
}
