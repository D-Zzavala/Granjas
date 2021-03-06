package granjas;

import com.toedter.calendar.JDateChooser;
import java.io.PrintWriter;
import java.util.Date;

public class Animal extends Granja {
    private String Raza, Funcion;
    private char[] Codigo;
    private JDateChooser Nacimiento;
    private float Peso;

    public Animal() {
    }

    public Animal(String Raza, String Funcion, char[] Codigo, JDateChooser Nacimiento, float Peso) {
        this.Raza = Raza;
        this.Funcion = Funcion;
        this.Codigo = Codigo;
        this.Nacimiento = Nacimiento;
        this.Peso = Peso;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String Funcion) {
        this.Funcion = Funcion;
    }

    public char[] getCodigo() {
        return Codigo;
    }

    public void setCodigo(char[] Codigo) {
        this.Codigo = Codigo;
    }

    public JDateChooser getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(JDateChooser Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "Raza=" + Raza + ", Funcion=" + Funcion + ", Codigo=" + Codigo + ", Nacimiento=" + Nacimiento + ", Peso=" + Peso + '}';
    }

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
