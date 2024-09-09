package br.edu.ifpb.exemplosjpa.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valor;
    private LocalDate dataAtribuicao;

    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    // getters e setters
}
