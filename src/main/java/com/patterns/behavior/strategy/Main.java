package com.patterns.behavior.strategy;

import com.patterns.behavior.strategy.services.UsuariosMemoriaImpl;

public class Main {
    public static void main(String[] args) {
        UsuariosMemoriaImpl usuariosMemoria = new UsuariosMemoriaImpl();

        usuariosMemoria.crear("Juan");
        usuariosMemoria.crear("Maria");
        usuariosMemoria.crear("Pedro");

        for (String usuario : usuariosMemoria.listar()) {
            System.out.println("Usuario: " + usuario);
        }
    }
}
