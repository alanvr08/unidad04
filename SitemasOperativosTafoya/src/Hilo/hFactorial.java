package Hilo;

public class hFactorial extends Thread
{
int n;
public hFactorial (int n){
	
	this.n=n;
}
@Override
public void run() {
	
	int fac = 1;
	for (int i = 1; i <=n; i++){
		
		fac = fac * i;
	}

	System.out.println("El factorial es :" +fac);

}



}
