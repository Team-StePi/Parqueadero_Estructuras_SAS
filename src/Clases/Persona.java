package src.Clases;

public class Persona {

    private static int nextId = 1;
    private int Id;
    private String Nombre;
    private String Cedula;


    public Persona(String nombre, String cedula) {
        Id = nextId++;
        Nombre = nombre;
        Cedula = cedula;
    }


    public static int getNextId() {
        return nextId;
    }


    public static void setNextId(int nextId) {
        Persona.nextId = nextId;
    }


    public int getId() {
        return Id;
    }


    public void setId(int id) {
        Id = id;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getCedula() {
        return Cedula;
    }


    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    
}