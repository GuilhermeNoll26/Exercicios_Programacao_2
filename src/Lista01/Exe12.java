package Lista01;

/**
 *
 * @author Tiago Funk
 */
public class Exe12 {
    
    private double consumo;
    private double quantTanque;
    private double quilometragem;

    public Exe12(double consumo) {
        this.consumo = consumo;
        quantTanque = 0;
    }
    
    public void andar(double entrada){
        quilometragem += entrada;
    }
    
    public double obterGasolina(){
        return quantTanque;
    }
    
    public void adicionarGasolina(double quantidade){
        quantTanque += quantidade;
    }
}
