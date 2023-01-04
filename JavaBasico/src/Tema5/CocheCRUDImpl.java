package Tema5;

import java.util.ArrayList;

public class CocheCRUDImpl implements CocheCRUD{

    private final ArrayList<CocheCRUDImpl> coches = new ArrayList<>();
    String nombre;

    //Const
    public CocheCRUDImpl() {}
    public CocheCRUDImpl(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void save(CocheCRUDImpl coche) {
        coches.add(coche);
        System.out.println("Coche " + coche.nombre + " añadido con éxito");
    }
    @Override
    public String findAll() {
        StringBuilder cochesFound = new StringBuilder();
        for (CocheCRUDImpl coch : coches) {
            cochesFound.append(coch.nombre);
        }
        return cochesFound.toString();
    }
    @SuppressWarnings("SuspiciousListRemoveInLoop")
    @Override
    public void delete(CocheCRUDImpl coche) {
        for (int i = 0; i < coches.size(); i++) {
            if (coche.nombre.equals(coches.get(i).nombre)) {
                coches.remove(i);
                System.out.println("Coche " + coches.get(i).nombre + " Eliminado con éxito");
            }
        }
    }
}