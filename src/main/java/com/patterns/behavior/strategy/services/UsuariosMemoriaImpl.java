package com.patterns.behavior.strategy.services;

import java.util.ArrayList;

/**
 * La función de esta clase es almacenar los usuarios y devolverlos
 */
public class UsuariosMemoriaImpl implements Usuarios {

    private ArrayList<String> usuarios = new ArrayList<>();

    @Override
    public void crear(String nombre) {
        usuarios.add(nombre);
        System.out.println("Usuario " + nombre + " creado.");
    }

    @Override
    public ArrayList<String> listar() {
        return usuarios;
    }

}
