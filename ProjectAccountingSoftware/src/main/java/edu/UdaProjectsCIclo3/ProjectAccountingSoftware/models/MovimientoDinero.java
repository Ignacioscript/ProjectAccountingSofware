package edu.UdaProjectsCIclo3.ProjectAccountingSoftware.models;

public class MovimientoDinero {

	
	//ID UNICO DE LA TRANSACCIÓN ASIGNADA EN LA BASE DE DATOS
	private Long id;
	
	//CONCEPTO DEL MOVIMIENTO 
	private String concepto;
	
	//MONTO O CANTIDAD EFECTUADA EN EL MOVIMIENTO
	private Float monto;
	
	//EMPLEADO O USUARIO QUE EFECTUO EL MOVIMIENTO
	private Empleado empleado;
	
	//EMPRESA A LA QUE PERTENECE EL EMPLEADO O USUARIO QUE REALIZÓ EL MOVIMIENTO
	private Empresa empresa;

	
	//CONSTRUCTOR VACIO
	public MovimientoDinero() {
		super();
	}

	//CONSTRUCTOR CON PARAMETROS 
	public MovimientoDinero(String concepto, Float monto, Empleado empleado, Empresa empresa) {
		super();
		this.concepto = concepto;
		this.monto = monto;
		this.empleado = empleado;
		this.empresa = empresa;
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
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	/**
	 * @return the monto
	 */
	public Float getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(Float monto) {
		this.monto = monto;
	}

	/**
	 * @return the empleado
	 */
	public Empleado getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
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
	
	
	
	
	
	
}
