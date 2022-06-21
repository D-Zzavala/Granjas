package granjas;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

public class Mamifero extends Animal {
    private int Edad;

    public Mamifero() {
    }

    public Mamifero(int Edad, String Raza, String Funcion, char[] Codigo, JDateChooser Nacimiento, float Peso) {
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
        return "Mamifero{" + "Edad=" + Edad + '}';
    }

    
}
