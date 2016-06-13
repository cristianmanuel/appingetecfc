package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GrillaProyecto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idProyecto;
	private String nombreCliente;
	private String nombreProyecto;
	private double monto;
	private double gastoActual;
	private String ordenCompra;
	private Date fechaInicio;
	private Date fechaFin;
	private String estado;
	private List<Ingreso> listaIngreso;
	private List<Egreso> listaEgreso;
	
	
	
	
	public GrillaProyecto() {
		
	}




	public GrillaProyecto(String idProyecto, String nombreCliente,
			String nombreProyecto, double monto, double gastoActual,
			String ordenCompra, Date fechaInicio, Date fechaFin, String estado) {
		this.idProyecto = idProyecto;
		this.nombreCliente = nombreCliente;
		this.nombreProyecto = nombreProyecto;
		this.monto = monto;
		this.gastoActual = gastoActual;
		this.ordenCompra = ordenCompra;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
	}
	
	
	
	
	public List<Egreso> getListaEgreso() {
		return listaEgreso;
	}




	public void setListaEgreso(List<Egreso> listaEgreso) {
		this.listaEgreso = listaEgreso;
	}




	public List<Ingreso> getListaIngreso() {
		return listaIngreso;
	}




	public void setListaIngreso(List<Ingreso> listaIngreso) {
		this.listaIngreso = listaIngreso;
	}




	public String getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getGastoActual() {
		return gastoActual;
	}

	public void setGastoActual(double gastoActual) {
		this.gastoActual = gastoActual;
	}

	public String getOrdenCompra() {
		return ordenCompra;
	}
	public void setOrdenCompra(String ordenCompra) {
		this.ordenCompra = ordenCompra;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
