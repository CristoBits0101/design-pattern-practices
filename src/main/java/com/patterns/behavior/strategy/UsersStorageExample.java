package com.patterns.behavior.strategy;

import java.util.ArrayList;

import com.patterns.behavior.strategy.services.Usuarios;
import com.patterns.behavior.strategy.services.UsuariosFicheroImpl;
import com.patterns.behavior.strategy.services.UsuariosMemoriaImpl;

// Segundo ejemplo: el consumidor utiliza el mismo contrato para guardar usuarios.
public class UsersStorageExample {

    public static void main(String[] args) {
        // El argumento "file" selecciona la estrategia que conserva datos en usuarios.txt.
        boolean useFile = args.length > 0 && "file".equalsIgnoreCase(args[0]);
        Usuarios users = useFile ? new UsuariosFicheroImpl() : new UsuariosMemoriaImpl();

        createUser(users, "Juan");
        createUser(users, "Maria");
        createUser(users, "Pedro");

        for (String user : listUsers(users)) {
            System.out.println("Usuario: " + user);
        }
    }

    public static void createUser(Usuarios users, String name) {
        users.crear(name);
    }

    public static ArrayList<String> listUsers(Usuarios users) {
        return users.listar();
    }
}
