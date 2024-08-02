package com.cursoJava.curso.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private long id;
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    private String password;
}
