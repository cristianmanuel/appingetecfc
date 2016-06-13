/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingetec.dto;

import java.io.Serializable;

public class Cliente implements Serializable{
      
    private String ruc_clie;
    private String nom_clie;
    private boolean select;

   public Cliente() {
    }
    
  public Cliente(String ruc_clie, String nom_clie) {
		super();
		this.ruc_clie = ruc_clie;
		this.nom_clie = nom_clie;
	}

	public String getRuc_clie() {
		return ruc_clie;
	}

	public void setRuc_clie(String ruc_clie) {
		this.ruc_clie = ruc_clie;
	}

	public String getNom_clie() {
		return nom_clie;
	}

	public void setNom_clie(String nom_clie) {
		this.nom_clie = nom_clie;
	}

	public boolean isSelect() {
		return select;
	}

	public void setSelect(boolean select) {
		this.select = select;
	}
    
}
