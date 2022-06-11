package granjas;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class TotalEG extends RyR {
    
private float Egresosmen;
private float Egresosan;

//vacio
  public TotalEG() {
        
    }

//full
    public TotalEG(float Egresosmen, float Egresosan, Date Registrovent, Date Registropro, Date Reportesmant) {
        super(Registrovent, Registropro, Reportesmant);
        this.Egresosmen = Egresosmen;
        this.Egresosan = Egresosan;
    }

    public void setEgresosmen(float Egresosmen) {
        this.Egresosmen = Egresosmen;
    }

    public void setEgresosan(float Egresosan) {
        this.Egresosan = Egresosan;
    }

    public float getEgresosmen() {
        return Egresosmen;
    }

    public float getEgresosan() {
        return Egresosan;
    }

    @Override
    public String toString() {
        return "RyR{" + super.toString() + ", Egresosmen=" + Egresosmen + "Egresosan=" + Egresosan + '}';
    }
    
}
