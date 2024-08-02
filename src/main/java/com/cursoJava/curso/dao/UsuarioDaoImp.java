package com.cursoJava.curso.dao;

import com.cursoJava.curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements  UsuarioDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query ="FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }
}
