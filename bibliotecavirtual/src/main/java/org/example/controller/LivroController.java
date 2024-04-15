package org.example.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.model.Livro;
import org.example.service.LivroService;

@Path("/livro")
public class LivroController {
    @Inject
    private LivroService livroService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarLivros() {
        return Response.ok(livroService.listar()).build();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response cadastrarLivro(Livro livro) {
        try {
            livroService.cadastrar(livro);
            return Response.status(201).entity("Livro cadastrado com sucesso!!!").build();
        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }
}
