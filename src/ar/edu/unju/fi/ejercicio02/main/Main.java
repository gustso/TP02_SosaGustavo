package ar.edu.unju.fi.ejercicio02.main;

import ar.edu.unju.fi.ejercicio02.constantes.Mes;
import ar.edu.unju.fi.ejercicio02.model.Efemeride;
import ar.edu.unju.fi.ejercicio02.util.Listado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Efemeride efe01 = new Efemeride();
		
		efe01.setCodigo("e01");
		efe01.setMes(Mes.ABRIL);
		efe01.setDia(19);
		efe01.setDetalle("19 de Abril SSJujuy");
		
		Listado.listadoEfemerides.add(efe01);
		
	}

}
