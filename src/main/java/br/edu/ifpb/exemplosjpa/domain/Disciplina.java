package br.edu.ifpb.exemplosjpa.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int cargaHoraria;
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Turma> turmas;

    @OneToMany(mappedBy = "disciplina")
    private List<Nota> notas;

    // getters e setters
}

