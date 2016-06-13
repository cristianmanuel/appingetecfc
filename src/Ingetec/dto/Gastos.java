package Ingetec.dto;

import java.io.Serializable;

public class Gastos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idGasto;
	private Integer anio;
	private Integer mes;
	private String tipoGasto;
	private String detalleTipoGasto;
	private double montoGasto;
	
	
	public Gastos() {
	
	}
	public Gastos(Integer idGasto, Integer anio, Integer mes, String tipoGasto,
			String detalleTipoGasto, double montoGasto) {

		this.idGasto = idGasto;
		this.anio = anio;
		this.mes = mes;
		this.tipoGasto = tipoGasto;
		this.detalleTipoGasto = detalleTipoGasto;
		this.montoGasto = montoGasto;
	}
	public Integer getIdGasto() {
		return idGasto;
	}
	public void setIdGasto(Integer idGasto) {
		this.idGasto = idGasto;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public String getTipoGasto() {
		return tipoGasto;
	}
	public void setTipoGasto(String tipoGasto) {
		this.tipoGasto = tipoGasto;
	}
	public String getDetalleTipoGasto() {
		return detalleTipoGasto;
	}
	public void setDetalleTipoGasto(String detalleTipoGasto) {
		this.detalleTipoGasto = detalleTipoGasto;
	}
	public double getMontoGasto() {
		return montoGasto;
	}
	public void setMontoGasto(double montoGasto) {
		this.montoGasto = montoGasto;
	}
	
}
