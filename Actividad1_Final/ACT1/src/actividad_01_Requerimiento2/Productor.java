package actividad_01_Requerimiento2;

public class Productor extends Thread {
	
	public String nombre;
	public Cola cola;
	
	public Productor(String nombre, Cola cola){
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run(){
		GeneradorCorreos gc = new GeneradorCorreos();
		
		for(int i = 1;i <= 10;i++){
			
			Correo correo = gc.generarCorreo();
			
			
			try {	
				
					System.out.println(correo.getRemitente() + " con id"+ correo.getId() + " ha producido el correo " + correo);
					cola.addMensaje(correo);
					System.out.println("Esperando a tener espacio disponible....");
					Thread.sleep(5000);
													
								
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
