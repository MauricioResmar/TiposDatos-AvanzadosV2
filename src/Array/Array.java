package Array;

public class Array {
    public static void main(String[] args) {

    //La siguiente forma de array se utiliza cuando no sabemos de antemano que valores va a tener el array
        int arrayUno[] = new int[5];
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

     //   +---+---+---+---+---+
     //   | 0 | 1 | 2 | 3 | 4 |
     //   +---+---+---+---+---+

        for (int i: arrayUno){
            System.out.println("Array uno: " + i);
        }

        //Cuando si conocemos que valores tendrá el array

        int arrayDos[] = {1,2,3,4,5};

        for (int i: arrayDos){
            System.out.println("Array Dos: " + i);
        }

        //Cuando si conocemos que valores tendrá el array de tipo String

        String nombres[] = {
                "pepe",
                "juan",
                "Isabel",
                "Francisco"
        };

        System.out.println("Longitud del Array Tres: " + nombres.length);

        // Forma corta de recorrer un array
        for (String nombre: nombres){
            System.out.println("Nombre actual: " + nombre);
        }

        // Forma larga de recorrer un array
        String ultimoNombre = "";
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Nombre actual: " + nombres[i] + "En posicion: " + i);
            ultimoNombre = nombres[i];
        }
        System.out.println(ultimoNombre);

        //Atravesar un array mediante un while lo cual es posible pero no se usa comunmente:
        int contador = 0;
        while(contador<nombres.length){
            System.out.println("Nombre actual: " + nombres[contador] + "En posicion: " + contador + " mediante while");
            contador ++;
        }

        //Array bidimensional

        int arrayBidi[][] = new int[2][4];

        // primera fila primera columna = 1
        arrayBidi[0][0] = 1;
        // primera fila segunda columna = 2
        arrayBidi[0][1] = 2;
        // primera fila tercera columna = 3
        arrayBidi[0][2] = 3;
        // primera fila cuarta columna = 4
        arrayBidi[0][3] = 4;

        // segunda fila primera columna = 10
        arrayBidi[1][0] = 10;
        // primera fila segunda columna = 20
        arrayBidi[1][1] = 20;
        // primera fila tercera columna = 30
        arrayBidi[1][2] = 30;
        // primera fila cuarta columna = 40
        arrayBidi[1][3] = 40;

        //Primero vamos a atravesar las filas

        for(int i = 0; i < arrayBidi.length; i ++){
            System.out.println("Valor de i: " + i);

            for(int j = 0; j < arrayBidi[1].length; j++){
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

    }
}
