package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;

public class Cajachica implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pedido;	
	private double monto;	
	private double fondo;	
	private String comprob;	
	private String nComprob;	
	private Date fCompro;	
	private String tGasto;	
	private double valor;	
	private double iGVTotal;	
	private double reembolso;	
	private double devoluc;	
	private String moneda;	
	private String codProve;	
	private String rucProve;	
	private String proveedor;	
	private String proyecto;	
	private String responsable;
	private double ttotal;
	
	
	
	
	public double getTtotal() {
		return ttotal;
	}
	public void setTtotal(double ttotal) {
		this.ttotal = ttotal;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getFondo() {
		return fondo;
	}
	public void setFondo(double fondo) {
		this.fondo = fondo;
	}
	public String getComprob() {
		return comprob;
	}
	public void setComprob(String comprob) {
		this.comprob = comprob;
	}
	public String getnComprob() {
		return nComprob;
	}
	public void setnComprob(String nComprob) {
		this.nComprob = nComprob;
	}
	public Date getfCompro() {
		return fCompro;
	}
	public void setfCompro(Date fCompro) {
		this.fCompro = fCompro;
	}
	public String gettGasto() {
		return tGasto;
	}
	public void settGasto(String tGasto) {
		this.tGasto = tGasto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getiGVTotal() {
		return iGVTotal;
	}
	public void setiGVTotal(double iGVTotal) {
		this.iGVTotal = iGVTotal;
	}
	public double getReembolso() {
		return reembolso;
	}
	public void setReembolso(double reembolso) {
		this.reembolso = reembolso;
	}
	public double getDevoluc() {
		return devoluc;
	}
	public void setDevoluc(double devoluc) {
		this.devoluc = devoluc;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getCodProve() {
		return codProve;
	}
	public void setCodProve(String codProve) {
		this.codProve = codProve;
	}
	public String getRucProve() {
		return rucProve;
	}
	public void setRucProve(String rucProve) {
		this.rucProve = rucProve;
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
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public Cajachica() {
		super();
	}
	
	
	
	

}
