package Lista01;

/**
 *
 * @author Tiago Funk
 */
public class Exe11 {
    
    private String nome;
    private int fome;
    private int saude;
    private int idade;
    private int humor;

    public void calcularHumor(){
        humor = (int) (saude - fome - 0.1*idade);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSaúde() {
        return saude;
    }

    public void setSaúde(int Saúde) {
        this.saude = Saúde;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int Idade) {
        this.idade = Idade;
    }
    
    
}
