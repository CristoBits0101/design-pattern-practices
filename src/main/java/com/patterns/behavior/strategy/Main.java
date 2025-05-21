package com.patterns.behavior.strategy;

import com.patterns.behavior.strategy.services.UsuariosMemoria;

public class Main {
    public static void main(String[] args) {
        UsuariosMemoria usuariosMemoria = new UsuariosMemoria();

        usuariosMemoria.crear("Juan");
        usuariosMemoria.crear("Maria");
        usuariosMemoria.crear("Pedro");

        for (String usuario : usuariosMemoria.listar("")) {
            System.out.println("Usuario: " + usuario);
        }
    }
}
