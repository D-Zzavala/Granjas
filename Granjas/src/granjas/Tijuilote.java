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
                Linea.print("Egresos Mensuales\tEgresos Semanales\tRegisto de ventas\tRegistro de Produccion\tReporte de Mantenimiento\n");                
                break;
            case 'o':
                Linea.print("Ingresos Mensuales\tIngresos Semanales\tRegisto de ventas\tRegistro de Produccion\tReporte de Mantenimiento\n");                
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
    
          public char MenuModificarEmpleado() {
        char Op;

        Op = JOptionPane.showInputDialog("***Menú Modificar***\n"
                + "a.-> Puesto.\n"
                + "b.-> Jornada.\n"
                + "c.-> Salario.\n"
                + "d.-> Identidad.\n"
                + "e.-> Nombre.\n"
                + "f.-> Codigo.\n"
                + "g.-> Edad.\n"
                + "h.-> Genero.\n"
                + "i.-> Celular.\n"
                + "j.-> Correo.\n"
                + "Su Elección Es:").toLowerCase().charAt(0);

        if (Op < 'a' || Op > 'j') {
            JOptionPane.showMessageDialog(null, "La Opción Ingresada NO Existe!!!\n"
                    + "Favor Vuelva a Intentarlo!!!");
            Op = MenuModificarEmpleado();
        }
        return Op;
    }
      
      public Empleado Modificar(Empleado P) {
        char OpMod;
        
        OpMod = MenuModificarEmpleado();
        switch (OpMod) {
            case 'a':
                P.setPuesto(JOptionPane.showInputDialog("Ingrese el Nuevo Puesto de " + P.getNombre() + ": "));           
                break;
            case 'b':
                P.setJornada(JOptionPane.showInputDialog("Ingrese la Nueva Jornada de " + P.getNombre() + ": "));
                break;
            case 'c':
                P.setSalario((JOptionPane.showInputDialog("Ingrese el Nuevo Salario de " + P.getNombre() + ": ")));
                break;
            case 'd':
                P.setIdentidad(JOptionPane.showInputDialog("Ingrese la Nueva Identidad de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'e':
                P.setNombre(JOptionPane.showInputDialog("Ingrese el Nuevo Nombre de " + P.getNombre() + ": "));
                break;
            case 'f':
                P.setCodigo(JOptionPane.showInputDialog("Ingrese el Nuevo Codigo de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'g':
                P.setNombre(JOptionPane.showInputDialog("Ingrese la Nueva Edad de " + P.getNombre() + ": "));
                break;
            case 'h':
                P.setGenero(P.ValidarGen(P.getNombre()));
                break;
            case 'i':
                P.setCelular(JOptionPane.showInputDialog("Ingrese el Nuevo Celular de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'j':
                P.setCorreo(P.ValidarCorreo(P.getNombre()));
                break;
        }
        return P;
    }
      
      public char MenuModificarSocio() {
        char Op;

        Op = JOptionPane.showInputDialog("***Menú Modificar***\n"
                + "a.-> Empresa.\n"
                + "b.-> Ingresos.\n"
                + "c.-> POrcentaje.\n"
                + "d.-> Identidad.\n"
                + "e.-> Nombre.\n"
                + "f.-> Codigo.\n"
                + "g.-> Edad.\n"
                + "h.-> Genero.\n"
                + "i.-> Celular.\n"
                + "j.-> Correo.\n"
                + "Su Elección Es:").toLowerCase().charAt(0);

        if (Op < 'a' || Op > 'j') {
            JOptionPane.showMessageDialog(null, "La Opción Ingresada NO Existe!!!\n"
                    + "Favor Vuelva a Intentarlo!!!");
            Op = MenuModificarSocio();
        }
        return Op;
    }
      
      public Socio Modificar(Socio P) {
        char OpMod;
        
        OpMod = MenuModificarSocio();
        switch (OpMod) {
            case 'a':
                P.setEmpresa(JOptionPane.showInputDialog("Ingrese la Nueva Empresa de " + P.getNombre() + ": "));           
                break;
            case 'b':
                P.setIngreso((JOptionPane.showInputDialog("Ingrese los Nuevos Ingresos de " + P.getNombre() + ": ")));
                break;
            case 'c':
                P.setPorcentaje((JOptionPane.showInputDialog("Ingrese el Nuevo Porcentaje de " + P.getNombre() + ": ")));
                break;
            case 'd':
                P.setIdentidad(JOptionPane.showInputDialog("Ingrese la Nueva Identidad de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'e':
                P.setNombre(JOptionPane.showInputDialog("Ingrese el Nuevo Nombre de " + P.getNombre() + ": "));
                break;
            case 'f':
                P.setCodigo(JOptionPane.showInputDialog("Ingrese el Nuevo Codigo de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'g':
                P.setNombre(JOptionPane.showInputDialog("Ingrese la Nueva Edad de " + P.getNombre() + ": "));
                break;
            case 'h':
                P.setGenero(P.ValidarGen(P.getNombre()));
                break;
            case 'i':
                P.setCelular(JOptionPane.showInputDialog("Ingrese el Nuevo Celular de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'j':
                P.setCorreo(P.ValidarCorreo(P.getNombre()));
                break;
        }
        return P;
    }
      
     public char MenuModificarAbono() {
        char Op;

        Op = JOptionPane.showInputDialog("***Menú Modificar***\n"
                + "a.-> Formula.\n"
                + "b.-> Codigo.\n"
                + "c.-> Nombre.\n"
                + "d.-> Cantidad.\n"
                + "e.-> Tipo.\n"
                + "f.-> Precio.\n"
                + "Su Elección Es:").toLowerCase().charAt(0);

        if (Op < 'a' || Op > 'f') {
            JOptionPane.showMessageDialog(null, "La Opción Ingresada NO Existe!!!\n"
                    + "Favor Vuelva a Intentarlo!!!");
            Op = MenuModificarAbono();
        }
        return Op;
    }
      
      public Abono Modificar(Abono P) {
        char OpMod;
        
        OpMod = MenuModificarAbono();
        switch (OpMod) {
            case 'a':
                P.setFormula(JOptionPane.showInputDialog("Ingrese la Nueva Formula de " + P.getNombre() + ": ").toCharArray());           
                break;
            case 'b':
                P.setCodigo(JOptionPane.showInputDialog("Ingrese el Nuevo Codigo de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'c':
                P.setNombre(JOptionPane.showInputDialog("Ingrese el Nuevo Nombre de " + P.getNombre() + ": "));
                break;
            case 'd':
                P.setCantidad((JOptionPane.showInputDialog("Ingrese la Nueva Cantidad de " + P.getNombre() + ": ")));
                break;
            case 'e':
                P.setTipo(JOptionPane.showInputDialog("Ingrese el Nuevo Tipo de " + P.getNombre() + ": "));
                break;
            case 'f':
                P.setPrecio((JOptionPane.showInputDialog("Ingrese el Nuevo Precio de " + P.getNombre() + ": ")));
                break;
        }
        return P;
    } 
      
     public char MenuModificarPlaguicida() {
        char Op;

        Op = JOptionPane.showInputDialog("***Menú Modificar***\n"
                + "a.-> Aplicacion.\n"
                + "b.-> Toxicidad.\n"
                + "c.-> Codigo.\n"
                + "d.-> Nombre.\n"
                + "e.-> Cantidad.\n"
                + "f.-> Tipo.\n"
                + "g.-> Precio.\n"
                + "Su Elección Es:").toLowerCase().charAt(0);

        if (Op < 'a' || Op > 'f') {
            JOptionPane.showMessageDialog(null, "La Opción Ingresada NO Existe!!!\n"
                    + "Favor Vuelva a Intentarlo!!!");
            Op = MenuModificarPlaguicida();
        }
        return Op;
    }
      
      public Plaguicida Modificar(Plaguicida P) {
        char OpMod;
        
        OpMod = MenuModificarPlaguicida();
        switch (OpMod) {
            case 'a':
                P.setAplicacion(JOptionPane.showInputDialog("Ingrese la Nueva Aplicacion de " + P.getNombre() + ": "));           
                break;
            case 'b':
                P.setToxicidad(JOptionPane.showInputDialog("Ingrese el Nuevo Toxicidad de " + P.getNombre() + ": "));
                break;
            case 'c':
                P.setCodigo(JOptionPane.showInputDialog("Ingrese el Nuevo Codigo de " + P.getNombre() + ": ").toCharArray());
                break;
            case 'd':
                P.setNombre(JOptionPane.showInputDialog("Ingrese el Nuevo Nombre de " + P.getNombre() + ": "));
                break;
            case 'e':
                P.setCantidad((JOptionPane.showInputDialog("Ingrese la Nueva Cantidad de " + P.getNombre() + ": ")));
                break;
            case 'f':
                P.setTipo(JOptionPane.showInputDialog("Ingrese el Nuevo Tipo de " + P.getNombre() + ": "));
                break;
            case 'g':
                P.setPrecio((JOptionPane.showInputDialog("Ingrese el Nuevo Precio de " + P.getNombre() + ": ")));
                break;                
        }
        return P;
    } 
      
}
