package Tema4;

public class SmartPhone extends SmartDevice{

    String nombre;
    String procesador;
    String imei;
    int memoriaRAM;
    int almacenamiento;
    int cantidadCamaras;
    int mpxCamaraPrincipal;
    boolean dualSim;
    boolean almacenamientoExpandible;

    //Const
    public SmartPhone() {}

    public SmartPhone(String nombre, String marca, float tamanio, int bateria, double anioLanzamiento, float precio, String procesador, String imei, int memoriaRAM, int almacenamiento, int cantidadCamaras, int mpxCamaraPrincipal, boolean dualSim, boolean almacenamientoExpandible) {
        super(nombre, marca, tamanio, bateria, anioLanzamiento, precio);
        this.nombre = nombre;
        this.procesador = procesador;
        this.imei = imei;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.cantidadCamaras = cantidadCamaras;
        this.mpxCamaraPrincipal = mpxCamaraPrincipal;
        this.dualSim = dualSim;
        this.almacenamientoExpandible = almacenamientoExpandible;
    }

    //Meth
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCantidadCamaras() {
        return cantidadCamaras;
    }
    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }

    public int getMpxCamaraPrincipal() {
        return mpxCamaraPrincipal;
    }
    public void setMpxCamaraPrincipal(int mpxCamaraPrincipal) {
        this.mpxCamaraPrincipal = mpxCamaraPrincipal;
    }

    public boolean isDualSim() {
        return dualSim;
    }
    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }

    public boolean isAlmacenamientoExpandible() {
        return almacenamientoExpandible;
    }
    public void setAlmacenamientoExpandible(boolean almacenamientoExpandible) {
        this.almacenamientoExpandible = almacenamientoExpandible;
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
