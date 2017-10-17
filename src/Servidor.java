
import java.rmi.Naming;


/**
 * Clase cliente correspondiente l servidor encargado de realizar la instancia de la clase remota.
 */
public class Servidor {

    public static void main(String[] args) throws Exception {
        //Instancia de las figuras geométricas según sus tipos
        FiguraGeometricaRemota cubo = new Cubo();
        Naming.rebind("cubo", cubo);
        FiguraGeometricaRemota cilindro = new Cilindro();
        Naming.rebind("cilindro", cilindro);
        FiguraGeometricaRemota cono = new Cono();
        Naming.rebind("cono", cono);
        FiguraGeometricaRemota esfera = new Esfera();
        Naming.rebind("esfera", esfera);
    }
}
