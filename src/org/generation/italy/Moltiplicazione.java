package org.generation.italy;

public class Moltiplicazione implements Operazioni {

	@Override
	public void calcola(int a, int b) {
		int moltiplicazione = a * b;
		System.out.println("la moltiplicazione è : " + moltiplicazione);

	}

}
