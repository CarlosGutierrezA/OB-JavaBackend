package Temas7_8_9;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {
    public static void main(String[] args) {

        /*Crea un ArrayList de tipo String, con 4 elementos.
        Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.*/
        ArrayList<String> stringAL = new ArrayList<>();
        LinkedList<String> stringLL = new LinkedList<>();
        stringAL.add("Elemento 1 AL");
        stringAL.add("Elemento 2 AL");
        stringAL.add("Elemento 3 AL");
        stringAL.add("Elemento 4 AL");

        for (String elemento : stringAL) {
            stringLL.add(elemento);
        }

        for (int i = 0; i < stringAL.size(); i++) {
            System.out.println(stringAL.get(i));
            System.out.println(stringLL.get(i));
        }

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        ArrayList<Integer> intAL = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intAL.add(i);
        }

        /*A continuación, con otro bucle, recórrelo y elimina los números pares. Por último, vuelve a recorrerlo y muestra el
        ArrayList final.*/
        for (int i = 0; i < intAL.size(); i++) {
            if (intAL.get(i) % 2 == 0) {
                intAL.remove(i);
            }
            System.out.println(intAL.get(i));
        }
    }
}
