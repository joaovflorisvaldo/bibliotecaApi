package org.example.service;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.model.Livro;
import org.example.repository.LivroRepository;
import java.util.*;

@Stateless
public class LivroService {
    @Inject
    private LivroRepository livroRepository;

    public List<Livro> listar() {
        return livroRepository.listarTodos();
    }
    public void cadastrar(Livro livro) throws Exception {
        livroRepository.cadastrar(livro);
    }
}
