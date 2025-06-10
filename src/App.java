import net.salesianos.actividades.dos.EjercicioDos;
import net.salesianos.actividades.uno.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {
        EjercicioUno.crearYEscribirArchivo();
        EjercicioDos.mostrarContenidoFicheroConDecimal("files/ficherito2.txt", System.out);
    }
  
}
