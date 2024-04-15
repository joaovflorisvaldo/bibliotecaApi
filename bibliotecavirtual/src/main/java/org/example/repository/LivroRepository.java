package org.example.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.model.Livro;

import java.util.List;

@Stateless
public class LivroRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Livro> listarTodos() {
        String jpql = "SELECT l FROM Livro l";
        return em.createQuery(jpql, Livro.class).getResultList();
    }

    public Livro buscarPorID(Integer id) {
        return em.find(Livro.class, id);
    }

    public void cadastrar(Livro livro) throws Exception {
        try {
            em.persist(livro);
        } catch (Exception ex) {
            throw new Exception("Livro não pode ser cadastrado");
        }
    }
}
