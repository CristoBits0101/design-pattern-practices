package com.patterns.behavior.strategy.services;

import java.util.ArrayList;

public class UsuariosMemoria {

    private ArrayList<String> usuarios = new ArrayList<>();

    public void crear(String nombre) {
        usuarios.add(nombre);
        System.out.println("Usuario " + nombre + " creado.");
    }

    public ArrayList<String> listar(String nombre) {
        return usuarios;
    }

}