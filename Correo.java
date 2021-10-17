package actividad_01_Requerimiento2;

public class Correo {

	
	private String id;
	private String destinatario;
	private String remitente;
	private String asunto;
	private String cuerpo;
	
	//Generamos los geter y seter del objeto correo
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	@Override
	public String toString() {
		return "correo [id=" + id + ", destinatario=" + destinatario + ", remitente=" + remitente + ", asunto=" + asunto
				+ ", cuerpo=" + cuerpo + "]";
	}
	
    

}
