package br.edu.ifpb.exemplosjpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Avaliação {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private LocalDate data;
    private double peso;

    @OneToMany(mappedBy = "avaliacao")
    private List<Nota> notas;

    // getters e setters
}

