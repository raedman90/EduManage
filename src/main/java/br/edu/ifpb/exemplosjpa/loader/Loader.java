package br.edu.ifpb.exemplosjpa.loader;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Loader implements CommandLineRunner {

    @PersistenceContext
    private final EntityManager entityManager;

    public Loader(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Diogo");
        entityManager.persist(pessoa);
    }

}
