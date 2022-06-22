package granjas;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Plaguicida extends Siembra{
    private String Aplicacion, Toxicidad;

public Plaguicida() {
    super();
    this.Aplicacion= "";
    this.Toxicidad = "";
    }

    public Plaguicida(String Aplicacion, String Toxicidad, char[] Codigo, String Nombre, int Cantidad, String Tipo, float Precio) {
        super(Codigo, Nombre, Cantidad, Tipo, Precio);
        this.Aplicacion = Aplicacion;
        this.Toxicidad = Toxicidad;
    }

    public void setAplicacion(String Aplicacion) {
        this.Aplicacion = Aplicacion;
    }

    public void setToxicidad(String Toxicidad) {
        this.Toxicidad = Toxicidad;
    }

    public String getAplicacion() {
        return Aplicacion;
    }

    public String getToxicidad() {
        return Toxicidad;
    }

    
    
@Override
    public String toString() {
        return "Empleado{" + super.toString() + ", Aplicacion=" + Aplicacion + ", Toxicidad=" +Toxicidad + '}';
    }
    
    @Override
    public void ImprimirCLI(int i){
        super.ImprimirCLI(i);
        System.out.printf("|%20s|%15s|\n",Aplicacion,Toxicidad);
    }
    
    @Override
    public void Borde(){
        super.Borde();
        System.out.print("+--------------------+---------------+\n");
    }
    
    @Override
    public void Guardar(PrintWriter Linea){
        super.Guardar(Linea);
        Linea.print( "\t"+Aplicacion + "\t" + Toxicidad +"\n");
    }
    
    @Override
    public void Leer(int i){
        super.Leer(i);
        Aplicacion = JOptionPane.showInputDialog("Ingrese el metodo de Aplicacion: ");
        Toxicidad = JOptionPane.showInputDialog("Ingrese el nivel de toxicidad del producto: ");
        
    }
}