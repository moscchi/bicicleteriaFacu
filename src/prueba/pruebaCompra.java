package prueba;

import clientes.CiclistaComun;
import clientes.Cliente;
import compras.Compra;
import producto.Bicicleta;

public class pruebaCompra {

	public static void main(String[] args) {
		
		
		Cliente c = new CiclistaComun(1234);
	
		Bicicleta b = new Bicicleta("Bianchi", "AAA", 3, 100.0);
		
		Compra comp = new Compra();
		comp.setCliente(c);
		comp.setBicicleta(b);
		
		System.out.println("el monto de la compra es: " + comp.calcularMonto());
		

		

	}

}
