package lista02.Exe06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;
    private Model model;

    public Controller(View v, Model m) {
        view = v;
        model = m;
        view.adicionarListenerBotaoQueroOutro(new QueroOutroListener());
        view.adicionarListenerBotaoDesisto(new DesistoListener());
        view.adicionarListenerBotaoChecar(new ChecarListener());
    }

    class QueroOutroListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double n1, n2;
            int operador;

            model.gerarValores();
            n1 = model.getNumero1();
            n2 = model.getNumero2();
            operador = model.getOperador();

            view.setValor(model.realizarOperacao());
            view.setPergunta(n1, n2, operador);
            view.setResposta("");
        }
    }

    class DesistoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setResposta("Resultado: " + model.realizarOperacao());
        }
    }

    class ChecarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (view.getValor() == view.getRespostaUsuario()) {
                    view.setResposta("Parabéns, você acertou!!");
                } else {
                    view.setResposta("Você errou");
                }
            } catch (Exception ex) {
                view.mostrarMensagem(ex.getMessage());
            }
        }
    }
}
