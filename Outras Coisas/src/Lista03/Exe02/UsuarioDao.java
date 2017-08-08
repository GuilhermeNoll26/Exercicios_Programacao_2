package Lista03.Exe02;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 */
public class UsuarioDao {
    
    public void criar(Usuario u){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.persist(u);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
    public void alterar(int idUsuario, Usuario u){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        em.remove(u);
        u = em.merge(u);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
    public void excluir(int idUsuario){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
        EntityManager em = emf.createEntityManager();
        
        Usuario u = em.find(Usuario.class, (long) idUsuario);
        em.remove(u);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
    public Usuario ler(int idUsuario){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
        EntityManager em = emf.createEntityManager();
        
        Usuario u = em.find(Usuario.class, idUsuario);
        
        em.close();
        emf.close();
        
        return u;
    }
    
    public List<Usuario> lerTodos(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
        EntityManager em = emf.createEntityManager();
        
        Query consulta = em.createQuery("select u from Usuario u");
        
        List<Usuario> lista = consulta.getResultList();
        
        em.close();
        emf.close();
        
        return lista;
    }
}
