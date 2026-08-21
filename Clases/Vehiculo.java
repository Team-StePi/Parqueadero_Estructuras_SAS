public class Vehiculo {

    private static int nextId = 1;
    private int Id;
    private String Marca;
    private String Modelo;
    private TipoVehiculo Tipo;
    public enum TipoVehiculo {
        AUTOMOVIL,
        MOTOCICLETA
    }
    private Persona Propietario;
}

public Vehiculo(String marca, String modelo, Persona propietario) {
    Id = nextId++;
    Marca = marca;
    Modelo = modelo;
    Propietario = propietario;
    Tipo = TipoVehiculo;
}

public int getId() {
    return Id;
}

public String getMarca() {
    return Marca;
}

public String getModelo() {
    return Modelo;
}

public Persona getPropietario() {
    return Propietario;
}

public TipoVehiculo getTipo() {
    return Tipo;
}

public void setMarca(String marca) {
    Marca = marca;
}

public void setModelo(String modelo) {
    Modelo = modelo;
}

public void setPropietario(Persona propietario) {
    Propietario = propietario;
}

public void setTipo(TipoVehiculo tipo) {
    Tipo = tipo;
}