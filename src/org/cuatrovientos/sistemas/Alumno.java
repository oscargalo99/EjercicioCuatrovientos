package org.cuatrovientos.sistemas;

import java.time.LocalDate;

public class Alumno extends Persona implements Guardable {

	public LocalDate fechaNacimiento;

	public Alumno(String name, String apellido, int dni, LocalDate fechaNacimiento) {
		super(name, apellido, dni);
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean esMayorEdad() {
		LocalDate hoy = LocalDate.now();
		int años = hoy.getYear() - fechaNacimiento.getYear();
		if (años > 18) {
			return true;
		} else if (años == 18) {
			if (hoy.getMonthValue() > fechaNacimiento.getMonthValue()) {
				return true;
			} else if (hoy.getMonthValue() == fechaNacimiento.getMonthValue()) {
				if (hoy.getDayOfMonth() > fechaNacimiento.getDayOfMonth()) {
					return true;
				} else {
					return false;
				}
			}

		}
		return false;
	}

	@Override
	public String guardar() {
		String salida = "";
		int diaNacimiento = fechaNacimiento.getDayOfMonth();
		int mesNacimiento = fechaNacimiento.getMonthValue();
		int anyoNacimiento = fechaNacimiento.getYear();
		salida += "A" + ":" + dni +":" + name + ":" + apellido + ":" + diaNacimiento + ":" + mesNacimiento + ":" + anyoNacimiento;
		return salida;
	}

}
