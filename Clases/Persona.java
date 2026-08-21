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

public int getId() {
    return Id;
}

public String getNombre() {
    return Nombre;
}

public String getCedula() {
    return Cedula;
}

public void setNombre(String nombre) {
    Nombre = nombre;
}

public void setCedula(String cedula) {
    Cedula = cedula;
}
