package Tema3;

public class ConcatenarTextos {

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
