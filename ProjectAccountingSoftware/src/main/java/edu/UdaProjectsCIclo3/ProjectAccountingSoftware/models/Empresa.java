package edu.UdaProjectsCIclo3.ProjectAccountingSoftware.models;


public class Empresa {

	
	//ID UNICO DE LA EMPRESA
	private Long id;
	
	//NOMBRE DE EMPRESA
	private String nombre;
	
	//DIRECCION DE LA EMPRESA
	private String direccion;
	
	//TELEFONO DE LA EMPRESA
	private String telefono;
	
	//NIT DE LA EMPRESA
	private String nit;
	
	
	//CONSTURCTOR CON PARAMETROS
	public Empresa(String nombre, String direccion, String telefono, String nit) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nit = nit;
	}

	//CONSTRUCTOR VACIO
	public Empresa() {
		super();
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the nit
	 */
	public String getNit() {
		return nit;
	}

	/**
	 * @param nit the nit to set
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}
	
	
	
	
}
