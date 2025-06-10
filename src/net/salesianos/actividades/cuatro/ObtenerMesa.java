package net.salesianos.actividades.cuatro;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ObtenerMesa {

    public static void guardarMesaEnFichero(Mesa mesa) {
        try {
            Files.write(Paths.get("files/ficherito4.txt"), (mesa.toString() + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error al guardar la mesa en el fichero: " + e.getMessage());
        }
    }

    public static List<Mesa> obtenerTodasLasMesasGuardadas() {
        List<Mesa> mesas = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get("files/ficherito4.txt"))) {
            stream.map(l -> l.split(","))
                    .forEach(a -> mesas.add(new Mesa(a[0], Integer.parseInt(a[1]))));
        } catch (IOException e) {
            System.err.println("Error al leer las mesas del fichero: " + e.getMessage());
        }
        return mesas;
    }

}

