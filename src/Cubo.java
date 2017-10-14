/**
 * Implementación de la figura geométrica cubo.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cubo extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    
    /**
     * Definición del método constructor correspondiente al Cubo.
     * @throws RemoteException 
     */
    Cubo() throws RemoteException{
    }

    @Override
    public double volumen(double lado, double y) throws RemoteException {
        return Math.pow(lado, 3);
    }

    @Override
    public double area(double lado, double y) throws RemoteException {
        return 6* Math.pow(lado, 2);
    }
}