package controller;

public class ThreadNumero extends Thread{
	
	public ThreadNumero() {
		super();
	}

	@Override
	public void run() {
		System.out.println("TID #" + getId());
	}
	
}
