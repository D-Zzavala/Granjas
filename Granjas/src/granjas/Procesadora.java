
package granjas;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Procesadora extends Granja{
    
private int Cantidad;
private String Productos;
private int Ingresos;
private String Consumidores;

//contructor vacio
    public Procesadora() {
        this.Cantidad = 0;
        this.Productos = "";
        this.Ingresos = 0;
        this.Consumidores = "";
    }//fin
    
//contructor full
    public Procesadora(int Cantidad, String Productos, int Ingresos, String Consumidores) {
        this.Cantidad = Cantidad;
        this.Productos = Productos;
        this.Ingresos = Ingresos;
        this.Consumidores = Consumidores;
    }//fin

    //setters
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setProductos(String Productos) {
        this.Productos = Productos;
    }

    public void setIngresos(int Ingresos) {
        this.Ingresos = Ingresos;
    }

    public void setConsumidores(String Consumidores) {
        this.Consumidores = Consumidores;
    }

    //getters
    public int getCantidad() {
        return Cantidad;
    }

    public String getProductos() {
        return Productos;
    }

    public int getIngresos() {
        return Ingresos;
    }

    public String getConsumidores() {
        return Consumidores;
    }

    @Override
    public String toString(){
        return "Procesadora{" + ", Cantidad=" + Cantidad + ", Productos=" + Productos + ", Ingresos=" + Ingresos + ", Consumidores=" + Consumidores + '}';
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
    

    
}
