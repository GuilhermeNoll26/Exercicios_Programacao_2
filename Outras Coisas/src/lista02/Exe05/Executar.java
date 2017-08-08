package lista02.Exe05;

public class Executar {
    
    public static void main(String[] args) {
        Model b = new Model();
        View a = new View();
        Controller c = new Controller(a, b);
        a.setVisible(true);
    }
}
