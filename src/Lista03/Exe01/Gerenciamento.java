package Lista03.Exe01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class Gerenciamento {

    private Tela tela;
    private Usuario usuario;

    public Gerenciamento() {
        tela = new Tela();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        
        tela.addCriarListener(new CriarListener());
        tela.addExcluirListener(new ExcluirListener());
        tela.addAlterarListener(new AlterarListener());
    }

    class CriarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Usuario u = new Usuario();
            u.setId(0);
            u.setNome(tela.getNome());
            u.setCPF(tela.getCPF());
            u.setEmail(tela.getEmail());
            u.setLogin(tela.getLogin());
            u.setSenha(tela.getSenha());
            new UsuarioDao().Criar(u);
            tela.limparCampos();
            tela.inserirDadosTabela(new UsuarioDao().lerTodos());
        }

    }
    
    class ExcluirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new UsuarioDao().deletar(tela.getIdUsuarioLinhaSelecionada());
            tela.inserirDadosTabela(new UsuarioDao().lerTodos());
        }
        
    }
    
    class AlterarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object[] dados = tela.getDadosLinhaSelecionada();
            
            Usuario u = new Usuario();
            u.setNome(dados[1].toString());
            u.setCPF(dados[2].toString());
            u.setEmail(dados[3].toString());
            u.setLogin(dados[4].toString());
            u.setSenha(dados[5].toString());
            
            int i = tela.getIdUsuarioLinhaSelecionada();
            
            new UsuarioDao().alterar(tela.getIdUsuarioLinhaSelecionada(), u);
            tela.inserirDadosTabela(new UsuarioDao().lerTodos());
        }
        
    }
}
