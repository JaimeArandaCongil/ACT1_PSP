package actividad_01;

import java.util.Scanner;

public class numeroPrimoMain {

	public static void main(String[] args) {
		
		
		primo p1 = new primo("Proceso 1");
		primo p2 = new primo("Proceso 2");
		primo p3 = new primo("Proceso 3");
		primo p4 = new primo("Proceso 4");
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		Thread t4 = new Thread(p4);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	

	}
	
}
