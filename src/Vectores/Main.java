package Vectores;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Creación de Vector utilizados en concurrencia de datos
        Vector<Integer> vector = new Vector<>(50, 15);
        //Metodo para agregar datos al vector según el tipo de dato
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        vector.add(12);
        System.out.println("Datos del vector: " + vector);

        //Metodo para remover datos del vector según su posición empezando por la posición 0
        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        //Metodos para calcular el tamaño del vector y su capacidad
        System.out.println("Vector tamano: " + vector.size() + " Y capacidad: " + vector.capacity());

        //Comparar vectores
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales: " + resultado);

        //Atravesar un vector con 4 elementos:
        Vector<Integer> vector3 = new Vector<>();
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        vector3.add(4);

        for (int i: vector3){
            System.out.println("Valor del vector3: " + i);
        }

        for(int i = 0; i < vector3.size(); i++){
            System.out.println("Valor del vector3 es: " + vector3.get(i) + " en posicion: " + i);
        }

        //Metodo para hacer que el vector decrezca
        Vector<Integer> vector4 = new Vector<>(16);
        vector4.add(1);
        vector4.add(2);
        vector4.add(3);
        vector4.add(4);

        System.out.println("Capacidad de vector4: " + vector4.capacity() + " Tamano: " + vector4.size() );
        vector4.trimToSize();
        System.out.println("Capacidad de vector4: " + vector4.capacity() + " Tamano: " + vector4.size() );

    }
}
