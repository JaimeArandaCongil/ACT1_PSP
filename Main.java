package actividad_01_Requerimiento2;



public class Main {
	
	public static void main(String[] args) {
		Cola cola = new Cola();
		
		Productor p1 = new Productor("Producto 1",cola);
		Productor p2 = new Productor("Producto 2",cola);
		Productor p3 = new Productor("Producto 3",cola);
		
		ConsumidorCorreos c1 = new ConsumidorCorreos("Consumidor 1",cola);
		ConsumidorCorreos c2 = new ConsumidorCorreos("Consumidor 2",cola);
		
		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
		
	}

}
