package Hilo;

public class hPar extends Thread {
	private int n;
	public hPar (int n) {
		this.n = n;
		
	}
	@Override 
	public void run() {
		if(isPar(n)) {
			System.out.println("el numero es par");
			
		}else {
			System.out.println("El numero es impar");
		
			
		}
	}

	private boolean isPar(int n) {
		
		return (n%2==0);
		
	}
	
}
