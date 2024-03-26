package org.generation.italy;

public class Divisione implements Operazioni {

	@Override
	public void calcola(int a, int b) {
		
		int div = a / b;
		System.out.println("la divisione è : " + div);
	}

}
