package Ingetec.dto;

import java.io.Serializable;

public class GrillaGastosAdministrativos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String idGastroAdministrativo;
		private String anio;
		private String mes;
		private double monto;
		
		public GrillaGastosAdministrativos() {
		
		}
		public GrillaGastosAdministrativos(String idGastroAdministrativo,
				String anio, String mes, double monto) {
		
			this.idGastroAdministrativo = idGastroAdministrativo;
			this.anio = anio;
			this.mes = mes;
			this.monto = monto;
		}
		public String getIdGastroAdministrativo() {
			return idGastroAdministrativo;
		}
		public void setIdGastroAdministrativo(String idGastroAdministrativo) {
			this.idGastroAdministrativo = idGastroAdministrativo;
		}
		public String getAnio() {
			return anio;
		}
		public void setAnio(String anio) {
			this.anio = anio;
		}
		public String getMes() {
			return mes;
		}
		public void setMes(String mes) {
			this.mes = mes;
		}
		public double getMonto() {
			return monto;
		}
		public void setMonto(double monto) {
			this.monto = monto;
		}
		
		
	

}
