package org.bext.lab.dto;

public class User {
	String userName;
	String userId;
	String direccion1;
	String direccion2;
	String ciudad;
	String estado;
	String CP;
	
	public String getUserName() {
		System.out.println("user getUserName: "  + userName);
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDireccion1() {
		System.out.println("user getDireccion1: "  + direccion1);
		return direccion1;
	}
	public void setDireccion1(String direccion1) {
		System.out.println("user setDireccion1: "  + direccion1);
		this.direccion1 = direccion1;
	}
	public String getDireccion2() {
		return direccion2;
	}
	public void setDireccion2(String direccion2) {
		this.direccion2 = direccion2;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
		
}
