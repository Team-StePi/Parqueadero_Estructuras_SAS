public class Persona {

    private static int nextId = 1;
    private int Id;
    private String Nombre;
    private String Cedula;
}

public Persona(String nombre, String cedula) {
    Id = nextId++;
    Nombre = nombre;
    Cedula = cedula;
}