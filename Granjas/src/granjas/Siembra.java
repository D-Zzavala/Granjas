package granjas;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Siembra extends Granja {
    //Atributos
    private char Codigo[];
    private String Nombre;
    private int Cantidad;
    private String Tipo;
    private float Precio;
    
     //Constructores
    public Siembra() {
        this.Codigo = "".toCharArray();
        this.Nombre = "";
        this.Cantidad = 0;
        this.Tipo = "";
        this.Precio = 0;
    }

    public Siembra(char[] Codigo, String Nombre, int Cantidad, String Tipo, float Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Tipo = Tipo;
        this.Precio = Precio;
    }

    public char[] getCodigo() {
        return Codigo;
    }

    public void setCodigo(char[] Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    //Otros Métodos
    @Override
    public String toString(){
        return "Persona{" + "Identidad=" + String.valueOf(Codigo) + ", Nombre=" + Nombre + ", Cantidad=" + Cantidad + ", Tipo=" + Tipo + ", Precio=" + Precio + '}';
    }

    @Override
    public void Leer(int i) {
        this.Codigo = JOptionPane.showInputDialog("Ingrese el Codigo con Guiones: ").toCharArray();
        this.Nombre = JOptionPane.showInputDialog("Ingrese el Nombre de la siembra: ");
        this.Cantidad = (int)(ValidarInt("Digite la Cantidad: ") );
        this.Tipo = JOptionPane.showInputDialog("Ingrese el Tipo de siembra: ");
        this.Precio = (float)(ValidarInt("Digite el precio: ") );
    }
    
    @Override
    public void ImprimirCLI(int i){
        System.out.printf("|%8d|%15s|%50s|%4d|%6s|%16s|",(i+1),String.valueOf(Codigo),Nombre,Cantidad,Tipo,Precio);
    }
    
    @Override
    public void Borde(){
        System.out.print("+--------+---------------+--------------------------------------------------+----+------+----------------+--------------------+");
    }
    
    @Override
    public void Guardar(PrintWriter Linea){
        Linea.print(String.valueOf(Codigo)+"\t"+Nombre+"\t"+Cantidad+"\t"+Tipo+"\t"+Precio);
    }
    
}
