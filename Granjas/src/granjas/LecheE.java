/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granjas;

import java.util.Date;

/**
 *
 * @author 50431
 */
public class LecheE extends Empaquetadora{
    
    private String Clasificacion;

    public LecheE(String Clasificacion, String Nombre, char[] Codigo, int Cantidad, float Precio, Date Expiracion) {
        super(Nombre, Codigo, Cantidad, Precio, Expiracion);
        this.Clasificacion = Clasificacion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    @Override
    public String toString() {
        return "Leche{" + "Clasificacion=" + Clasificacion + '}';
    }
    
    
}
