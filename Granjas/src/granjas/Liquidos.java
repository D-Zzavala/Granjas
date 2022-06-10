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
public class Liquidos extends Empaquetadora{
    
    private String Tipo;

    public Liquidos() {
    }

    public Liquidos(String Tipo, String Paquete) {
        super(Paquete);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
