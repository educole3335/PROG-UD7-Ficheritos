package net.salesianos.actividades.uno;
import java.util.Scanner;

public class Solicitador {

        public static String solicitarTextoConLongitudMinima(int longitudMinima) {
        Scanner sc = new Scanner(System.in);
        String texto;
        do {
            System.out.print("Introduce texto con longitud minima de " + longitudMinima + " caracteres: ");
            texto = sc.nextLine();
            if (texto.length() < longitudMinima) {
                System.out.println("El texto debe tener al menos " + longitudMinima + " caracteres. Te faltan " + (longitudMinima - texto.length()));
            }
        } while (texto.length() < longitudMinima);
        sc.close();
        return texto.toUpperCase().replace(" ", "_");

    }
}

