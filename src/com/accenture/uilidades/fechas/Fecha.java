package com.accenture.uilidades.fechas;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Fecha {

	public static int compararFechas(Date fechaUno, Date fechaDos) {
		
		int retorno=fechaUno.compareTo(fechaDos);
		
		return retorno;
	}
	
public static int calcularDias(Date fechaInicio, Date fechaFinal) {
		
		try {
			if (fechaInicio== null || fechaFinal== null) {
			 throw new DateTimeException("Las fechas no pueden ser null "); 	//le manda una excepcion
			}
			
			long diferencia = fechaFinal.getTime() - fechaInicio.getTime(); //.getTime me devuelve la fecha en milisegundos
			Long d=(diferencia/(1000*60*60*24));
			int dias= d.intValue();
			//ej. cierro conexion
			
			
			return dias;
		}
		catch(DateTimeParseException e) {
			throw e;//lanzar la excepcion mostrarle a los otros la excepcion(hacia atras)
			//System.err.println(e);
		}
		catch(Exception e) {
			System.err.println("He capturado el error: " + e);
			throw e;
		}
		finally {
			System.out.println("Finally: Me he ejecutado");
		}
	
	}
	
}
