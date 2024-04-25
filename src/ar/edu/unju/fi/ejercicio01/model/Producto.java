package ar.edu.unju.fi.ejercicio01.model;

public class Producto {
	private String codigo;
	private String descripcion;
	private double precioU;
	private OrigenFabricacion origenFabricacion;
	private Categoria categoria;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}	

	public Producto(String codigo, String descripcion, double precioU, OrigenFabricacion origenFabricacion,
			Categoria categoria) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioU = precioU;
		this.origenFabricacion = origenFabricacion;
		this.categoria = categoria;
	}



	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecioU() {
		return precioU;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}	
	
	public OrigenFabricacion getOrigenFabricacion() {
		return origenFabricacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
		this.origenFabricacion = origenFabricacion;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	// Enum para OrigenFabricacion
    public enum OrigenFabricacion {
        ARGENTINA, CHINA, BRASIL, URUGUAY
    }

    // Enum para Categoria
    public enum Categoria {
        TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
    }

}
