package org.example.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.model.Estante;
import org.example.service.EstanteService;

@Path("/estante")
public class EstanteController {
    @Inject
    private EstanteService estanteService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarEstantes() {
        return Response.ok(estanteService.listar()).build();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response cadastrarEstante(Estante estante) {
        try {
            estanteService.cadastrar(estante);
            return Response.status(201).entity("Estante cadastrada com sucesso!!!").build();
        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }
}
