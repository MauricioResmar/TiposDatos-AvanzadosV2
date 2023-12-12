package EntradaYSalidaData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamClassIII {
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("C://FicheroPrueba.txt");
            System.out.println("Se encontro el archivo satisfactoriamente");

            try {
                byte datos[] = new byte[5];
                int dato = fichero.read(datos);
                while (dato != -1){
                    System.out.println(datos.toString());
                    dato = fichero.read(datos);
                }


            }catch (IOException e){
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error " + e.getMessage());
        }

    }
}
