package controller;

public class ThreadNumero extends Thread{
	int numero;
	public ThreadNumero(int numero) {
		super();
		this.numero = numero;
	}
	
	@Override
	public void run() {
		System.out.println(this.numero);
	}
	
}
