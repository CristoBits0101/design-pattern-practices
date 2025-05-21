package com.patterns.behavior.strategy.services;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 * La función de esta clase es almacenar los usuarios y devolverlos
 */
public class UsuariosFicheroImpl implements Usuarios{

    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFicheroImpl() {
        try {
            fichero = new PrintStream(ficheroUsuarios);
        } catch (Exception e) {
            System.err.println("Error al crear el usuario: " + e.getMessage());
        }
    }

    @Override
    public void crear(String nombre) {
        fichero.println(nombre);
    }

    @Override
    public ArrayList<String> listar() {
        ArrayList<String> usuarios = new ArrayList<>();
        try {
           Scanner scanner = new Scanner(new File(ficheroUsuarios));
            while (scanner.hasNextLine()) {
                String nombre = scanner.nextLine();
                usuarios.add(nombre);
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Error al listar los usuarios: " + e.getMessage());
        }
        return usuarios;
    }

}
