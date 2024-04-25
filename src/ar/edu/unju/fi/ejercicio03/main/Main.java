package ar.edu.unju.fi.ejercicio03.main;

import java.util.Arrays;

import ar.edu.unju.fi.ejercicio03.constantes.Provincia;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Provincia.CATAMARCA.getCantidadPoblacion());	
		System.out.println(Provincia.JUJUY.getSuperficie());
		System.out.println(Provincia.SALTA.calcularDensidadPoblacional());
		
		Provincia.CATAMARCA.setCantidadPoblacion(200);
		System.out.println(Provincia.CATAMARCA.getCantidadPoblacion());
		
		//mostrar los datos
		System.out.println(Arrays.toString(Provincia.values()));
		//List<Provincia> listado = new ArrayList<Provincia>();
		
		Provincia[] listado = Provincia.values();
		
		for(Provincia p : listado ) {
			System.out.println(p.getSuperficie());
		}
	}

}
