package Scanner;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    boolean ok = false;
    do  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa dos numeros: ");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ok = true;
            System.out.println("Enteros son: " + a + " " + b);
            } catch (InputMismatchException e) {
            System.out.println("Numeros invalidos");
            }
        } while (!ok);
    }
}
