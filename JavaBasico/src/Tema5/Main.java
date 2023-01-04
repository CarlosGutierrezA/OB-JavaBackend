package Tema5;

public class Main {
    /**
     * EJERCICIO TEMA 5
     * Crear una interfaz CocheCRUD.
     * Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
     * Como métodos de CocheCRUD podemos poner:
     * save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
     * Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
     *
     */
    public static void main(String[] args) {
        CocheCRUDImpl cocheCrud = new CocheCRUDImpl();
        CocheCRUDImpl nissan = new CocheCRUDImpl("Nissan");
        CocheCRUDImpl toyota = new CocheCRUDImpl("Toyota");
        CocheCRUDImpl bmw = new CocheCRUDImpl("BMW");

        cocheCrud.save(nissan);
        cocheCrud.save(toyota);
        cocheCrud.save(bmw);

        System.out.println(cocheCrud.findAll());

        cocheCrud.delete(nissan);
    }
}