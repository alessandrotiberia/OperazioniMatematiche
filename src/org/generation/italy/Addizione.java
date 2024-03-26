package org.generation.italy;

public class Addizione implements Operazioni {

	@Override
	public void calcola(int a, int b) {
		int somma = a + b;
		System.out.println("la somma è : " + somma);

	}

}
