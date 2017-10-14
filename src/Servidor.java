
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


/**
 * Clase cliente correspondiente l servidor encargado de realizar la instancia de la clase remota.
 */
public class Servidor {

    public static void main(String[] args) throws Exception {
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
