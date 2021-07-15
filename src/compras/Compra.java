package compras;

import clientes.Cliente;
import producto.Bicicleta;

public class Compra {

	private Cliente cliente;
	private Bicicleta bicicleta;

	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	
	
	public Double calcularMonto() {
		
		return this.getCliente().descuento(this.getBicicleta().getPrecio());
		
//		if (this.getCliente() instanceof CiclietaFederado )
//			return this.getBicicleta().getPrecio() *0.9; 
//		else 
//			if (this.getCliente() instanceof CiclistaSuperPro) {
//				return this.getBicicleta().getPrecio()*0.7;
//			}else 
//				return this.getBicicleta().getPrecio();
		
	}
	
}
