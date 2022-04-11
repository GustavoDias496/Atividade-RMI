import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ICalculo extends Remote {
	double calculaPerimetro(double x, double y) throws RemoteException;
	double calculaArea(double x, double y) throws RemoteException;
}