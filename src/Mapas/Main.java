package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Declaramos nuestro tipo de dato especial Mapa con su respectiva Clave/Valor
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("clave1", 10);
        // Para hacer un símil, es como si tuviéramos por debajo: un array["clave1"] = 10
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave4", 40);

        System.out.println(mapa);

        //Si hacemos put sobre una clave ya creada, el valor se sobreescribe:
        mapa.put("clave3", 35);

        System.out.println(mapa);

        //Imprimir valor en concreto de nuestro Mapa:
        System.out.println(mapa.get("clave1"));

        //Actualizar un valor mediante su clave utilizando metodo mapa.replace();
        mapa.replace("clave4", 50);
        System.out.println(mapa.get("clave4"));

        //Remover una clave y valor mediante la clave utilizando el metodo mapa.remove();
        mapa.remove("clave2");
        System.out.println(mapa);

        //Recorremos un HashMap mediante el ciclo for y lo imprimimos en consola:
        mapa.put("clave2", 20);

        for(Map.Entry elemento : mapa.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }


     }
}
