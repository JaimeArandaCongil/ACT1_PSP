package actividad_01_Requerimiento2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class GeneradorCorreos {
	
	//vamos a crear varias listas para generar correos aleatorios
	
	public Correo generarCorreo() {
		Correo correo = new Correo();
		correo.setId(generarId());
		correo.setDestinatario(generarDestinatario());
		correo.setRemitente(generarRemitente());
		correo.setAsunto(generarAsunto());
		correo.setCuerpo(generarCuerpo());
		return correo;
	}
	
	public String generarId() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("25433A");
		listaNombres.add("23344B");
		listaNombres.add("83737N");
		listaNombres.add("99389I");
		listaNombres.add("38383P");
		listaNombres.add("38938L");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 5);
		
		return listaNombres.get(numero);
	}
	
	public String generarDestinatario() {
		List<String> listaNombres = new ArrayList<String>();
		listaNombres.add("andresmartinez@gmail.com");
		listaNombres.add("juliangonzalez@gmail.com");
		listaNombres.add("anadevicente@gmail.com");
		listaNombres.add("estelarodriguez@gmail.com");
		listaNombres.add("pablopicasso@gmail.com");
		listaNombres.add("pikachu@gmail.com");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 6);

		return listaNombres.get(numero);
	
	}
		
	
	//Aquí pondríamos una lista de los trabajadores que pueden envíar correos
	
	public String generarRemitente() {
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("davidmatias@gmail.com");
		listaNombres.add("jaimearanda@gmail.com");
		listaNombres.add("fridaabella@gmail.com");
		listaNombres.add("anafernandez@gmail.com");
		listaNombres.add("sergiomota@gmail.com");
		listaNombres.add("josemarin@gmail.com");
				
		
		int numero = ThreadLocalRandom.current().nextInt(0, 5);
		
		return listaNombres.get(numero);
	}
	
	public String generarAsunto() {
		
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("Cumpleaños");
		listaNombres.add("Reunión importante");
		listaNombres.add("Vacaciones");
		listaNombres.add("Pagos pendientes");
		listaNombres.add("Solicitud material");
		listaNombres.add("Incidencia");
		
				
		int numero = ThreadLocalRandom.current().nextInt(0, 5);
		
		return listaNombres.get(numero);
	}
	
	public String generarCuerpo() {
		
		List<String> listaNombres = new ArrayList<String>();
		
		//nos ayudamos de la página loren ipsum para generar contenido para el cuerpo de los correos
		
		listaNombres.add("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
		listaNombres.add("Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño. El punto de usar Lorem Ipsum es que tiene una distribución más o menos normal de las letras, al contrario de usar textos como por ejemplo \"Contenido aquí, contenido aquí\". Estos textos hacen parecerlo un español que se puede leer. Muchos paquetes de autoedición y editores de páginas web usan el Lorem Ipsum como su texto por defecto, y al hacer una búsqueda de \"Lorem Ipsum\" va a dar por resultado muchos sitios web que usan este texto si se encuentran en estado de desarrollo. Muchas versiones han evolucionado a través de los años, algunas veces por accidente, otras veces a propósito (por ejemplo insertándole humor y cosas por el estilo).");
		listaNombres.add("Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera, ya sea porque se le agregó humor, o palabras aleatorias que no parecen ni un poco creíbles. Si vas a utilizar un pasaje de Lorem Ipsum, necesitás estar seguro de que no hay nada avergonzante escondido en el medio del texto. Todos los generadores de Lorem Ipsum que se encuentran en Internet tienden a repetir trozos predefinidos cuando sea necesario, haciendo a este el único generador verdadero (válido) en la Internet. Usa un diccionario de mas de 200 palabras provenientes del latín, combinadas con estructuras muy útiles de sentencias, para generar texto de Lorem Ipsum que parezca razonable. Este Lorem Ipsum generado siempre estará libre de repeticiones, humor agregado o palabras no características del lenguaje, etc.");
		listaNombres.add("Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. Tiene sus raices en una pieza cl´sica de la literatura del Latin, que data del año 45 antes de Cristo, haciendo que este adquiera mas de 2000 años de antiguedad. Richard McClintock, un profesor de Latin de la Universidad de Hampden-Sydney en Virginia, encontró una de las palabras más oscuras de la lengua del latín, \"consecteur\", en un pasaje de Lorem Ipsum, y al seguir leyendo distintos textos del latín, descubrió la fuente indudable. Lorem Ipsum viene de las secciones 1.10.32 y 1.10.33 de \"de Finnibus Bonorum et Malorum\" (Los Extremos del Bien y El Mal) por Cicero, escrito en el año 45 antes de Cristo. Este libro es un tratado de teoría de éticas, muy popular durante el Renacimiento. La primera linea del Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", viene de una linea en la sección 1.10.32");
		listaNombres.add("El trozo de texto estándar de Lorem Ipsum usado desde el año 1500 es reproducido debajo para aquellos interesados. Las secciones 1.10.32 y 1.10.33 de \"de Finibus Bonorum et Malorum\" por Cicero son también reproducidas en su forma original exacta, acompañadas por versiones en Inglés de la traducción realizada en 1914 por H. Rackham.");
		
				
		int numero = ThreadLocalRandom.current().nextInt(0, 4);
		
		return listaNombres.get(numero);
	}
	
	
	
	
	

}
