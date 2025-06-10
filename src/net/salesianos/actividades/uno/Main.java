package net.salesianos.actividades.uno;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String texto = Solicitador.solicitarTextoConLongitudMinima(30);
		escribirFichero("files/ficherito.txt", texto);
	}

	private static void escribirFichero(String nombreFichero, String texto) throws IOException {
		File fichero = new File(nombreFichero);
		if (!fichero.getParentFile().exists()) {
			fichero.getParentFile().mkdirs();
		}
		try (FileWriter fw = new FileWriter(fichero)) {
			fw.write(texto);
		}
	}

}

