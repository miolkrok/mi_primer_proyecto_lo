package com.lo.edu.dependencias;

import java.util.Scanner;

public class MainUCE {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("ingrese apellido: ");
		String apellido = scanner.nextLine();
		
		System.out.println("ingrese calle: ");
		String calle = scanner.nextLine();
		
		System.out.println("ingrese numeracion: ");
		String numeracion = scanner.nextLine();
		
		// TODO Auto-generated method stub
		
		

		Matricula matricula = new Matricula();
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje = matricula.matricular(nombre,apellido,calle,numeracion);
		System.out.println(mensaje);
	}

}
