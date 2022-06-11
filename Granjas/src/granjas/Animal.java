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
public class Animal {
    
    private float Peso, Precio;
    private String Tipo;

    public Animal() {
    }

    public Animal(float Peso, float Precio, String Tipo) {
        this.Peso = Peso;
        this.Precio = Precio;
        this.Tipo = Tipo;
    }
    
    public Animal(float Peso, float Precio, String Tipo) {
        this.Peso = Peso;
        this.Precio = Precio;
        this.Tipo = Tipo;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
