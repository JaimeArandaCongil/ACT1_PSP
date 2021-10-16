package actividad_01;

import java.util.Scanner;

public class primo extends Thread{
	
	private String palabra;
	
	public primo (String palabra) {
		super(palabra);
		this.palabra=palabra;
		}
	
	public void run() {
		
		 long inicio = System.nanoTime();
		
		int primos =0;
		System.out.println("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = sc.nextInt();
		int count = 0;
	    int i;
	    
	//si al dividir el número entre i da 0 el resto se suma 1 al contador
	    
	 for ( i=1;i<=numero;i++) {
		if (numero%i==0) {
			count++;
			}
		}
	
	/*Una vez terminado el for anterior si el contador se ha sumado un número distinto a 2
	  será que el número no es primo ya que este lo es cuando solo tiene dos divisores el mismo y 1
	 */
	
		i-=1;
	if (count != 2) {
			System.out.println("El número "+i+" no es primo");
		}else {
			System.out.println("El número "+i+" es primo");
		}
	
	
		System.out.println("El "+this.getName()+ " ha terminado");
		
		primos++;
		
		
		long fin = System.nanoTime();
		
		//para pasarlo a segundos
		
		double dif = (double) (fin - inicio) *1.0e-9;
		System.out.println();
		System.out.println("El programa dura " + dif+ " segundos");
		
		
		
		
	}
	
	
	
	

}
