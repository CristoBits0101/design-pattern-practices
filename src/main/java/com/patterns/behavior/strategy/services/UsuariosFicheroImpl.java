package com.patterns.behavior.strategy.services;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Objects;

// Guarda usuarios sin borrar los de ejecuciones anteriores.
public class UsuariosFicheroImpl implements Usuarios {

    private final Path usersFile;

    public UsuariosFicheroImpl() {
        this(Path.of("usuarios.txt"));
    }

    public UsuariosFicheroImpl(Path usersFile) {
        this.usersFile = Objects.requireNonNull(usersFile, "El archivo es obligatorio.");
    }

    @Override
    public void crear(String nombre) {
        try {
            // Files abre y cierra el recurso. APPEND conserva el contenido existente.
            Files.writeString(usersFile, nombre + System.lineSeparator(), StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException exception) {
            throw new UncheckedIOException("No se pudo guardar el usuario.", exception);
        }
    }

    @Override
    public ArrayList<String> listar() {
        try {
            return new ArrayList<>(Files.readAllLines(usersFile, StandardCharsets.UTF_8));
        } catch (NoSuchFileException exception) {
            // Antes de guardar el primer usuario, la colección está vacía.
            return new ArrayList<>();
        } catch (IOException exception) {
            throw new UncheckedIOException("No se pudieron leer los usuarios.", exception);
        }
    }
}
