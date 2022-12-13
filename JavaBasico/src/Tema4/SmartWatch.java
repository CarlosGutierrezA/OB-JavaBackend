package Tema4;

public class SmartWatch extends SmartDevice{

    String nombre;
    String marca;
    float precio;
    int generacion;
    int almacenamiento;
    boolean almacenamientoExpandible;
    boolean camara;
    boolean conexionBluetooth;
    boolean gps;

    //Const
    public SmartWatch() {}

    public SmartWatch(String nombre, String marca, float tamanio, int bateria, double anioLanzamiento, float precio, int generacion, int almacenamiento, boolean almacenamientoExpandible, boolean camara, boolean conexionBluetooth, boolean gps) {
        super(nombre, marca, tamanio, bateria, anioLanzamiento, precio);
        this.nombre = nombre;
        this.generacion = generacion;
        this.almacenamiento = almacenamiento;
        this.almacenamientoExpandible = almacenamientoExpandible;
        this.camara = camara;
        this.conexionBluetooth = conexionBluetooth;
        this.gps = gps;
    }

    //Meth
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getGeneracion() {
        return generacion;
    }
    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isAlmacenamientoExpandible() {
        return almacenamientoExpandible;
    }
    public void setAlmacenamientoExpandible(boolean almacenamientoExpandible) {
        this.almacenamientoExpandible = almacenamientoExpandible;
    }

    public boolean isCamara() {
        return camara;
    }
    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public boolean isConexionBluetooth() {
        return conexionBluetooth;
    }
    public void setConexionBluetooth(boolean conexionBluetooth) {
        this.conexionBluetooth = conexionBluetooth;
    }

    public boolean isGps() {
        return gps;
    }
    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String getMarca() {
        return marca;
    }
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
