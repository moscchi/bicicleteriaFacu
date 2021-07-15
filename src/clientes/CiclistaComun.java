package clientes;

public class CiclistaComun extends Cliente {

	private Direccion direccion;
	
	
	public CiclistaComun(Integer dni, String nombre, String apellido, Direccion direccion) {
		super(dni, nombre, apellido);
		this.setDireccion(direccion);
	}
	public CiclistaComun(Integer dni) {
		super(dni);
	}

	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	@Override
	public Double descuento(Double monto) {
		return monto;
	}
	

	
}
