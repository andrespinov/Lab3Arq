/**
 * Interfaz Remota
 * Se definiran las operaciones a realizar por las implementaciones.
 */
import java.rmi.*;

public interface FiguraGeometricaRemota extends Remote{
    
    /**
     * Método para calcular el volúmen de la figura geométrica.
     * @param x: Correspondiente al lado o radio de la figura (dependiendo el tipo).
     * @param y: Correspondiente a la altura o a nada (dependiendo el tipo).
     * @return El volúmen de la figura según los valores pasados por parámetros.
     * @throws RemoteException 
     */
    public double volumen(double x, double y) throws RemoteException;
    
    /**
     * Método para calcular el área de la figura geométrica.
     * @param x: Correspondiente al lado o radio de la figura (dependiendo el tipo).
     * @param y: Correspondiente a la altura o a nada (dependiendo el tipo).
     * @return El área de la figura según los valores pasados por parámetros.
     * @throws RemoteException 
     */
    public double area(double x, double y) throws RemoteException;
}
