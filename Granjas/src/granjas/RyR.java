package granjas;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class RyR extends Granja{

private Date Registrovent;
private Date Registropro;
private Date Reportesmant;

//vacio

    public RyR() {
        
    }
    
    //full
    public RyR(Date Registrovent, Date Registropro, Date Reportesmant) {
        this.Registrovent = Registrovent;
        this.Registropro = Registropro;
        this.Reportesmant = Reportesmant;
    }

    //setter
    public void setRegistrovent(Date Registrovent) {
        this.Registrovent = Registrovent;
    }

    public void setRegistropro(Date Registropro) {
        this.Registropro = Registropro;
    }

    public void setReportesmant(Date reportesmant) {
        this.Reportesmant = Reportesmant;
    }

    //getter

    public Date getRegistrovent() {
        return Registrovent;
    }

    public Date getRegistropro() {
        return Registropro;
    }

    public Date getReportesmant() {
        return Reportesmant;
    }
    
   @Override
    public String toString(){
        return "RyR{" + ", Regristrovent=" + Registrovent + ", Registropro=" + Registropro + ", Reportesmant=" + Reportesmant + '}';
    }//fin

    @Override
    public void Leer(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ImprimirCLI(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Borde() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Guardar(PrintWriter Linea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


}//fin class
