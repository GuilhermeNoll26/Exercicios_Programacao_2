package lista02.Exe06;

public class Executar {
    
    public static void main(String[] args) {
        View v = new View();
        Model m = new Model();
        Controller c = new Controller(v, m);
        v.setVisible(true);
    }
}
