package EntradaYSalidaData;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintStreamClassII {
    public static void main(String[] args) {
        //Vamos a copiar codigo de un archivo plano a otro haciendo uso de InputStream y PrintStream
        try {
            InputStream in = new FileInputStream("C://FicheroPrueba.txt");
            byte []datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("C://Destino.txt");
            out.write(datos);
            out.close();

        }catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
