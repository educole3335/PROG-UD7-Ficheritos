import java.io.File;
import java.util.Scanner;
import net.salesianos.actividades.cuatro.GestorMesas;
import net.salesianos.actividades.cuatro.Mesa;
import net.salesianos.actividades.dos.EjercicioDos;
import net.salesianos.actividades.tres.EjercicioTres;
import net.salesianos.actividades.uno.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        EjercicioUno.crearYEscribirArchivo();
        EjercicioDos.mostrarContenidoFicheroConDecimal("files/ficherito2.txt", System.out);
        EjercicioTres.combinarFicheros(new File("files/ficherito.txt"), new File("files/ficherito2.txt"), new File("files/ficherito3.txt"));
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el color de la mesa: ");
                    String color = sc.nextLine();
                    System.out.print("Introduce el número de patas: ");
                    int patas = sc.nextInt();
                    sc.nextLine();
                    
                    Mesa nuevaMesa = new Mesa(color, patas);
                    GestorMesas.guardarMesa(nuevaMesa);
                    System.out.println("Mesa guardada con éxito.");
                }

                case 2 -> {
                    System.out.println("\n--- Mesas almacenadas ---");
                    for (Mesa m : GestorMesas.obtenerMesas()) {
                        System.out.println(m);
                    }
                }

                case 0 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

      
