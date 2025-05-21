package com.patterns.behavior.strategy;

import java.util.ArrayList;

import com.patterns.behavior.strategy.services.Usuarios;
import com.patterns.behavior.strategy.services.UsuariosFicheroImpl;
import com.patterns.behavior.strategy.services.UsuariosMemoriaImpl;

public class Main {

    public static void main(String[] args) {

        Usuarios usuarios;
        boolean memoria = true;

        usuarios = memoria ? new UsuariosMemoriaImpl() : new UsuariosFicheroImpl();

        crear(usuarios, "Juan");
        crear(usuarios, "Maria");
        crear(usuarios, "Pedro");

        for (String usuario : usuarios.listar()) {
            System.out.println("Usuario: " + usuario);
        }
        
    }

    /**
     * La interface recibe la instancia de la clase que la implementa
     * 
     * @param usuario
     * @param nombre
     */
    public static void crear(Usuarios usuario, String nombre) {
        usuario.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }

}
