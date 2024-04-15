package org.example.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.model.Estante;
import org.example.repository.EstanteRepository;

import java.util.List;
@Stateless
public class EstanteService {
    @Inject
    private EstanteRepository estanteRepository;

    public List<Estante> listar() {
        return estanteRepository.listarTodasEstantes();
    }
    public void cadastrar(Estante estante) throws Exception {
        estanteRepository.cadastrar(estante);
    }
}
