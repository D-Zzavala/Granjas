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
public class Mamifero extends Animal{
    
    private String Ganado;

    public Mamifero() {
    }

    public Mamifero(String Ganado, float Peso, float Precio, String Tipo) {
        super(Peso, Precio, Tipo);
        this.Ganado = Ganado;
    }

    public String getGanado() {
        return Ganado;
    }

    public void setGanado(String Ganado) {
        this.Ganado = Ganado;
    }
    
}
