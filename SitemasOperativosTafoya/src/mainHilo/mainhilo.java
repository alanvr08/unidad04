package mainHilo;

import Hilo.hFactorial;
import Hilo.hFibonacci;
import Hilo.hPar;
import Hilo.hPrimo;
import Hilo.hSumatoria;

public class mainhilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hPar h1= new hPar (5);
		hFactorial h2 = new hFactorial (5);
		hSumatoria h3 = new hSumatoria (5);
		hPrimo h4 = new hPrimo (5);
		hFibonacci h5 = new hFibonacci (5);
		
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}

}
