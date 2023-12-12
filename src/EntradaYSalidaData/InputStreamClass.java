package EntradaYSalidaData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamClass {

    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("C://FicheroPrueba.txt");
            System.out.println("Se encontro el archivo satisfactoriamente");

            try {
                byte[] datos = fichero.readAllBytes();
                for (byte dato : datos) {
                    System.out.println("El fichero cuenta con el siguiente dato: " + (char)dato);
                }
            }catch (IOException e){
                System.out.println("El programa da error: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No puedo leer el fichero" + e.getMessage());
        }

    }
}
