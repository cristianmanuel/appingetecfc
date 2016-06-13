package Ingetec.dto;

import java.io.Serializable;
import java.util.Date;

public class Adelanto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idRegistro;
	private Date fechaCobro;
	private double montoAdelanto;
	private String numeroOperacion;
	private String nombreBanco;
	private String estadoAdelanto;
	
	public Adelanto(String idRegistro, Date fechaCobro, double montoAdelanto,
			String numeroOperacion, String nombreBanco) {
		this.idRegistro = idRegistro;
		this.fechaCobro = fechaCobro;
		this.montoAdelanto = montoAdelanto;
		this.numeroOperacion = numeroOperacion;
		this.nombreBanco = nombreBanco;
		//this.estadoAdelanto = estadoAdelanto;
	}
	
	
	public Adelanto(String idRegistro, Date fechaCobro, double montoAdelanto,
			String numeroOperacion, String nombreBanco, String estadoAdelanto) {
		this.idRegistro = idRegistro;
		this.fechaCobro = fechaCobro;
		this.montoAdelanto = montoAdelanto;
		this.numeroOperacion = numeroOperacion;
		this.nombreBanco = nombreBanco;
		this.estadoAdelanto = estadoAdelanto;
	}
	public Adelanto() {
		
	}
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	public Date getFechaCobro() {
		return fechaCobro;
	}
	public void setFechaCobro(Date fechaCobro) {
		this.fechaCobro = fechaCobro;
	}
	public double getMontoAdelanto() {
		return montoAdelanto;
	}
	public void setMontoAdelanto(double montoAdelanto) {
		this.montoAdelanto = montoAdelanto;
	}
	public String getNumeroOperacion() {
		return numeroOperacion;
	}
	public void setNumeroOperacion(String numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	public String getEstadoAdelanto() {
		return estadoAdelanto;
	}
	public void setEstadoAdelanto(String estadoAdelanto) {
		this.estadoAdelanto = estadoAdelanto;
	}
}
