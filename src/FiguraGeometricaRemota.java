/**
 * Interfaz Remota
 * Se definiran las operaciones a realizar por las implementaciones.
 * http://ingemecanica.com/tutoriales/areas.html
 */
import java.rmi.*;

public interface FiguraGeometricaRemota extends Remote{
    
    public double volumen(double x, double y) throws RemoteException;
    public double area(double x, double y) throws RemoteException;
}
