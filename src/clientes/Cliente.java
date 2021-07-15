package clientes;

public abstract class Cliente {

	protected Integer dni;
	protected String nombre;
	protected String apellido;	
	
	public Cliente(Integer dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Cliente(Integer dni) {
		super();
		this.dni = dni;
		
	}
	
	
	
	public Integer getDni() {
		return dni;
	}
	
	public void setDni(Integer dni) {
		this.dni = dni;
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
	
	public abstract Double descuento(Double monto);
	
	
}
