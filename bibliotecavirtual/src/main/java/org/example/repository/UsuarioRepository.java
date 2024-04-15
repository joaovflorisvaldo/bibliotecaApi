package org.example.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.model.Usuario;

import java.util.List;

@Stateless
public class UsuarioRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Usuario> listarTodosUsuario() {
        String jpql = "SELECT l FROM Usuario l";
        return em.createQuery(jpql, Usuario.class).getResultList();
    }

    public Usuario buscarPorID(Integer id) {
        return em.find(Usuario.class, id);
    }

    public void cadastrar(Usuario usuario) throws Exception {
        try {
            em.persist(usuario);
        } catch (Exception ex) {
            throw new Exception("Livro não pode ser cadastrado");
        }
    }
}
