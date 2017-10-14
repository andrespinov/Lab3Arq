/**
 * Implementación de la figura geométrica esfera.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Esfera extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    /**
     * Definición del método constructor correspondiente a la Esfera.
     * @param radio: Valor del radio de la esfera.
     * @throws RemoteException 
     */
    Esfera() throws RemoteException{
    }

    @Override
    public double volumen(double radio, double y) throws RemoteException {
        return (4* Math.PI* Math.pow(radio, 3))/3;
    }

    @Override
    public double area(double radio, double y) throws RemoteException {
        return 4* Math.PI* Math.pow(radio, 2);
    }
}