package Errores;
import java.io.IOException;

//Generación de Excepciones mediante throw y throws
public class GeneraExcepciones {
    public static void main(String[] args) {

    /* Delegamos la gestión de la Excepción en el main, quien mediante un catch
     * captura las Excepciones Y las gestiona como sigue:
    */
     try{
         divide(4,0);
     } catch (Exception e){
         System.out.println("AAA");
     }
    }

    /* Arrojamos las Excepciones mediante throw desde el catch
    *  y las declaramos en el encabezado de la función mediante throws
    */
    public static int divide(int A, int B) throws ArithmeticException, IOException {
        int resultado = 0;
        try{
            resultado = A / B;
           } catch (ArithmeticException e){
            throw new ArithmeticException();
           }
           return resultado;
           }
    }
