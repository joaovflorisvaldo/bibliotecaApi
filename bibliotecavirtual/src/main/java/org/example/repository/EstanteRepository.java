package org.example.repository;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.model.Estante;

import java.util.List;
@Stateless
public class EstanteRepository {
    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Estante> listarTodasEstantes() {

        String jpql = "SELECT e FROM Estante e";
        return em.createQuery(jpql, Estante.class).getResultList();
    }

    public Estante buscarPorID(Integer id) {
        return em.find(Estante.class, id);
    }

    public void cadastrar(Estante estante) throws Exception {
        try {
            em.persist(estante);
        } catch (Exception ex) {
            throw new Exception("Estante não pode ser cadastrado");
        }
    }
}
