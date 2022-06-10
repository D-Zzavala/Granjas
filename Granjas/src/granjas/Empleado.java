/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granjas;

import java.util.ArrayList;

/**
 *
 * @author 50431
 */
public class Empleado extends Persona {

    private String Cargo;
    private float Sueldo;
    private ArrayList Empleado= new ArrayList();

    public Empleado() {
    }

    public Empleado(String Cargo, float Sueldo, String Nombre, String Apellido, int ID, int Celular) {
        super(Nombre, Apellido, ID, Celular);
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    public ArrayList getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(ArrayList Empleado) {
        this.Empleado = Empleado;
    }

}
