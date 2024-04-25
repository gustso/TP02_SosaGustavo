package ar.edu.unju.fi.ejercicio03.constantes;

public enum Provincia {
	
	JUJUY(673973, 37623),
    SALTA(1453269, 159549),
    TUCUMAN(1668312, 25736),
    CATAMARCA(367828, 102602),
    LA_RIOJA(389635, 92306),
    SANTIAGO_DEL_ESTERO(874061, 142587);

	private int cantidadPoblacion;
	private int superficie;
	
	//default
	private Provincia() {
		// TODO Auto-generated constructor stub
	}

	//parametrizado
	private Provincia(int cantidadPoblacion, int superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}

	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}

	public void setCantidadPoblacion(int cantidadPoblacion) {
		this.cantidadPoblacion = cantidadPoblacion;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public double calcularDensidadPoblacional() {
        return (double) cantidadPoblacion / superficie;
    }	
	
}
