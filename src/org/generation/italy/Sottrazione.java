package org.generation.italy;

public class Sottrazione implements Operazioni {

	@Override
	public void calcola(int a, int b) {
		int sottrazione = a - b;
		System.out.println("la sottrazione è : " + sottrazione);

	}

}
