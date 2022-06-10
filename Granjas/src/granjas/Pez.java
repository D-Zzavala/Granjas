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
public class Pez extends Animal {
    
    private boolean ASalada;

    public Pez() {
    }

    public Pez(boolean ASalada, float Peso, float Precio, String Tipo) {
        super(Peso, Precio, Tipo);
        this.ASalada = ASalada;
    }

    public boolean isASalada() {
        return ASalada;
    }

    public void setASalada(boolean ASalada) {
        this.ASalada = ASalada;
    }
    
    
}
