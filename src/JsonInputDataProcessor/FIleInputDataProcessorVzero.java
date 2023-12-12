package JsonInputDataProcessor;
import java.io.*;
import java.util.ArrayList;

// 9. Sorpréndenos creando un programa de tu elección que utilice InputStream,
// PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

/*  FIleInputDataProcessor V0.1
 *  La siguiente Clase Java, lee los datos almacenados en un archivo plano .txt ubicado en la raiz (C:), haciendo uso del
 *  respectivo manejo de Excepciones. Posteriormente estos datos se almacenan en un ArrayList llamado listaReg
 *  haciendo uso de un ciclo while para tomar los datos separados por coma "," mediante el metodo String.split.
 *  Luego analizamos los datos obtenidos para determinar el estado del Ph en el agua, según la muestra el programa
 *  nos dira, imprimiendo en consola: si éste es Acido o Alcalino, y generara un archivo llamado "IotDataSensorOut.txt"
 *  en la raiz (C:), con el correspondiente resultado final del análisis.
 */

public class FIleInputDataProcessorVzero {
    public static void main(String[] args) {

        //Atributos:
        String fileIn = "C://IotDataSensorIn.txt";
        String fileOut = "C://IotDataSensorOut.txt";
        int resultadoAnalisis = 0;

        //Metodos Constructores:

        int lecturaPh = inputStreamFile(fileIn, resultadoAnalisis);
        printStreamFile(fileOut, lecturaPh);
    }

    //Metodo inputStreamFile(){}
    public static int inputStreamFile (String fileIn, int resultadoAnalisis){
        try {
            FileInputStream ficheroIn = new FileInputStream(fileIn);
            System.out.println("\nSe encontro el archivo: " + fileIn + " satisfactoriamente, con los siguientes datos:\n");

            try {
                // Crear un ArrayList para almacenar los datos leídos del archivo
                ArrayList<String[]> listaReg = new ArrayList<>();

                // Crear un objeto BufferedReader para leer el archivo de manera eficiente
                BufferedReader br = new BufferedReader(new InputStreamReader(ficheroIn));

                // Leer el archivo línea por línea y agregar cada línea al ArrayList
                String linea;

                while ((linea = br.readLine()) != null) {
                    // Separar los datos de cada línea por coma y agregarlos al ArrayList
                    String[] fila = linea.split(",");

                    if (fila.length == 5) {
                        listaReg.add(fila);
                    }
                }
                // Imprimir los datos almacenados en el ArrayList:

                System.out.println("|IdSensor| |Tipo| |data| |Fecha| |Hora|\n");

                for (String[] columna : listaReg) {
                    System.out.println(columna[0] + ", " + columna[1] + ", " + columna[2] + ", " + columna[3] + ", " + columna[4]);

                    //Convertimos el respectivo campo (Ph) de String a Integer para el análisis correspondiente:
                    int valorPh = Integer.parseInt(columna[2]);

                    if (valorPh >= 7) {
                        resultadoAnalisis = resultadoAnalisis + 1;
                    } else {
                        resultadoAnalisis = resultadoAnalisis - 1;
                    }
                }

                br.close();                       //Cerramos las instancias abiertas
                ficheroIn.close();

            } catch (IOException e) {
                System.out.println("El programa da error: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No puedo leer el fichero" + e.getMessage());
        }
        return resultadoAnalisis;    //Retornamos el valor prometido por el metodo
    }

    // Metodo PrintStream(){}
    // Según sea el resultado de nuestro analisis procedemos a generar archivo "C://IotDataSensorOut.txt" con el respectivo valor
    public static void printStreamFile (String fileOut, int lecturaPh) {
        try {
            PrintStream ficheroOut = new PrintStream(fileOut);

            System.out.println("\nEl pH del agua se muestra en una escala de 0 a 14, con 7 considerado neutro. Un pH inferior a 7 es considerado acido y tiende a ser alcalino cuando es superior a 7.");

            if (lecturaPh >= 0) {
                System.out.println("\nEl ph de las muestras analizadas es mas alcalino que acido y el resultado se almaceno en: " + fileOut);
                ficheroOut.println("El Ph es mas Alcalino, el resultado de la variable analisis es: " + lecturaPh + " donde > 0 es Alcalino y < a 0 es Acido");
            } else {
                System.out.println("\nEl ph de las muestras analizadas es mas acido que alcalino y el resultado se almaceno en: " + fileOut);
                ficheroOut.println("El Ph es mas Acido, el resultado de la variable analisis es:  " + lecturaPh + " donde > 0 es Alcalino y < a 0 es Acido");
            }

            ficheroOut.close();                  //Cerramos la instancia abiertas

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
