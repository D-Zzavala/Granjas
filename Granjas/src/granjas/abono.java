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
public class abono extends Siembra{

    private String Tipo;
    private int Preciolib;
    private ArrayList abono = new ArrayList();

    public abono() {
    }

    public abono(String Tipo, int Preciolib, String Nombre, int MCub) {
        super(Nombre, MCub);
        this.Tipo = Tipo;
        this.Preciolib = Preciolib;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPreciolib() {
        return Preciolib;
    }

    public void setPreciolib(int Preciolib) {
        this.Preciolib = Preciolib;
    }

    public ArrayList getAbono() {
        return abono;
    }

    public void setAbono(ArrayList abono) {
        this.abono = abono;
    }   
    
}
