package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer integer;

    @Column(length = 60)
    private String titulo;


    @Column(length = 120)
    private String autor;

    @Column(length = 20)
    private String arquivo;

}
