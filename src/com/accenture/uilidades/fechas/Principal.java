package com.accenture.uilidades.fechas;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
	//mandar las fechas a traves de los argumentos
		System.out.println("El numero de dias es: " + Fecha.calcularDias(new Date(args[0]), new Date(args[1])));//sino le mando en una sale una excepcion de array debordado, como una posicion que no existe
		

	}

}
