package String;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Metodo String.length
        String cadena = "Mensaje de Texto";
        int cadenalength = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenalength);

        //Metodo para convertir cadena a Mayusculas String.toUpperCase
        String cadenaMayus = cadena.toUpperCase();
        System.out.println(cadenaMayus);

        //Metodo para convertir cadena a minusculas String.toLowerCase
        String cadenaMinus = cadena.toLowerCase();
        System.out.println(cadenaMinus);

        //Metodo para verificar si una cadena de texto, comienza por una palabra o no
        boolean resultado = cadena.startsWith("Men");
        if(resultado){
            System.out.println("Empieza por lo que estoy buscando");
        } else {
            System.out.println("No empieza por lo que quiero");
        }

        //Metodo para verificar si una cadena de texto, termina por una palabra o no
        boolean resultadoFinCadena = cadena.endsWith("xto");
        if(resultadoFinCadena){
            System.out.println("Acaba por lo que estoy buscando");
        } else {
            System.out.println("No acaba por lo que quiero");
        }

        //Metodo para obtener una letra o caracter en determinada posición:
        char letra = cadena.charAt(5);
        System.out.println(letra);

        //Metodo para recorrer una cadena mediante ciclo for y obtener cada caracter a medida que itera mediante el metodo charAt()
        String cadenafor = "Mensaje de texto for";
        //                  01234567890123456789

        for(int i=0; i<cadenafor.length(); i++){
            System.out.println("Caracter actual: " + cadenafor.charAt(i));
        }
    }
}