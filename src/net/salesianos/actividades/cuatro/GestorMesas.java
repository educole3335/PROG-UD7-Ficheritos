package net.salesianos.actividades.cuatro;
import java.io.*;
import java.util.ArrayList;

public class GestorMesas {
    private static final String FICHERO = "files/ficherito4.txt";

    // Método para guardar una mesa en el fichero
    public static void guardarMesa(Mesa mesa) {
        ArrayList<Mesa> mesas;
        try {
            mesas = obtenerMesas(); // leer existentes
            mesas.add(mesa); // añadir nueva
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
                oos.writeObject(mesas);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar mesa: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    // Método para obtener todas las mesas
    public static ArrayList<Mesa> obtenerMesas() {
        ArrayList<Mesa> mesas = new ArrayList<>();
        File file = new File(FICHERO);
        if (!file.exists()) return mesas;

        try {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO))) {
                mesas = (ArrayList<Mesa>) ois.readObject();
            }
        } catch (IOException e) {
            System.out.println("Error al leer mesas: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
        return mesas;
    }
}


