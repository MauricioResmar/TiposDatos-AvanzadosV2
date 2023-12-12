package Vectores;
import java.util.Vector;

// 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
public class VectorString {
    public static void main(String[]  Args){

        //Instanciamos el Vector
        Vector<String> simbolos = new Vector<>(7);

        simbolos.add("Alfa");
        simbolos.add("Beta");
        simbolos.add("Gama");
        simbolos.add("Delta");
        simbolos.add("Epsilon");

        System.out.println("El valor en el vector es: " + simbolos);
        System.out.println("El tamano del Vector es de: " + simbolos.size());
        System.out.println("Y su capacidad es de: " + simbolos.capacity() + "\n");

        //Removemos el 2o y 3er elemento y muestra el resultado final.
        simbolos.remove(2);
        simbolos.remove(3);
        simbolos.trimToSize();

        System.out.println("Ahora el tamano del Vector es de: " + simbolos.size());
        System.out.println("Y su capacidad es de: " + simbolos.capacity());

        for (int i = 0; i < simbolos.size(); i++) {
            System.out.println("Y sus valores son: " + simbolos.get(i));
        }
    }
}

/*
 * 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000
 * elementos para ser añadidos al mismo.
 *
 * Respuesta: Debido a que los Vectores son dinámicos y ajustan su tamaño (Espacio en memoria) de manera
 * exponencial y en proporción a la cantidad de elementos que se vayan agregando, éste deberá hacer un
 * uso elevado de los recursos computacionales, con el fin de crear nuevos espacios en memoria, copiar los valores anteriores y agregar los nuevos,
 * lo cual después de una cierta cantidad de veces podría ralentizar considerablemente el rendimiento de la máquina
 * y la ejecución de nuestro software.
 *
 * Aquí lo ideal sería hacer un uso estricto del resize y limitarnos
 * a trabajar con la menor cantidad de datos posibles.
 */


