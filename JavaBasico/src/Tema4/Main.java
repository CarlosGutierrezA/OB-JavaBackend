package Tema4;

public class Main {
    public static void main(String[] args) {
        /*
         * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas:
         * SmartPhone y SmartWatch.
         * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
         * Generar constructor vacío y con todos los parámetros para cada clase.
         * Desde una clase Main: generaréis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
         */

        SmartPhone xiaomiRedmi10 = new SmartPhone("xiaomiRedmi10", "Xiaomi", 6.7f, 5000, 2021, 210, "Qualcom", "1005459", 6, 128, 4, 64, true, true);
        SmartWatch xiaomiBrand10 = new SmartWatch("xiaomiBrand10", "Xiaomi", 3.4f, 2500, 2020, 70, 6, 64, false, false, true, true);

        imprimirInfo(xiaomiRedmi10);
        System.out.println("Procesador: " + xiaomiRedmi10.getProcesador() +
                            "IMEI: " + xiaomiRedmi10.getImei() +
                            "\n RAM: " + xiaomiRedmi10.getMemoriaRAM() + "\n \n");
        imprimirInfo(xiaomiBrand10);
        System.out.println("Generación: " + xiaomiBrand10.getGeneracion() +
                            "\nTiene cámara: " + xiaomiBrand10.isCamara() +
                            "\nConexión bluetooth: " + xiaomiBrand10.isConexionBluetooth() +
                            "\nTiene GPS: " + xiaomiBrand10.isGps());
    }

    public static void imprimirInfo(SmartDevice smartDevice){
        System.out.println("Marca de " + smartDevice.getNombre() + ": " + smartDevice.getMarca() + "\n" +
                            "Tamaño de pantalla: " + smartDevice.getTamanio() + "\n" +
                            "Batería de: " + smartDevice.getBateria() + "mhA \n" +
                            "Almacenamiento: " + smartDevice.getAlmacenamiento() + "\n" +
                            "Año de lanzamiento: " + smartDevice.getAnioLanzamiento() + "\n" +
                            "Precio $" + smartDevice.getPrecio());
    }
}
