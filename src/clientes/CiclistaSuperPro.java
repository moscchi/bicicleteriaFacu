package clientes;

public class CiclistaSuperPro extends Cliente {

	
	
	public CiclistaSuperPro(Integer dni) {
		super(dni);
	}

	public Double descuento(Double monto) {
		return monto*0.7;
	}
}
