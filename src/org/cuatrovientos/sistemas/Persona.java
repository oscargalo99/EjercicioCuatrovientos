package org.cuatrovientos.sistemas;

public abstract class Persona {

    public String name;
    public String apellido;
    public int dni;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public Persona(String name, String apellido, int dni) {
        super();
        this.name = name;
        this.apellido = apellido;
        this.dni = dni;
    }

    Persona() {

    }

    public String toString() {
        return dni + " " + name + " " + apellido;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni != other.dni)
			return false;
		return true;
	}
    
    
}
