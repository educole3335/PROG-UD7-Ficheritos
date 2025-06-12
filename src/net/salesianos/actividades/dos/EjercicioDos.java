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
        // Itera sobre cada carater del contenido del fichero
        for (char c : contenido.toCharArray()) {
            // Si no es el primer caracter, agrega una coma y un espacio
            if (resultado.length() > 0) {
                resultado.append(", ");
            }
            // Agrega el caracter y su valor numerico en decimal separado por un guion bajo
            resultado.append(c).append("_").append((int) c);
        }
    }
}


