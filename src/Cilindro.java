/**
 * Implementación de la figura geométrica cilindro.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cilindro extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    /**
     * Definición del método constructor correspondiente al Cilindro
     * @throws RemoteException 
     */
    Cilindro() throws RemoteException{
    }

    @Override
    public double volumen(double radio, double altura) throws RemoteException {
        return Math.PI* Math.pow(radio, 2)* altura;
    }

    @Override
    public double area(double radio, double altura) throws RemoteException {
        return 2* Math.PI* radio*(radio + altura);
    }
}
