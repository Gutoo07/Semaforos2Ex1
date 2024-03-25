package view;
import java.util.concurrent.Semaphore;

import controller.Metodos1;

public class Main1 {

	public static void main(String[] args) {
		Semaphore cruzamento = new Semaphore(1);
		String sentido = "";
		
		for (int i = 0; i < 4; i++) {
			int x = (int) ((Math.random()*4));
			if (x == 3) {
				sentido = "cima";
			} else if (x == 2) {
				sentido = "baixo";
			} else if (x == 1 ) {
				sentido = "direita";
			} else if (x == 0 ) {
				sentido = "esquerda";
			}
			Thread carro = new Metodos1(cruzamento, i, sentido);
			carro.start();
		}
	}

}
