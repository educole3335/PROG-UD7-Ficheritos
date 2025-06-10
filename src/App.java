import java.io.File;
import net.salesianos.actividades.dos.EjercicioDos;
import net.salesianos.actividades.tres.EjercicioTres;
import net.salesianos.actividades.uno.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {
        EjercicioUno.crearYEscribirArchivo();
        EjercicioDos.mostrarContenidoFicheroConDecimal("files/ficherito2.txt", System.out);
        EjercicioTres.combinarFicheros(new File("files/ficherito.txt"), new File("files/ficherito2.txt"), new File("files/ficherito3.txt"));
    }
  
}
