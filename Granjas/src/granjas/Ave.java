
package granjas;

import java.util.Date;

public class Ave extends Animal {
    
   private int Edad; 

    public Ave() {
    }
   
   public Ave(int Edad, String Raza, String Funcion, char[] Codigo, Date Nacimiento, float Peso) {
        super(Raza, Funcion, Codigo, Nacimiento, Peso);
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Ave{" + "Edad=" + Edad + '}';
    }
    
    
}
