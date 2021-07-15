package producto;

public class Bicicleta {

	private String marca;
	private String modelo;
	private Integer stock;
	private Double precio;

	
	
	public Bicicleta(String marca, String modelo, Integer stock, Double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
