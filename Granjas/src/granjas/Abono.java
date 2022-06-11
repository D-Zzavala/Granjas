package granjas;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Abono extends Siembra{
    private char formula[];
    
    public Abono() {
    super();
    this.formula = "".toCharArray();
    }

    public Abono(char[] formula, char[] Codigo, String Nombre, int Cantidad, String Tipo, float Precio) {
        super(Codigo, Nombre, Cantidad, Tipo, Precio);
        this.formula = formula;
    }

    public char[] getFormula() {
        return formula;
    }

    public void setFormula(char[] formula) {
        this.formula = formula;
    }
    
    @Override
    public String toString() {
        return "Diputado{" + super.toString() + ", formula=" + formula + '}';
    }
    
    @Override
    public void ImprimirCLI(int i){
        super.ImprimirCLI(i);
        System.out.printf("|%20s|\n",formula);
    }
    
    @Override
    public void Borde(){
        super.Borde();
        System.out.print("+--------------------+---------------+\n");
    }
    
    @Override
    public void Guardar(PrintWriter Linea){
        super.Guardar(Linea);
        Linea.print( "\t"+formula +"\n");
    }
    
    @Override
    public void Leer(int i){
        super.Leer(i);
        this.formula = JOptionPane.showInputDialog("Ingrese la formula del abono: ").toCharArray();
        
    }
    
}
