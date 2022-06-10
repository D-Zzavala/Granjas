package granjas;

import java.util.ArrayList;


public class Cultivo extends Siembra{
 
    private String Tipo;    
    private int PrecioM2;    
    private ArrayList Cultivo = new ArrayList();
    
    public Cultivo() {
    }

    public Cultivo(String Tipo, int PrecioM2) {
        this.Tipo = Tipo;
        this.PrecioM2 = PrecioM2;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPrecioM2() {
        return PrecioM2;
    }

    public void setPrecioM2(int PrecioM2) {
        this.PrecioM2 = PrecioM2;
    }

    public ArrayList getCultivo() {
        return Cultivo;
    }

    public void setCultivo(ArrayList Cultivo) {
        this.Cultivo = Cultivo;
    }

}
