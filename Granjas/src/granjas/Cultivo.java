package granjas;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cultivo extends Siembra{
    private Date siembra,cosecha;

    public Cultivo(Date siembra, Date cosecha) {
        this.siembra = siembra;
        this.cosecha = cosecha;
    }

    public Cultivo(Date siembra, Date cosecha, char[] Codigo, String Nombre, int Cantidad, String Tipo, float Precio) {
        super(Codigo, Nombre, Cantidad, Tipo, Precio);
        this.siembra = siembra;
        this.cosecha = cosecha;
    }

    public Date getSiembra() {
        return siembra;
    }

    public void setSiembra(Date siembra) {
        this.siembra = siembra;
    }

    public Date getCosecha() {
        return cosecha;
    }

    public void setCosecha(Date cosecha) {
        this.cosecha = cosecha;
    }
    
   @Override
    public String toString() {
        return "Diputado{" + super.toString() + ", siembra=" + siembra + ", cosecha=" + cosecha + '}';
    }
    
    @Override
    public void ImprimirCLI(int i){
        super.ImprimirCLI(i);
        System.out.printf("|%20s|%15s|\n",siembra,cosecha);
    }
    
    @Override
    public void Borde(){
        super.Borde();
        System.out.print("+--------------------+---------------+\n");
    }
    
    @Override
    public void Guardar(PrintWriter Linea){
        super.Guardar(Linea);
        Linea.print( "\t"+siembra + "\t" + cosecha +"\n");
    }
    
}
