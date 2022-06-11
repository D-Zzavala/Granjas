package granjas;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Socio extends Persona{
    private String Empresa;
    private float Ingreso,Porcentaje;

public Socio() {
    super();
    this.Empresa= "";
    this.Ingreso = ' ';
    this.Porcentaje= ' ';
    }

    public Socio(String Empresa, float Ingreso, float Porcentaje, char[] Identidad, String Nombre, char[] Codigo, short Edad, char Genero, char[] Celular, String Correo) {
        super(Identidad, Nombre, Codigo, Edad, Genero, Celular, Correo);
        this.Empresa = Empresa;
        this.Ingreso = Ingreso;
        this.Porcentaje = Porcentaje;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public float getIngreso() {
        return Ingreso;
    }

    public void setIngreso(float Ingreso) {
        this.Ingreso = Ingreso;
    }

    public float getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(float Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    

@Override
    public String toString() {
        return "Empleado{" + super.toString() + ", Empresa=" + Empresa + ", Ingreso=" + Ingreso + ", Porcentaje=" + Porcentaje+ '}';
    }
    
    @Override
    public void ImprimirCLI(int i){
        super.ImprimirCLI(i);
        System.out.printf("|%20s|%15s|%10s|\n",Empresa,Ingreso,Porcentaje);
    }
    
    @Override
    public void Borde(){
        super.Borde();
        System.out.print("+--------------------+---------------+\n");
    }
    
    @Override
    public void Guardar(PrintWriter Linea){
        super.Guardar(Linea);
        Linea.print( "\t"+Empresa + "\t" + Ingreso +Porcentaje+"\n");
    }
    
    @Override
    public void Leer(int i){
        super.Leer(i);
        Empresa = JOptionPane.showInputDialog("Ingrese el puesto del Socio "+ super.getNombre() +":");
        Ingreso= (float)(ValidarInt("Digite el ingreso mensual por acciones: ") );
        Porcentaje= (float)(ValidarInt("Digite el porcentaje de ganancia ") );
    }
}
