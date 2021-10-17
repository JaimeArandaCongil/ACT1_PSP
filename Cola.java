package actividad_01_Requerimiento2;

import java.util.LinkedList;
import java.util.Queue;



public class Cola {
	
	//el buffer tendrá una capacidad máxima de 5 cartas
	
	public final static int MAX_ELEMENTOS = 5;
	
	
	private Queue<Correo> cola = new LinkedList<>();
	
	public synchronized void addMensaje(Correo correo){
		
		//mientras que el tamaño de la cola sea igual que 5 esperaremos a que se libere espacio para introducir nuevos correos
		
		while(cola.size() == MAX_ELEMENTOS){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Añadimos un elemento a la cola
		cola.offer(correo);
		
		notify();
	}
	
	public synchronized Correo getMensaje(){
		Correo co = null;
		while(cola.size() == 0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		co = cola.poll();
		
		notify();
		return co;
	}

}
