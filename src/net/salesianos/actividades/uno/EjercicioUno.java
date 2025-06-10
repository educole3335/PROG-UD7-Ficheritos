package net.salesianos.actividades.uno;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioUno {
    public class Solicitador {

        public static String solicitarTextoConLongitudMinima(int longitudMinima) {
            Scanner sc = new Scanner(System.in);
            String texto;
            do {
                System.out.print("Introduce texto con longitud minima de " + longitudMinima + " caracteres: ");
                texto = sc.nextLine();
                if (texto.length() < longitudMinima) {
                    System.out.println("El texto debe tener al menos " + longitudMinima + " caracteres. Te faltan "
                            + (longitudMinima - texto.length()));
                }
            } while (texto.length() < longitudMinima);
            sc.close();
            return texto.toUpperCase().replace(" ", "_");

        }
    }

    public static void crearYEscribirArchivo() throws IOException {
        String texto = Solicitador.solicitarTextoConLongitudMinima(30);
        escribirFichero("files/ficherito.txt", texto);
    }

    public static void escribirFichero(String nombreFichero, String texto) throws IOException {
        File fichero = new File(nombreFichero);
        if (!fichero.getParentFile().exists()) {
            fichero.getParentFile().mkdirs();
        }
        try (FileWriter fw = new FileWriter(fichero)) {
            fw.write(texto);
        }
    }
}
