package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;

public class NotadeCredito implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idnotaCredito;
	private String acreedot;
	private String descripcion;
	private Double montoNotaCredito;
	private Date fechaNotaCredito;
	
	
	
	
	
	public NotadeCredito(String idnotaCredito, String acreedot,
			String descripcion, Double montoNotaCredito, Date fechaNotaCredito) {
	
		this.idnotaCredito = idnotaCredito;
		this.acreedot = acreedot;
		this.descripcion = descripcion;
		this.montoNotaCredito = montoNotaCredito;
		this.fechaNotaCredito = fechaNotaCredito;
	}
	public NotadeCredito() {
		
	}
	public String getIdnotaCredito() {
		return idnotaCredito;
	}
	public void setIdnotaCredito(String idnotaCredito) {
		this.idnotaCredito = idnotaCredito;
	}
	public String getAcreedot() {
		return acreedot;
	}
	public void setAcreedot(String acreedot) {
		this.acreedot = acreedot;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getMontoNotaCredito() {
		return montoNotaCredito;
	}
	public void setMontoNotaCredito(Double montoNotaCredito) {
		this.montoNotaCredito = montoNotaCredito;
	}
	public Date getFechaNotaCredito() {
		return fechaNotaCredito;
	}
	public void setFechaNotaCredito(Date fechaNotaCredito) {
		this.fechaNotaCredito = fechaNotaCredito;
	}
	
	
}
