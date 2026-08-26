package src.Clases;

public class Planes {

    private static int nextId = 1;
    private int Id;
    private TipoPlan Nombre;
    private double Precio;
    private double Descuento;

    public enum TipoPlan {
        QUINCENAL,
        MENSUAL,
        TRIMESTRAL
    }

    public Planes(TipoPlan nombre, double precio, double descuento) {
        Id = nextId++;
        Nombre = nombre;
        Precio = precio;
        Descuento = descuento;
    }

    public int getId() {
        return Id;
    }

    public TipoPlan getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setNombre(TipoPlan nombre) {
        Nombre = nombre;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }
}