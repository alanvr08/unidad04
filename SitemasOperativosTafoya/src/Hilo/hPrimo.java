package Hilo;

public class hPrimo extends Thread {
	
	
	int n;
	public hPrimo (int n){
		
		this.n=n;
	}
	@Override
	public void run() {
		int a=0;
		int i;
	
		for(i=1; i < (n+1); i++){
	         if(n % i == 0){
	             a++;
	            }
	         }
	         if(a!= 2){
	        	 
	              System.out.println("No es Primo");
	              
	            }else{ 
	            	
	                System.out.println("Si es Primo");
	         }
	     }
	}