package Tema3;

public class ConcatenarTextos {

    /**
     * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima
     * el resultado final por consola.
     * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
     * String[] nombres = {"", "", "", ""}
     *
     */
    public static void main(String[] args) {

        String[] nombres = {"Carlos", "Richard", "Juan", "Luis", "Pepe", "Santiago", "Pedro"};
        System.out.println(concatenar(nombres));
    }

    public static String concatenar(String[] nombres){
        StringBuilder nombresConcat = new StringBuilder();
        for (int i = 0; i < nombres.length; i++) {
            if (i == nombres.length-1) {
                nombresConcat.append("y ").append(nombres[i]);
                break;
            }
            nombresConcat.append(nombres[i]).append(", ");
        }
        return nombresConcat.toString();
    }
}
