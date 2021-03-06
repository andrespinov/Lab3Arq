/**
 * Implementación de la figura geométrica cono.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cono extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    /**
     * Definición del método constructor correspondiente al Cono.
     * @throws RemoteException 
     */
    Cono() throws RemoteException{
    }

    @Override
    public double volumen(double radio, double altura) throws RemoteException {
        return (Math.PI* Math.pow(radio, 2)* altura)/3;
    }

    @Override
    public double area(double radio, double altura) throws RemoteException {
        double g = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2)); //gradiante
        return Math.PI* radio*(radio + g);
    }
}
