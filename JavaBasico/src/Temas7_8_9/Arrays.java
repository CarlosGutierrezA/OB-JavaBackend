package Temas7_8_9;

public class Arrays {
    public static void main(String[] args) {

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] stringArray = {"String1", "String2", "String3", "String4"};
        for (String element : stringArray) {
            System.out.println(element);
        }
        System.out.println("\n");

        /*Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor
          de cada elemento en ambas dimensiones.*/
        int[][] intArray = {{0, 1, 2},{7, 8, 9}};
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("Fila [" + i + "] Columna [" + j + "] = " + intArray[i][j]);
            }
            System.out.println("\n");
        }
    }
}
