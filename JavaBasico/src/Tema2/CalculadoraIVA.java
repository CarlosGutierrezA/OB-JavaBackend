package Tema2;

import java.util.Scanner;

public class CalculadoraIVA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        float precio = sc.nextFloat();
        System.out.println("Ingrese el valor porcentual del IVA (En caso de ser distinto a 19%): ");
        float iva = sc.nextFloat();

        if (iva != 0) {
            System.out.println("El precio total (IVA " + iva + "%) es de: " + calcularIVA(precio, iva));
        }else {
            System.out.println("El precio total (IVA 19%) es de: " + calcularIVA(precio));

        }
    }

    //IVA = 19% (Tomando el valor correspondiente en Colombia)
    public static float calcularIVA(float precio){
        precio += precio * 0.19f;
        return precio;
    }

    /**
     * Calcula el precio final con un IVA distinto al colombiano
     * @param precio -- precio del producto
     * @param iva -- valor porcentual del IVA en cuestión (Ej.: 14)
     * @return precio + IVA
     */
    public static float calcularIVA(float precio, float iva){
        precio += precio * (iva/100);
        return precio;
    }
}