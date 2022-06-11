package granjas;

import java.util.Date;

public class Empaquetadora {
    private String Nombre;
    private char[] Codigo;
    private int Cantidad;
    private float Precio;
    private Date Expiracion;

    public Empaquetadora() {
    }

    public Empaquetadora(String Nombre, char[] Codigo, int Cantidad, float Precio, Date Expiracion) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Expiracion = Expiracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char[] getCodigo() {
        return Codigo;
    }

    public void setCodigo(char[] Codigo) {
        this.Codigo = Codigo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public Date getExpiracion() {
        return Expiracion;
    }

    public void setExpiracion(Date Expiracion) {
        this.Expiracion = Expiracion;
    }

    @Override
    public String toString() {
        return "Empaquetadora{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Expiracion=" + Expiracion + '}';
    }
    
    
}
