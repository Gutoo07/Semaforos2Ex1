package controller;
import java.util.concurrent.Semaphore;

public class Metodos1 extends Thread{ 
	private Semaphore cruzamento;
	private int id;
	private String sentido;
	
	
	public Metodos1(Semaphore cruzamento, int id, String sentido) {
		this.id = id;
		this.cruzamento = cruzamento;
		this.sentido = sentido;
	}
	
	public void run() {
		System.out.println("Carro #" + id + " esta esperando para cruzar");
		
		try {
			cruzamento.acquire();
			System.err.println("Carro #" + id + " esta cruzando para " + sentido);
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			cruzamento.release();
		}
		
	}
	
}
