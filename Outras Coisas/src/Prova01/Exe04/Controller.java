package Prova01.Exe04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Controller {
    
    private static List<Aluno> listaAlunos = new ArrayList<>();
    private Tela t;

    public Controller() {
        t = new Tela();
        t.setVisible(true);
        
        t.addSalvarListener(new SalvarListener());
    }
    
    public static List<Aluno> getListaAlunos(){
        return listaAlunos;
    }
    
    class SalvarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Aluno a = new Aluno();
            a.setMatricula(t.getMatricula());
            a.setNome(t.getNome());
            a.setSexo(t.getSexo());
            a.setDataNascimento(t.getData());
            
            listaAlunos.add(a);
            
            t.inserirDadosTabela();
            t.limparCampos();
        }
        
    }
}
