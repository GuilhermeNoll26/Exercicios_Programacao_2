package Modelos;

/**
 *
 * @author Tiago Funk
 */
public class Jogador {
    
    private String nome;
    private double altura;

    public Jogador() {
    }

    public Jogador(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", Altura=" + altura + "\n";
    }
    
}
