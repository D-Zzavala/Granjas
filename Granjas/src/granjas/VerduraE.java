package granjas;

import java.util.Date;

public class VerduraE extends Empaquetadora {

    private String Tipo, Temporada;

    public VerduraE() {
    }

    public VerduraE(String Tipo, String Temporada, String Nombre, char[] Codigo, int Cantidad, float Precio, Date Expiracion) {
        super(Nombre, Codigo, Cantidad, Precio, Expiracion);
        this.Tipo = Tipo;
        this.Temporada = Temporada;
    }

    @Override
    public String toString() {
        return "VerduraE{" + "Tipo=" + Tipo + ", Temporada=" + Temporada + '}';
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

}
