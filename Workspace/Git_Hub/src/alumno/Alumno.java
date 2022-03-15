package alumno;

public class Alumno {
	private String nombre;
	private String apellido;
	private int edad;
	private int id;
	private String email;
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Alumno(String nombre, String apellido, int edad, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.id = id;
	}
	
	public Alumno() {
		
	}
}
