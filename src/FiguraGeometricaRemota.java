/**
 * Interfaz Remota
 * Se definiran las operaciones a realizar por las implementaciones.
 * http://ingemecanica.com/tutoriales/areas.html
 */
import java.rmi.*;

public interface FiguraGeometricaRemota extends Remote{
    
    public double volumen() throws RemoteException;
    public double area() throws RemoteException;
}
