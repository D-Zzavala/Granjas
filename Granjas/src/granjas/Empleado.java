package granjas;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Empleado extends Persona {
    private String Puesto, Jornada;
    private int Salario;

    public Empleado() {//Constructor Vacío (Creado por el Programador)
    super();
    this.Puesto= "";
    this.Jornada = "";
    this.Salario = 0;
    }

    public Empleado(String Puesto, String Jornada, int Salario, char[] Identidad, String Nombre, char[] Codigo, short Edad, char Genero, char[] Celular, String Correo) {
        super(Identidad, Nombre, Codigo, Edad, Genero, Celular, Correo);
        this.Puesto = Puesto;
        this.Jornada = Jornada;
        this.Salario = Salario;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

@Override
    public String toString() {
        return "Empleado{" + super.toString() + ", Puesto=" + Puesto + ", Jornada=" + Jornada + ", Salario=" + Salario+ '}';
    }
    
    @Override
    public void ImprimirCLI(int i){
        super.ImprimirCLI(i);
        System.out.printf("|%20s|%15s|%10d|\n",Puesto,Jornada,Salario);
    }
    
    @Override
    public void Borde(){
        super.Borde();
        System.out.print("+--------------------+---------------+\n");
    }
    
    @Override
    public void Guardar(PrintWriter Linea){
        super.Guardar(Linea);
        Linea.print( "\t"+Puesto + "\t" + Jornada +Salario+"\n");
    }
    
    @Override
    public void Leer(int i){
        super.Leer(i);
        Puesto = JOptionPane.showInputDialog("Ingrese el puesto del Empleado "+ super.getNombre() +":");
        Jornada= JOptionPane.showInputDialog("Ingrese la jornada del Empleado "+ super.getNombre() +":");
        Salario= (int)(ValidarInt("Digite el Salario del Empleado ") );
    }
}
