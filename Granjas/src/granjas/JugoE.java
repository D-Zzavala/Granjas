package granjas;

import java.util.Date;

public class JugoE extends Empaquetadora{
    private String Sabor;

    public JugoE() {
    }

    public JugoE(String Sabor, String Nombre, char[] Codigo, int Cantidad, float Precio, Date Expiracion) {
        super(Nombre, Codigo, Cantidad, Precio, Expiracion);
        this.Sabor = Sabor;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    @Override
    public String toString() {
        return "Jugos{" + "Sabor=" + Sabor + '}';
    }
    
}
