package pc.hilo;

import java.util.Scanner;

import pc.inter.Buffer;
import pc.hilo.*;
public class Productor extends Thread {
	
	int n=0;
	Buffer b;
	public Productor(Buffer b) {
		this.b = b;
	}
	@Override
	public void run() {
		
		
		
		
		while(n!=-1) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("(PRODUCTOR) INSERTA EL NUMERO");
			n= teclado.nextInt();
		
			b.setValor(n);
			if(n == -1 ){
			
			System.out.println("(PRODUCTOR) FIN ");
			}
			//b.setValor(new Random().nextInt());
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				
				// TODO Auto-generated catch block
				e.printStackTrace();
						
			}
			
			
		}
	}
	
}
