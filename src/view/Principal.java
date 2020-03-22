package view;

import java.util.concurrent.Semaphore;

import controller.ThreadDeposito;
import controller.ThreadSaque;

public class Principal {

	public static Semaphore semaforo;
	public static int cod;
	public static int saldo;
	public static int valor;
	public static void main(String[] args) {

		semaforo = new Semaphore(2);
		for (int x = 1; x <= 20; x++) {
			
			int y = (int)Math.random()*2;
			cod = (int) (Math.random()*1000);
			saldo = (int) (Math.random()*2000);
			valor = (int) (Math.random()*3000);
			try {
				semaforo.acquire();
				if (y == 1) {
					Thread saque = new ThreadSaque(cod, saldo, valor);
					saque.start();
				} else {
					Thread deposito = new ThreadDeposito(cod, saldo, valor);
					deposito.start();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo.release();
			}
			
		}
	}
}
