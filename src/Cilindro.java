/**
 * Implementación de la figura geométrica cilindro.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cilindro extends UnicastRemoteObject implements FiguraGeometricaRemota{
    
    //Atributos a utilizar
    private double radio;
    private double altura;
    
    /**
     * Definición del método constructor correspondiente al Cilindro.
     * @param radio: Valor del radio de la base del cilindro.
     * @param altura: Valor de la altura del cilindro.
     * @throws RemoteException 
     */
    Cilindro(double radio, double altura) throws RemoteException{
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double volumen() throws RemoteException {
        return Math.PI* Math.pow(radio, 2)* this.altura;
    }

    @Override
    public double area() throws RemoteException {
        return 2* Math.PI* this.radio*(this.radio + this.altura);
    }
}
