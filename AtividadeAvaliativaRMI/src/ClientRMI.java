import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientRMI {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry();
			
			ICalculo stub =(ICalculo) registry.lookup("Servidor");
			
			System.out.println("Invocando Métodos!");
			
			Scanner sc = new Scanner(System.in);
			
			double a=0;
			double b=0; 
			double resultado=0;
			
			System.out.println("Digite o 1º lado: ");
			a = sc.nextDouble();
			System.out.println("Digite o 2º lado: ");
			b = sc.nextDouble();
			resultado = stub.calculaArea(a, b);
			
			System.out.println("Perimetro: " + resultado);
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
