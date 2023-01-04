package Temas7_8_9;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        /*Crea un "Vector" del tipo de dato que prefieras,
        y añádele 5 elementos. Elimina el 2o y 3.er elemento y muestra el resultado final.*/

        Vector<String> vector = new Vector();
        vector.add("Elemento1");
        vector.add("Elemento2");
        vector.add("Elemento3");
        vector.add("Elemento4");
        vector.add("Elemento5");
        System.out.println(vector);

        vector.remove("Elemento2");
        vector.remove("Elemento3");
        System.out.println(vector);

        /*Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si
        tuviésemos 1000 elementos para ser añadidos al mismo.

        R\ La capacidad por defecto del vector es de 10 espacios y cada vez que pasamos ese límite se crea otra copia del vector
        esta vez con +10 de capacidad, por lo que para añadir 1000 elementos estaríamos forzando copiar 100 veces el mismo vector
        durante la ejecución de la sentencia, malgastando así recursos de la máquina.
        */
    }
}
