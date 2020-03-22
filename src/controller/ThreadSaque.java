package controller;

public class ThreadSaque extends Thread{

	private int cod;
	private int saldo;
	private int valor;
	
	public ThreadSaque(int cod, int saldo, int valor) {
		
		this.cod = cod;
		this.saldo = saldo;
		this.valor = valor;
		
	}

	public void run() {
		
		conta();
	}

	private void conta() {
		
		int atualSaldo = valor + saldo;
		System.out.println("A conta " + cod + " de saldo " + 
		saldo + " agora tem " + atualSaldo);
		
	}
}
