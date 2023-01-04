package Temas7_8_9;

public class Main {
    public static void main(String[] args) {
        /*Dada la función:
         public static String reverse(String texto) { }
         Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".*/

        System.out.println(reverse("hola mundo!"));
    }

    public static String reverse(String texto) {
        StringBuilder textoReversed = new StringBuilder(texto);
        return textoReversed.reverse().toString();
    }
}
