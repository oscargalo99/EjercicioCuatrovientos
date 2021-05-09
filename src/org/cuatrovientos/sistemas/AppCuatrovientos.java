package org.cuatrovientos.sistemas;

import java.time.LocalDate;

public class AppCuatrovientos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Alumno a1 = new Alumno("Laura","Martinez",11111111, LocalDate.of(2004, 1, 1));//17
		Alumno a2 = new Alumno("Pedro","Perez",22222222, LocalDate.of(2004, 12, 12));//16
		Alumno a3 = new Alumno("Lucia","Lopez",33333333, LocalDate.of(2002, 3, 3));//19
		Alumno a4 = new Alumno("Juan","Jimenez",44444444, LocalDate.of(2002, 4, 4));//18
		Alumno a5 = new Alumno("Carmen","Martinez",55555555, LocalDate.of(2004, 5, 5));//16
		Alumno a6 = new Alumno("Luis","Jimenez",66666666, LocalDate.of(2002, 6, 6));//18
		
		Profesor p1 = new Profesor("Marta","Lopez",77777777, true);
		Profesor p2 = new Profesor("Pedro","Martinez",88888888, true);
		Profesor p3 = new Profesor("Andres","Gomez",99999999, false);
		
		Curso c1 = new Curso(UTIL4V.DAM,UTIL4V.INFORMATICA,UTIL4V.SUPERIOR,UTIL4V.PRIMERO);
		Curso c2 = new Curso(UTIL4V.SMR,UTIL4V.INFORMATICA,UTIL4V.MEDIO,UTIL4V.SEGUNDO);
		
		Cuatrovientos cuatrovientos = new Cuatrovientos();
		
		//Comprobaciones al añadir personas y cursos
		System.out.println("COMPROBACIONES AL ANYADIR PERSONAS Y CURSOS");
		System.out.println("===========================================");
		c1.addPersona(a4);
		c1.addPersona(a1);
		c1.addPersona(a3);
		//No tutor
		c1.addPersona(p3);
		c1.addPersona(p1);
		
		c2.addPersona(a5);
		c2.addPersona(a6);
		c2.addPersona(a2);
		c2.addPersona(p2);	
		
		//alumno repetido
		c1.addPersona(a1);
		//tutor ya añaido
		c1.addPersona(p2);
		
		cuatrovientos.addCurso(c1);
		cuatrovientos.addCurso(c2);
		//curso repetido
		cuatrovientos.addCurso(c1);
		
		//Ver tutores familia
		System.out.println("\nTUTORES INFORMÁTICA");
		System.out.println("=======================");
		cuatrovientos.verTutoresFamilia(UTIL4V.INFORMATICA);
		
		//Alumnos mayores de edad
		System.out.println("\nALUMNOS MENORES DE EDAD");
		System.out.println("=======================");
		for (Alumno a : cuatrovientos.menoresEdad()) {
			System.out.println(a.toString());
		}
		
		//Simul
		System.out.println("\nSIMULACIÓN DE GUARDADO");
		System.out.println("=======================");
		System.out.println(a5.guardar());
		System.out.println(a6.guardar());
		System.out.println(p1.guardar());
		System.out.println(p3.guardar());
		System.out.println(cuatrovientos.guardar());		
		
		
		
	}

}
