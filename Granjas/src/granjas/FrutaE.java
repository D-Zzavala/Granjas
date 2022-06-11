package granjas;

import java.util.Date;

public class FrutaE extends Empaquetadora{
    private String Tipo, Temporada;

    public FrutaE() {
    }

    public FrutaE(String Tipo, String Temporada, String Nombre, char[] Codigo, int Cantidad, float Precio, Date Expiracion) {
        super(Nombre, Codigo, Cantidad, Precio, Expiracion);
        this.Tipo = Tipo;
        this.Temporada = Temporada;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }

    @Override
    public String toString() {
        return "Frutas{" + "Tipo=" + Tipo + ", Temporada=" + Temporada + '}';
    }
    
    
}
