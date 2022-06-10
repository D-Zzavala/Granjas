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
public class Socio extends Persona {
 
    private char Tipo;
    private float acciones;
    private ArrayList Socio = new ArrayList();
    
    public Socio() {
    }

    public Socio(String Nombre, String Apellido, int ID, int Celular) {
        super(Nombre, Apellido, ID, Celular);
    }

    public char getTipo() {
        return Tipo;
    }

    public void setTipo(char Tipo) {
        this.Tipo = Tipo;
    }

    public float getAcciones() {
        return acciones;
    }

    public void setAcciones(float acciones) {
        this.acciones = acciones;
    }
    
    public ArrayList getSocio() {
        return Socio;
    }

    public void setSocio(ArrayList Socio) {
        this.Socio = Socio;
    }
}
