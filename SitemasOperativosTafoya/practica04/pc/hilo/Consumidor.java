package pc.hilo;

import pc.inter.*;

import java.util.Scanner;

import pc.inter.Buffer;

public class Consumidor extends Thread {
	int n;
	Buffer b;
	int num;
	public Consumidor(Buffer b) {
		// TODO Auto-generated constructor stub
		this.b = b;
	}
	@Override
	public void run() {
		while(n !=-1) {
			num = b.getValor();

			if(num == -1) {
				System.out.println("(CONSUMIDOR) FIN ");
			}
				else{
					int fac = 1;
					for (int i = 1; i <=num; i++){
						
						fac = fac * i;
						
						
					}

					System.out.println("( CONSUMIDOR ) El factorial es :"  +fac);
					
		}
		
		//System.out.println(" (CONSUMIDOR) FIN KRNL");
	}
	

}
}