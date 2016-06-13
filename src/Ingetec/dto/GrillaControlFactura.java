package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GrillaControlFactura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idProyecto;
	private String nombreProyecto;
	private String numeroFactura;
	private Date fechaProceso;//Date fechaProceso se cambiara de acuerdo al tipo de bd
	private Date fechaPago;//Date fechaPago
	private Double subTotal;
	private Double igv;
	private Double total;
	private Double detraccion;
	private Double retencion;
	private Double montoReal;
	private boolean aprobado;
	private String estado;
	private List<NotadeCredito> listaNotaCredito;
	private List<Adelanto> listaAdelanto;
	
	
	public GrillaControlFactura(){}
	
	public GrillaControlFactura(String idProyecto, String nombreProyecto,
			String numeroFactura, Date fechaProceso, Date fechaPago,
			Double subTotal, Double igv, Double total, Double detraccion,
			Double retencion, Double montoReal, boolean aprobado, String estado) {
		
		this.idProyecto = idProyecto;
		this.nombreProyecto = nombreProyecto;
		this.numeroFactura = numeroFactura;
		this.fechaProceso = fechaProceso;
		this.fechaPago = fechaPago;
		this.subTotal = subTotal;
		this.igv = igv;
		this.total = total;
		this.detraccion = detraccion;
		this.retencion = retencion;
		this.montoReal = montoReal;
		this.aprobado = aprobado;
		this.estado = estado;
	}
	
	public List<NotadeCredito> getListaNotaCredito() {
		return listaNotaCredito;
	}

	public void setListaNotaCredito(List<NotadeCredito> listaNotaCredito) {
		this.listaNotaCredito = listaNotaCredito;
	}

	public List<Adelanto> getListaAdelanto() {
		return listaAdelanto;
	}

	public void setListaAdelanto(List<Adelanto> listaAdelanto) {
		this.listaAdelanto = listaAdelanto;
	}

	public Double getMontoReal() {
		return montoReal;
	}

	public void setMontoReal(Double montoReal) {
		this.montoReal = montoReal;
	}

	public String getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	
	

	public Date getFechaProceso() {
		return fechaProceso;
	}

	public void setFechaProceso(Date fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	public Double getIgv() {
		return igv;
	}
	public void setIgv(Double igv) {
		this.igv = igv;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Double getDetraccion() {
		return detraccion;
	}

	public void setDetraccion(Double detraccion) {
		this.detraccion = detraccion;
	}

	public Double getRetencion() {
		return retencion;
	}

	public void setRetencion(Double retencion) {
		this.retencion = retencion;
	}

	public boolean isAprobado() {
		return aprobado;
	}
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
