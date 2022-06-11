package granjas;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class LecheP extends Procesadora{
    
private Date Caducidad;

    //vacio
    public LecheP() {
        
    }

    //full
    public LecheP(Date Caducidad, int Cantidad, String Productos, int Ingresos, String Consumidores) {
        super(Cantidad, Productos, Ingresos, Consumidores);
        this.Caducidad = Caducidad;
    }

    public void setCaducidad(Date Caducidad) {
        this.Caducidad = Caducidad;
    }

    public Date getCaducidad() {
        return Caducidad;
    }
    
    @Override
    public String toString() {
        return "Procesadora{" + super.toString() + ", Caducidad=" + Caducidad + '}';
    }


} //fin class
