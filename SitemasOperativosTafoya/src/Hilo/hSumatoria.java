package Hilo;

public class hSumatoria extends Thread

{

	int n;	
	public hSumatoria (int n){
		
		this.n=n;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i<=n; i++ ) {
			
			sum = sum + i;
			
		}
		
		System.out.println("La sumatoria es " +sum);
		
	}
	
}
