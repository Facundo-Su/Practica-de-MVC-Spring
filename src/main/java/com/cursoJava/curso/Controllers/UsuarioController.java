package com.cursoJava.curso.Controllers;

import com.cursoJava.curso.dao.UsuarioDao;
import com.cursoJava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController  implements UsuarioDao {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("kirigaya");
        usuario.setApellido("kazuto");
        usuario.setMail("xdanime2001@gmail.com");
        usuario.setTelefono("123123123123");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(12);
        usuario.setNombre("kirigaya");
        usuario.setApellido("kazuto");
        usuario.setMail("xdanime2001@gmail.com");
        usuario.setTelefono("123123123123");

        Usuario usuario2 = new Usuario();
        usuario2.setId(23);
        usuario2.setNombre("asd");
        usuario2.setApellido("kazuto");
        usuario2.setMail("xdanime2001@gmail.com");
        usuario2.setTelefono("123123123123");

        Usuario usuario3 = new Usuario();
        usuario3.setId(32);
        usuario3.setNombre("asdzxc");
        usuario3.setApellido("kazuto");
        usuario3.setMail("xdanime2001@gmail.com");
        usuario3.setTelefono("123123123123");
        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuario12")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("kirigaya");
        usuario.setApellido("kazuto");
        usuario.setMail("xdanime2001@gmail.com");
        usuario.setTelefono("123123123123");

        return usuario;
    }
    @RequestMapping(value = "usuario23")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("kirigaya");
        usuario.setApellido("kazuto");
        usuario.setMail("xdanime2001@gmail.com");
        usuario.setTelefono("123123123123");

        return usuario;
    }

}
