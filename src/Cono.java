/**
 * Implementación de la figura geométrica cono.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cono extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    //Atributos a utilizar
    private double radio;
    private double altura;
    
    /**
     * Definición del método constructor correspondiente al Cono.
     * @param radio: Valor del radio de la base del cono.
     * @param altura: Valor de la altura del cono.
     * @throws RemoteException 
     */
    Cono(double radio, double altura) throws RemoteException{
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double volumen() throws RemoteException {
        return (Math.PI* Math.pow(radio, 2)* this.altura)/3;
    }

    @Override
    public double area() throws RemoteException {
        double g = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2)); //gradiante
        return Math.PI* this.radio*(this.radio + g);
    }
}
