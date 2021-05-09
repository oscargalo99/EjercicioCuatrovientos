package org.cuatrovientos.sistemas;

public class Profesor extends Persona implements Guardable{
	
	public boolean esTutor;

	public Profesor(String name, String apellido, int dni, boolean esTutor) {
		super(name, apellido, dni);
		this.esTutor = esTutor;
	}
	
	public boolean isEsTutor() {
		return esTutor;
	}

	public void setEsTutor(boolean esTutor) {
		this.esTutor = esTutor;
	}

	@Override
	public String guardar() {
		String salida = "";
		char tutor;
		if (esTutor) {
			tutor = 'T';
		} else {
			tutor = 'N';
		}
		salida += "P"+":"+dni+":"+name+":"+apellido+":"+tutor;
		return salida;
	}
	
	

}
