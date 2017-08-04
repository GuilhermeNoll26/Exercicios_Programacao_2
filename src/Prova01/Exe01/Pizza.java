package Prova01.Exe01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Pizza {
    
    private List<String> listaIngredientes = new ArrayList<>();
    private static Map<String, Integer> ingredientesUtilizados = new HashMap<>();
    
    public Pizza(String ingrediente, int quantidade){
        listaIngredientes.add(ingrediente);
        registrarIngrediente(ingrediente, quantidade);
    }
    
    public void adicionaIngrediente(String ingrediente, int quantidade){
        listaIngredientes.add(ingrediente);
        registrarIngrediente(ingrediente, quantidade);
    }
    
    public int getPreco(){
        if(listaIngredientes.size() <= 2){
            return 20;
        }else if(listaIngredientes.size() >= 3 && listaIngredientes.size() <= 5){
            return 25;
        }else{
            return 29;
        }
    }
    
    private static void registrarIngrediente(String ingrediente, int quantidade){
        if(ingredientesUtilizados.containsKey(ingrediente)){
            int qtd = ingredientesUtilizados.get(ingrediente);
            ingredientesUtilizados.put(ingrediente, quantidade + qtd);
        }else{
            ingredientesUtilizados.put(ingrediente, quantidade);
        }
    }
    
    public static String ImprimirQuantidades(){
        String mostrar = "";
        for(String s: ingredientesUtilizados.keySet()){
            mostrar += s + "  " + ingredientesUtilizados.get(s) + "\n";
        }
        return mostrar;
    }
}
