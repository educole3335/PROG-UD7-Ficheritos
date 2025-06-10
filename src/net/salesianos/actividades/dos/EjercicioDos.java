package net.salesianos.actividades.dos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EjercicioDos {
    public static void mostrarContenidoFicheroConDecimal(String nombreFichero, Appendable out) {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(nombreFichero)));
            StringBuilder resultado = new StringBuilder();

            mostrarContenidoFicheroConDecimal(contenido, resultado);

            out.append(resultado.toString());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void mostrarContenidoFicheroConDecimal(String contenido, StringBuilder resultado) {
        for (char c : contenido.toCharArray()) {
            if (resultado.length() > 0) {
                resultado.append(", ");
            }
            resultado.append(c).append("_").append((int) c);
        }
    }
}

