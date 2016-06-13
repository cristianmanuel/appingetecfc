package Ingetec.dto;

import java.io.Serializable;

public class Proyecto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo_proyecto;
	private String nom_id;
	
	public Proyecto() {
	}
		
	public Proyecto(String codigo_proyecto, String nom_id) {
		this.codigo_proyecto = codigo_proyecto;
		this.nom_id = nom_id;
	}
	public String getCodigo_proyecto() {
		return codigo_proyecto;
	}
	public void setCodigo_proyecto(String codigo_proyecto) {
		this.codigo_proyecto = codigo_proyecto;
	}
	public String getNom_id() {
		return nom_id;
	}
	public void setNom_id(String nom_id) {
		this.nom_id = nom_id;
	}
	
	
}
