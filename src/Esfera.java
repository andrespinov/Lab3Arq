/**
 * Implementación de la figura geométrica esfera.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Esfera extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    //Atributos a utilizar
    private double radio;
    
    /**
     * Definición del método constructor correspondiente a la Esfera.
     * @param radio: Valor del radio de la esfera.
     * @throws RemoteException 
     */
    Esfera(double radio) throws RemoteException{
        this.radio = radio;
    }

    @Override
    public double volumen() throws RemoteException {
        return (4* Math.PI* Math.pow(radio, 3))/3;
    }

    @Override
    public double area() throws RemoteException {
        return 4* Math.PI* Math.pow(radio, 2);
    }
}