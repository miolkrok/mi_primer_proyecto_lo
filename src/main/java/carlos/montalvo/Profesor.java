package carlos.montalvo;

public class Profesor {

	public String nombre;
	public String apellido;
	public String profesion;
	public String universidad;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, String apellido, String profesion, String universidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
		this.universidad = universidad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	
	
}
