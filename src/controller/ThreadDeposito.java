package controller;

public class ThreadDeposito extends Thread{

	private int cod;
	private int saldo;
	private int valor;
	
	public ThreadDeposito(int cod, int saldo, int valor) {
		
		this.cod = cod;
		this.saldo = saldo;
		this.valor = valor;
		
	}

	public void run() {
		
		conta();
	}

	private void conta() {
		
		int atualSaldo = valor - saldo;
		System.out.println("A conta " + cod + " de saldo " + 
		saldo + " agora tem " + atualSaldo);
		
	}
}
