package clientes;

public class CiclistaFederado extends Cliente {

	public CiclistaFederado(Integer dni) {
		super(dni);
	}

	public Double descuento(Double monto) {
		return monto*0.9;
	}
	
	

}
