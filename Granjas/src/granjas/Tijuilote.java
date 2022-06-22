package granjas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Tijuilote {

    public static void main(String[] args) {
        Frame Inicio = new Frame();
        Inicio.setDefaultCloseOperation(2);
        Inicio.setVisible(true);
    }
    
    public char Menu(){
        char Op;
        try {
            Op = JOptionPane.showInputDialog("***Menú Principal***\n"
                    + "A.-> Mostrar.\n"
                    + "B.-> Guardar.\n"
                    + "C.-> Registrar.\n"
                    + "D.-> Modificar.\n"
                    + "E.-> Eliminar.\n"
                    + "F.-> Vaciar.\n"
                    + "G.-> Salir.\n"
                    + "Su Elección Es:").toUpperCase().charAt(0);
        } catch (java.lang.NullPointerException e) {
            Op = 'G';
        } catch (java.lang.StringIndexOutOfBoundsException e){
            Op = ' ';
        }
        if(Op<'A' || Op>'G'){
            JOptionPane.showMessageDialog(null, "La Opción Ingresada es Incorrecta!!!\n"
                    + "Favor vuelva a intentarlo!!!");
            Op = Menu();
        }        
        return Op;
    }
    
        public char SubMenu(){
        char Op = JOptionPane.showInputDialog("a.-> Empleado.\n"
                + "b.->Socio .\n"
                + "c.-> Abono.\n"
                + "d.-> Plaguicida.\n"
                + "e.-> Cultivo.\n"
                + "f.-> Ave.\n"
                + "g.-> Pez.\n"
                + "h.-> Mamifero.\n"
                + "i.-> Leche de Empaquetadora.\n"
                + "j.-> Jugos de Empaquetadora.\n"
                + "k.-> Frutas de Empaquetadora.\n"
                + "l.-> Leche de Procesadora.\n"
                + "m.-> Jugos de Procesadora.\n"
                + "n.-> Total de Egresos.\n"
                + "o.-> TOtal de Ingresos.\n"
                + "p.-> Regresar al Menú Anterior.\n"
                + "Su Elección Es:").toLowerCase().charAt(0);
        
        if(Op<'a' || Op>'p'){
            JOptionPane.showMessageDialog(null, "La Opción Ingresada es Incorrecta!!!\n"
                    + "Favor vuelva a intentarlo!!!");
            Op = SubMenu();
        }
        return Op;
    }
    
    public void Guardar(Granja A[],char Op)throws IOException{
        String Nombre = "Granja.xls";
        switch (Op) {
            case 'a':
                Nombre = "Empleado.xls";
                break;
            case 'b':
                Nombre = "Socio.xls";
                break;
            case 'c':
                Nombre = "Abono.xls";
                break;
            case 'd':
                Nombre = "Plaguicida.xls";
                break;
            case 'e':
                Nombre = "Cultivo.xls";
                break;
            case 'f':
                Nombre = "Ave.xls";
                break;
            case 'g':
                Nombre = "Pez.xls";
                break;
            case 'h':
                Nombre = "Mamifero.xls";
                break;
            case 'i':
                Nombre = "LecheE.xls";
                break;
            case 'j':
                Nombre = "JugosE.xls";
                break;
            case 'k':
                Nombre = "FrutasE.xls";
                break;
            case 'l':
                Nombre = "LecheP.xls";
                break;
            case 'm':
                Nombre = "JugosP.xls";
                break;
            case 'n':
                Nombre = "Total Egresos.xls";
                break;
            case 'o':
                Nombre = "Total Ingresos.xls";
                break;
        }
        FileWriter Archivo = new FileWriter(Nombre);
        PrintWriter Linea = new PrintWriter(Archivo);
        
        switch (Op) {
            case 'a':
                Linea.print("Puesto\tJornada\tSalario\tIdentidad\tNombre\tCodigo\tEdad\tGenero\tCelular\tcorreo\n");                
                break;
            case 'b':
                Linea.print("Empresa\tIngresos\tPorcentaje\tIdentidad\tNombre\tCodigo\tEdad\tGenero\tCelular\tCorreo\n");
                break;
            case 'c':
                Linea.print("Formula\tCodigo\tNombre\tCantidad\tTipo\tPrecio\n");                
                break;
            case 'd':
                Linea.print("Aplicacion\tToxicidad\tCodigo\tNombre\tCantidad\tTipo\tPrecio\n");                
                break;
            case 'e':
                Linea.print("Fecha de Siembra\tFecha de Cosecha\tCodigo\tNombre\tCantidad\tTipo\tPrecio\n");                
                break;
            case 'f':
                Linea.print("Edad\tRaza\tFuncion\tCodigo\tNacimiento\tpeso\n");                
                break;
            case 'g':
                Linea.print("Calidad\tRaza\tFuncion\tCodigo\tNacimiento\tPeso\n");                
                break;
            case 'h':
                Linea.print("Edad\tRaza\tFuncion\tCodigo\tNacimiento\tPeso\n");                
                break;
            case 'i':
                Linea.print("Clasificacion\tNombre\tCodigo\tCantidad\tPrecio\tFecha de Expiracion\n");                
                break;
            case 'j':
                Linea.print("Sabor\tNombre\tCodigo\tCantidad\tPrecio\tFecha de Expiracion\n");                
                break;
            case 'k':
                Linea.print("Tipo\tTemporada\tNombre\tCodigo\tCantidad\tPrecio\tFecha de Expiracion\n");                
                break;
            case 'l':
                Linea.print("Fecha de Caducidad\tCantidad\tProductos\tIngresos\tConsumidores\n");                
                break;
            case 'm':
                Linea.print("Fecha de Caducidad\tCantidad\tProductos\tIngresos\tConsumidores\n");                
                break;
            case 'n':
                Linea.print("Egrosos Mensuales\tEgresos Semanales\tRegisto de ventas\tRegistro de Produccion\tReporte de Mantenimiento\n");                
                break;
            case 'o':
                Linea.print("Ingrosos Mensuales\tIngresos Semanales\tRegisto de ventas\tRegistro de Produccion\tReporte de Mantenimiento\n");                
                break;
           

        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] instanceof Empleado && Op=='a'   ||
               A[i] instanceof Socio && Op=='b'      ||
               A[i] instanceof Abono && Op=='c'      ||
               A[i] instanceof Plaguicida && Op=='d' ||
               A[i] instanceof Cultivo && Op=='e'    ||
               A[i] instanceof Ave && Op=='f'        ||
               A[i] instanceof Pez && Op=='g'        ||
               A[i] instanceof Mamifero && Op=='h'   ||
               A[i] instanceof LecheE && Op=='i'     ||
               A[i] instanceof JugoE && Op=='j'      ||
               A[i] instanceof FrutaE && Op=='k'     ||
               A[i] instanceof LecheP && Op=='l'     ||
               A[i] instanceof JugosP && Op=='m'     ||
               A[i] instanceof TotalEG && Op=='n'    ||
               A[i] instanceof TotalIN && Op=='o'    ){
                A[i].Guardar(Linea);
            }
        }
        Archivo.close();
    }
    
      public Granja[] Eliminar(int Pos, Granja A[]){
        Granja tmpA[];
        
        
        tmpA = new Granja[A.length-1];
          
        for (int i = 0; i < A.length; i++) {
            if(i<Pos){
                tmpA[i] = A[i];
            }else if(i>Pos){
                tmpA[i-1] = A[i];
            }
        }
        return tmpA;
    }
    
      
      
}
