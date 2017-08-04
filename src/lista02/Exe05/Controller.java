package lista02.Exe05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;
    private Model model;

    public Controller(View v, Model m) {
        view = v;
        model = m;
        view.addResultadoListener(new ResultadoListener());
    }

    class ResultadoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double[] numeros;
            double valor;
            char operador;
            try {
                numeros = view.acharNumeros();
                operador = view.acharOperador();
                
                switch (operador) {
                    case '+':
                        valor = model.somar(numeros[0], numeros[1]);
                        break;
                    case '-':
                        valor = model.subtracao(numeros[0], numeros[1]);
                        break;
                    case '*':
                        valor = model.multiplicacao(numeros[0], numeros[1]);
                        break;
                    case '/':
                        valor = model.divisao(numeros[0], numeros[1]);
                        break;
                    default:
                        valor = 0;
                }
                
                view.setResultado(valor);
                view.limparCampo();
            } catch (NumberFormatException ex) {
                view.mostrarMensagemErro("Erro: " + ex.getMessage());
                view.limparCampo();
            }
        }


        
    }

}
