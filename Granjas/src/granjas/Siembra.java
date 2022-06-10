/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granjas;

/**
 *
 * @author 50431
 */
public class Siembra {

    private String Nombre;
    private int MCub;

    public Siembra() {
    }

    public Siembra(String Nombre, int MCub) {
        this.Nombre = Nombre;
        this.MCub = MCub;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getMCub() {
        return MCub;
    }

    public void setMCub(int MCub) {
        this.MCub = MCub;
    }
    
    

}
