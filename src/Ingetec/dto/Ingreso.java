package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;

public class Ingreso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idIngreso;
	private String numeroFactura;
	private Date fechaProceso;
	private Date fechaPago;
	private double subtotal;
	private double igv;
	private double total;
	private double detraccion;
	private double retencion;
	private double montoReal;
	private String estado;
	
	public Ingreso(String idIngreso, String numeroFactura, Date fechaProceso,
			Date fechaPago, double subtotal, double igv, double total,
			double detraccion, double retencion, double montoReal, String estado) {
		this.idIngreso = idIngreso;
		this.numeroFactura = numeroFactura;
		this.fechaProceso = fechaProceso;
		this.fechaPago = fechaPago;
		this.subtotal = subtotal;
		this.igv = igv;
		this.total = total;
		this.detraccion = detraccion;
		this.retencion = retencion;
		this.montoReal = montoReal;
		this.estado = estado;
	}
	public String getIdIngreso() {
		return idIngreso;
	}
	public void setIdIngreso(String idIngreso) {
		this.idIngreso = idIngreso;
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
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDetraccion() {
		return detraccion;
	}
	public void setDetraccion(double detraccion) {
		this.detraccion = detraccion;
	}
	public double getRetencion() {
		return retencion;
	}
	public void setRetencion(double retencion) {
		this.retencion = retencion;
	}
	public double getMontoReal() {
		return montoReal;
	}
	public void setMontoReal(double montoReal) {
		this.montoReal = montoReal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
