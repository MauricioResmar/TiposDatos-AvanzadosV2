package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Resize dinámico: CapacidadVector = CapacidadVector *2;
        //
        //Resize dinámico: CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5);


        //Declaramos nuestro ArrayList:
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        System.out.println("Contenido: " + lista);

        lista.remove(2);

        System.out.println("Contenido: " + lista);

        //Recorrer el ArrayList:

        for(String nombre : lista){
            System.out.println(nombre);
        }

        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        //Convertir un tipo de dato en otro:
        String array[] = new String[lista.size()];

        //Fijémonos como en el array accedo mediante su índice y al ArrayList subyacente accedo mediante el método get.
        for(int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        for(String elemento: array){
            System.out.println("Nuevos elementos copiados al array: " + elemento);
        }

        //Otra forma de conversión:
        //lista.toArray nos devuelve un array con todos los elementos de la lista.
        //A cada iteración de ese array le asigno el Object arrayObjeto.
        //Y a cada vez que se imprime le invocamos el método .toString() para verlo claro.
        for(Object arrayObjeto : lista.toArray()){
            System.out.println("Otra forma de conversion de List a array mediante Object: " + arrayObjeto.toString());
        }

        //Creamos LinkedList y le pasamos como parametro nuestra lista tipo ArrayList:
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

    }
}
