package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Estante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer integer;

    @Column(length = 60)
    private String descricao;


    @Column(length = 120)
    private boolean estouLendo;

    @Column(length = 20)
    private String arquivo;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Livro livro;
}
