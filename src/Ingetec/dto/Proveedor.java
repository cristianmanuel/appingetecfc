package Ingetec.dto;

import java.io.Serializable;

public class Proveedor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_prove;
	private String ruc_pro;
	private String nom_prove;
	
	
	public Proveedor(String cod_prove, String ruc_pro, String nom_prove) {
		this.cod_prove = cod_prove;
		this.ruc_pro = ruc_pro;
		this.nom_prove = nom_prove;
	}
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}
	public String getCod_prove() {
		return cod_prove;
	}
	public void setCod_prove(String cod_prove) {
		this.cod_prove = cod_prove;
	}
	public String getRuc_pro() {
		return ruc_pro;
	}
	public void setRuc_pro(String ruc_pro) {
		this.ruc_pro = ruc_pro;
	}
	public String getNom_prove() {
		return nom_prove;
	}
	public void setNom_prove(String nom_prove) {
		this.nom_prove = nom_prove;
	}
	
	
	
}
