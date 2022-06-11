package granjas;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class TotalIN extends RyR{
    
private float Ingresosmen;
private float Ingresosan;

//vacio
public TotalIN(){

}

//full

    public TotalIN(float Ingresosmen, float Ingresosan) {
        this.Ingresosmen = Ingresosmen;
        this.Ingresosan = Ingresosan;
    }

    public TotalIN(float Ingresosmen, float Ingresosan, Date Registrovent, Date Registropro, Date Reportesmant) {
        super(Registrovent, Registropro, Reportesmant);
        this.Ingresosmen = Ingresosmen;
        this.Ingresosan = Ingresosan;
    }

    public void setIngresosmen(float Ingresosmen) {
        this.Ingresosmen = Ingresosmen;
    }

    public void setIngresosan(float Ingresosan) {
        this.Ingresosan = Ingresosan;
    }

    public float getIngresosmen() {
        return Ingresosmen;
    }

    public float getIngresosan() {
        return Ingresosan;
    }

    @Override
    public String toString() {
        return "RyR{" + super.toString() + ", Ingresosmen=" + Ingresosmen + "Ingresosan=" + Ingresosan + '}';
    }
    

}
