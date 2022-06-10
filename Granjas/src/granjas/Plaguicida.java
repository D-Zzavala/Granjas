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
public class Plaguicida extends Siembra {

    private String Tipo;
    private int PrecioLit;
    private ArrayList Plag = new ArrayList();

    public Plaguicida() {
    }

    public Plaguicida(String Tipo, int PrecioLit, String Nombre, int MCub) {
        super(Nombre, MCub);
        this.Tipo = Tipo;
        this.PrecioLit = PrecioLit;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPrecioLit() {
        return PrecioLit;
    }

    public void setPrecioLit(int PrecioLit) {
        this.PrecioLit = PrecioLit;
    }

    public ArrayList getPlag() {
        return Plag;
    }

    public void setPlag(ArrayList Plag) {
        this.Plag = Plag;
    }
    
    
}
