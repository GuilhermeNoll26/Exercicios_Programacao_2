package Prova01.Exe01;

import javax.swing.JOptionPane;

/**
 *
 */
public class Principal {
    
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Queijo Parmessão", 1);
        p1.adicionaIngrediente("Queijo Cheddar", 1);
        
        Pizza p2 = new Pizza("Queijo Parmessão", 2);
        p2.adicionaIngrediente("Queijo Cheddar", 2);
        p2.adicionaIngrediente("Mussarela", 2);
        p2.adicionaIngrediente("Calabresa", 2);
        
        Pizza p3 = new Pizza("Queijo Parmessão", 2);
        p3.adicionaIngrediente("Queijo Cheddar", 2);
        p3.adicionaIngrediente("Mussarela", 2);
        p3.adicionaIngrediente("Calabresa", 2);
        p3.adicionaIngrediente("Cebola", 2);
        p3.adicionaIngrediente("Frango", 2);
        p3.adicionaIngrediente("Carne", 2);
        
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarPizza(p1);
        c.adicionarPizza(p2);
        c.adicionarPizza(p3);
        
        System.out.println("Preço da compra: " + c.getValorTotal());
        
        System.out.println(Pizza.ImprimirQuantidades());
    }
}
