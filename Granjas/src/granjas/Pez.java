
package granjas;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

public class Pez extends Animal{
    private String Calidad;

    public Pez() {
    }

    public Pez(String Calidad, String Raza, String Funcion, 
            char[] Codigo, JDateChooser Nacimiento, float Peso) {
        super(Raza, Funcion, Codigo, Nacimiento, Peso);
        this.Calidad = Calidad;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    @Override
    public String toString() {
        return "Pez{" + "Calidad=" + Calidad + '}';
    }
    
    
        
}
