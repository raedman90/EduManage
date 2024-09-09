package br.edu.ifpb.exemplosjpa.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataMatricula;
    private String situacao;

    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    // getters e setters
}
