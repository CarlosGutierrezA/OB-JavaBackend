package Tema4;

public class SmartDevice {
    String marca;
    String nombre;
    float tamanio;
    int bateria;
    double anioLanzamiento;
    float precio;
    int almacenamiento;

    //Const
    public SmartDevice() {}

    public SmartDevice(String nombre, String marca, float tamanio, int bateria, double anioLanzamiento, float precio) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.bateria = bateria;
        this.anioLanzamiento = anioLanzamiento;
        this.precio = precio;
    }

    //Meth
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamanio() {
        return tamanio;
    }
    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public double getAnioLanzamiento() {
        return anioLanzamiento;
    }
    public void setAnioLanzamiento(double anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
