package view;

import controller.ThreadNumero;

public class Principal {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			Thread t = new ThreadNumero(i);
			t.start();
		}
	}
}
