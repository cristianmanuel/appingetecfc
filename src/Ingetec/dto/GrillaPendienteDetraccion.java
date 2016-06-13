package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;

public class GrillaPendienteDetraccion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombreComprobante;	
	private String nroComprobante;	
	private Date fechaComp;	
	private String nroValidac;	
	private String claseGasto;	
	private String beneficiario;	
	private String proyecto	;
	private double totComp;	
	private double aPagar;
	private String monedaComp;	
	private double pagoPorceDete;	
	private double montoDet;	
	private String monedaDet;
	
	public String getNombreComprobante() {
		return nombreComprobante;
	}
	public void setNombreComprobante(String nombreComprobante) {
		this.nombreComprobante = nombreComprobante;
	}
	public String getNroComprobante() {
		return nroComprobante;
	}
	public void setNroComprobante(String nroComprobante) {
		this.nroComprobante = nroComprobante;
	}
	public Date getFechaComp() {
		return fechaComp;
	}
	public void setFechaComp(Date fechaComp) {
		this.fechaComp = fechaComp;
	}
	public String getNroValidac() {
		return nroValidac;
	}
	public void setNroValidac(String nroValidac) {
		this.nroValidac = nroValidac;
	}
	public String getClaseGasto() {
		return claseGasto;
	}
	public void setClaseGasto(String claseGasto) {
		this.claseGasto = claseGasto;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public double getTotComp() {
		return totComp;
	}
	public void setTotComp(double totComp) {
		this.totComp = totComp;
	}
	public String getMonedaComp() {
		return monedaComp;
	}
	public void setMonedaComp(String monedaComp) {
		this.monedaComp = monedaComp;
	}
	public double getPagoPorceDete() {
		return pagoPorceDete;
	}
	public void setPagoPorceDete(double pagoPorceDete) {
		this.pagoPorceDete = pagoPorceDete;
	}
	public double getMontoDet() {
		return montoDet;
	}
	public void setMontoDet(double montoDet) {
		this.montoDet = montoDet;
	}
	public String getMonedaDet() {
		return monedaDet;
	}
	public void setMonedaDet(String monedaDet) {
		this.monedaDet = monedaDet;
	}
	public double getaPagar() {
		return aPagar;
	}
	public void setaPagar(double aPagar) {
		this.aPagar = aPagar;
	}
	
	
	

}
