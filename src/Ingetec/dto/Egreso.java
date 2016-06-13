package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;

public class Egreso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idComprobante;
	private String nComprobante;
	private Date fechaComp;
	private Date fechaValid;
	private Date fechaPagoPrev;
	private String nOpago;
	private String tipoGasto;
	private String nProveedor;
	private String nProyecto;
	private double montoOc;
	private double montoSolic;
	private double porcentaje;
	private double validado;
	private String moneda;
	private double detraccion;
	private String bancarizado;
	private Integer nSemana;
	private String tipoGasto2;
	private String marca;
	
	
	public Egreso(String idComprobante, String nComprobante, Date fechaComp,
			Date fechaValid, Date fechaPagoPrev, String nOpago,
			String tipoGasto, String nProveedor, String nProyecto,
			double montoOc, double montoSolic, double porcentaje,
			double validado, String moneda, double detraccion,
			String bancarizado, Integer nSemana, String tipoGasto2, String marca) {
		this.idComprobante = idComprobante;
		this.nComprobante = nComprobante;
		this.fechaComp = fechaComp;
		this.fechaValid = fechaValid;
		this.fechaPagoPrev = fechaPagoPrev;
		this.nOpago = nOpago;
		this.tipoGasto = tipoGasto;
		this.nProveedor = nProveedor;
		this.nProyecto = nProyecto;
		this.montoOc = montoOc;
		this.montoSolic = montoSolic;
		this.porcentaje = porcentaje;
		this.validado = validado;
		this.moneda = moneda;
		this.detraccion = detraccion;
		this.bancarizado = bancarizado;
		this.nSemana = nSemana;
		this.tipoGasto2 = tipoGasto2;
		this.marca = marca;
	}


	public String getIdComprobante() {
		return idComprobante;
	}


	public void setIdComprobante(String idComprobante) {
		this.idComprobante = idComprobante;
	}


	public String getnComprobante() {
		return nComprobante;
	}


	public void setnComprobante(String nComprobante) {
		this.nComprobante = nComprobante;
	}


	public Date getFechaComp() {
		return fechaComp;
	}


	public void setFechaComp(Date fechaComp) {
		this.fechaComp = fechaComp;
	}


	public Date getFechaValid() {
		return fechaValid;
	}


	public void setFechaValid(Date fechaValid) {
		this.fechaValid = fechaValid;
	}


	public Date getFechaPagoPrev() {
		return fechaPagoPrev;
	}


	public void setFechaPagoPrev(Date fechaPagoPrev) {
		this.fechaPagoPrev = fechaPagoPrev;
	}


	public String getnOpago() {
		return nOpago;
	}


	public void setnOpago(String nOpago) {
		this.nOpago = nOpago;
	}


	public String getTipoGasto() {
		return tipoGasto;
	}


	public void setTipoGasto(String tipoGasto) {
		this.tipoGasto = tipoGasto;
	}


	public String getnProveedor() {
		return nProveedor;
	}


	public void setnProveedor(String nProveedor) {
		this.nProveedor = nProveedor;
	}


	public String getnProyecto() {
		return nProyecto;
	}


	public void setnProyecto(String nProyecto) {
		this.nProyecto = nProyecto;
	}


	public double getMontoOc() {
		return montoOc;
	}


	public void setMontoOc(double montoOc) {
		this.montoOc = montoOc;
	}


	public double getMontoSolic() {
		return montoSolic;
	}


	public void setMontoSolic(double montoSolic) {
		this.montoSolic = montoSolic;
	}


	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	public double getValidado() {
		return validado;
	}


	public void setValidado(double validado) {
		this.validado = validado;
	}


	public String getMoneda() {
		return moneda;
	}


	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}


	public double getDetraccion() {
		return detraccion;
	}


	public void setDetraccion(double detraccion) {
		this.detraccion = detraccion;
	}


	public String getBancarizado() {
		return bancarizado;
	}


	public void setBancarizado(String bancarizado) {
		this.bancarizado = bancarizado;
	}


	public Integer getnSemana() {
		return nSemana;
	}


	public void setnSemana(Integer nSemana) {
		this.nSemana = nSemana;
	}


	public String getTipoGasto2() {
		return tipoGasto2;
	}


	public void setTipoGasto2(String tipoGasto2) {
		this.tipoGasto2 = tipoGasto2;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
	
}
