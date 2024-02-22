package com.wbg.demoApp.dto;

public class Persona {

	private String nombre;
	private String apellido;
	private int direccion;
	private int celular;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDireccion() {
		return this.direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public int getCelular() {
		return this.celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
}
