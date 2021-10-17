package actividad_01_Requerimiento2;

public class ConsumidorCorreos extends Thread {
	
	public String nombre;
	public Cola cola;
	
	public ConsumidorCorreos(String nombre, Cola cola){
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
	public void run(){
		for(int i = 1;i <= 10;i++){
			Correo correo = cola.getMensaje();
			System.out.println(correo.getDestinatario() + " ha consumido el correo: " + correo );
		}
	}
	
	

}
