/**
 * Implementación de la figura geométrica cubo.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cubo extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    //Atributos a utilizar
    private double lado;
    
    /**
     * Definición del método constructor correspondiente al Cubo.
     * @param lado: Valor de los lados del cubo.
     * @throws RemoteException 
     */
    Cubo(double lado) throws RemoteException{
        this.lado = lado;
    }

    @Override
    public double volumen() throws RemoteException {
        return Math.pow(lado, 3);
    }

    @Override
    public double area() throws RemoteException {
        return 6* Math.pow(lado, 2);
    }
}