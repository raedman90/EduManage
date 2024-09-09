package br.edu.ifpb.exemplosjpa.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private int anoLetivo;
    private String turno;
    private String sala;

    @ManyToMany
    @JoinTable(
            name = "turma_disciplina",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    @ManyToMany(mappedBy = "turmas")
    private List<Estudante> estudantes;

    // getters e setters
}

