package granjas;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Persona extends Granja{
    //Atributos
    private char Identidad[];
    private String Nombre;
    private char Codigo[];
    private short Edad;
    private char Genero;
    private char Celular[];
    private String Correo;

     //Constructores
    public Persona() {
        this.Identidad = "".toCharArray();
        this.Nombre = "";
        this.Codigo = "".toCharArray();
        this.Edad = 0;
        this.Genero = ' ';
        this.Celular = "".toCharArray();
        this.Correo = "";
    }
    
    public Persona(char[] Identidad, String Nombre, char[] Codigo, short Edad, char Genero, char[] Celular, String Correo) {
        this.Identidad = Identidad;
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Celular = Celular;
        this.Correo = Correo;
    }

    public char[] getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(char[] Identidad) {
        this.Identidad = Identidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char[] getCodigo() {
        return Codigo;
    }

    public void setCodigo(char[] Codigo) {
        this.Codigo = Codigo;
    }

    public short getEdad() {
        return Edad;
    }

    public void setEdad(short Edad) {
        this.Edad = Edad;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public char[] getCelular() {
        return Celular;
    }

    public void setCelular(char[] Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
        //Otros Métodos
    @Override
    public String toString(){
        return "Persona{" + "Identidad=" + String.valueOf(Identidad) + ", Nombre=" + Nombre + ", Codigo=" + String.valueOf(Codigo) + ", Edad=" + Edad + ", Genero=" + Genero + ", Celular=" + String.valueOf(Celular) + ", Correo=" + Correo + '}';
    }

    @Override
    public void Leer(int i) {
        this.Identidad = JOptionPane.showInputDialog("Ingrese el Número de Identidad con Guiones: ").toCharArray();
        this.Nombre = JOptionPane.showInputDialog("Ingrese el Nombre Completo: ");
        this.Codigo = JOptionPane.showInputDialog("Ingrese el Codigo de Empleado con Guiones: ").toCharArray();
        this.Edad = (short)(ValidarInt("Digite la Edad: ") );
        this.Genero = ValidarGen( getNombre() );
        this.Celular = JOptionPane.showInputDialog("Ingrese el Número de Celular con Guiones: ").toCharArray();
        this.Correo = ValidarCorreo( getNombre() );
    }
    
    @Override
    public void ImprimirCLI(int i){
        System.out.printf("|%8d|%15s|%16s|%50s|%4d|%6s|%16s|%20s|",(i+1),String.valueOf(Identidad),Nombre,String.valueOf(Codigo),Edad,Genero,String.valueOf(Celular),Correo);
    }
    
    @Override
    public void Borde(){
        System.out.print("+--------+---------------+--------------------------------------------------+----+------+----------------+--------------------+");
    }
    
    @Override
    public void Guardar(PrintWriter Linea){
        Linea.print(String.valueOf(Identidad)+"\t"+Nombre+"\t"+String.valueOf(Codigo)+"\t"+Edad+"\t"+Genero+"\t"+String.valueOf(Celular)+"\t"+Correo);
    }
    
}
