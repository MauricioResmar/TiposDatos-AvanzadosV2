package Errores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Error en tiempo de ejecución, dividir por zero: System.out.println(5 / 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        //Manejo de errores mediante Excepciones Try Catch Finally
        try {
            int resultado = numeroA / numeroB;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("b00m!, excepción es: " + e.getClass());
            int resultado = numeroA / 1;
        } catch (Exception e){
            System.out.println("Estoy en una Excepcion que no es Aritmetica");
        } finally {
            System.out.println("finally");
        }


    }
}
