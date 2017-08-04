package Prova01.Exe01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class CarrinhoDeCompras {
    
    private List<Pizza> listaPizzas = new ArrayList<>();
    
    public void adicionarPizza(Pizza p){
        listaPizzas.add(p);
    }
    
    public int getValorTotal(){
        int valorTotal = 0;
        for(Pizza p: listaPizzas){
            valorTotal += p.getPreco();
        }
        return valorTotal;
    }
}
