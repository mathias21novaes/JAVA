package senac.poo.ado;
import java.util.Random;

public class Corrida {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int velocidade1 = rand.nextInt(25) + 1;
		int velocidade2 = rand.nextInt(25) + 1;
		int velocidade3 = rand.nextInt(25) + 1;
		
		int tempo1 = rand.nextInt(850);
		int tempo2 = rand.nextInt(850);
		int tempo3 = rand.nextInt(850);

		Competidor Mathias = new Competidor("Mathias", velocidade1, tempo1);
		Competidor Roger = new Competidor("Roger", velocidade2, tempo2);
		Competidor MilHouse = new Competidor("MilHouse", velocidade3, tempo3);
		
		Thread thread1 = new Thread(Mathias);
		Thread thread2 = new Thread(Roger);
		Thread thread3 = new Thread(MilHouse);
		
		Mathias.Inicio();
		
		thread1.start();
	    thread2.start();
	    thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();	
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
