package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;

public class GrillaPagoProveedores implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoComprobante;
	private String nComprobante;
	private Date fechaComp;
	private Date fechaValid;
	private Date fechaPagoPrev;
	private String nPago;
	private String tipoGasto1;
	private String proveedor;
	private String proyecto;
	private String montoOc;
	private String montoSolic;
	private String porcentaje;
	private String validado;
	private String moneda;
	private String detraccion;
	private String bancarizado;
	private String nroSemana;
	private String tipoGasto2;
	private String marca;
	
	
	
	
	public GrillaPagoProveedores(String tipoComprobante, String nComprobante,
			Date fechaComp, Date fechaValid, Date fechaPagoPrev, String nPago,
			String tipoGasto1, String proveedor, String proyecto,
			String montoOc, String montoSolic, String porcentaje,
			String validado, String moneda, String detraccion,
			String bancarizado, String nroSemana, String tipoGasto2,
			String marca) {
		this.tipoComprobante = tipoComprobante;
		this.nComprobante = nComprobante;
		this.fechaComp = fechaComp;
		this.fechaValid = fechaValid;
		this.fechaPagoPrev = fechaPagoPrev;
		this.nPago = nPago;
		this.tipoGasto1 = tipoGasto1;
		this.proveedor = proveedor;
		this.proyecto = proyecto;
		this.montoOc = montoOc;
		this.montoSolic = montoSolic;
		this.porcentaje = porcentaje;
		this.validado = validado;
		this.moneda = moneda;
		this.detraccion = detraccion;
		this.bancarizado = bancarizado;
		this.nroSemana = nroSemana;
		this.tipoGasto2 = tipoGasto2;
		this.marca = marca;
	}
	
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
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
	public String getnPago() {
		return nPago;
	}
	public void setnPago(String nPago) {
		this.nPago = nPago;
	}
	public String getTipoGasto1() {
		return tipoGasto1;
	}
	public void setTipoGasto1(String tipoGasto1) {
		this.tipoGasto1 = tipoGasto1;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getMontoOc() {
		return montoOc;
	}
	public void setMontoOc(String montoOc) {
		this.montoOc = montoOc;
	}
	public String getMontoSolic() {
		return montoSolic;
	}
	public void setMontoSolic(String montoSolic) {
		this.montoSolic = montoSolic;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getValidado() {
		return validado;
	}
	public void setValidado(String validado) {
		this.validado = validado;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getDetraccion() {
		return detraccion;
	}
	public void setDetraccion(String detraccion) {
		this.detraccion = detraccion;
	}
	public String getBancarizado() {
		return bancarizado;
	}
	public void setBancarizado(String bancarizado) {
		this.bancarizado = bancarizado;
	}
	public String getNroSemana() {
		return nroSemana;
	}
	public void setNroSemana(String nroSemana) {
		this.nroSemana = nroSemana;
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
