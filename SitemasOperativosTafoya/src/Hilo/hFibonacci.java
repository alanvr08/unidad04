package Hilo;

public class hFibonacci extends Thread {
	
	int n;
	public hFibonacci (int n){
		
		this.n=n;
	
	}
	@Override
	public void run(){
		
	int fibo1 = 0 ,fibo2 = 1 , fibo3 = 0 ;
		
	for (int i = 1; i <= n; i++){
		
		fibo2 = fibo1 + fibo2;
        fibo1 = fibo2 - fibo1;
		
		
	}
		int fibonacci =fibo1;
		
		System.out.println("el nesimo numero de la serie fibonacci es " +fibonacci);
	}

}
