package edu.UdaProjectsCIclo3.ProjectAccountingSoftware.models;

public class Empleado {

	
	// ID DE LA BASE DE DATOS UNICO DEL EMPLEADO 
	private Long id;
	
	//NOMBRE DEL EMPLEADO
	private String nombre;
	
	//CORREO DEL EMPLEADO
	private String correo;
	
	//EMPRESA A LA QUE PERTENECE EL EMPLEADO
	private Empresa empresa;
	
	//ROL DEL EMPLEADO (ADMINISTRATIVO U OPERARIO)
	private Enum_RoleName rol;
	
	

	
	//CONSTRUCTORES
	public Empleado() {
		super();
	}

	
	//CONSTRUCTOR CON PARAMETROS 
	public Empleado(String nombre, String correo, Empresa empresa, Enum_RoleName rol) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.empresa = empresa;
		this.rol = rol;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}


	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}


	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	/**
	 * @return the rol
	 */
	public Enum_RoleName getRol() {
		return rol;
	}


	/**
	 * @param rol the rol to set
	 */
	public void setRol(Enum_RoleName rol) {
		this.rol = rol;
	}
	
	
	

	
	
}
