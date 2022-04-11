import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorRMI implements ICalculo{
	
	public ServidorRMI() {};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServidorRMI server = new ServidorRMI();
			
			ICalculo stub = (ICalculo) UnicastRemoteObject.exportObject(server, 0);
			
			Registry registry = LocateRegistry.getRegistry();
			
			registry.rebind("Servidor", stub);
			
			System.out.println("Servidor Inicializado com Sucesso!");
			
		}catch (Exception e){
			e.printStackTrace();
		}

	}
	
	public double calculaPerimetro(double x, double y) throws RemoteException{
		return ((x*2)+(y*2));
	}
	
	public double calculaArea(double x, double y) throws RemoteException{
		return x*y;
	}

}