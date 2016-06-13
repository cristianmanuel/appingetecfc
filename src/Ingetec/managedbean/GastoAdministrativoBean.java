package Ingetec.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Ingetec.dao.AdministrativoDao;
import Ingetec.dto.GrillaGastosAdministrativos;

/**
 * 
 * @author cristian manuel
 */

@ManagedBean(name = "gastoAdministrativoBean")
@SessionScoped
public class GastoAdministrativoBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<GrillaGastosAdministrativos> listaGrillaAdministrativa=new ArrayList<GrillaGastosAdministrativos>();
	private AdministrativoDao administrativoDao=new AdministrativoDao();
	
	
	

	public List<GrillaGastosAdministrativos> getListaGrillaAdministrativa() {
		//listaGrillaAdministrativa=administrativoDao.readAll();
		return listaGrillaAdministrativa;
	}

	public void setListaGrillaAdministrativa(List<GrillaGastosAdministrativos> listaGrillaAdministrativa) {
		this.listaGrillaAdministrativa = listaGrillaAdministrativa;
	}
	
	
	public void eliminarGasto(){
		String codIdAdministrativo = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get("codIdAdministrativo");
		
		if(indiceDato(codIdAdministrativo)>=0){
			//debe llamar al dao del gordo
			
			int k=indiceDato(codIdAdministrativo);
			String indice=String.valueOf(k);
			listaGrillaAdministrativa.remove(k);
			administrativoDao.eliminarObjeto(indice);
			System.out.println("eliminando");
			
		}
		
		
	}
	
	
	public void llenarGrilllaGasto(){
		System.out.println("llamando al metodo llenar lista desde managedBean Gasto Administrativo");
		listaGrillaAdministrativa=administrativoDao.readAll();
	}
	

	public String enviarNuevoGastoAdministrativo() {
		System.out.println("llego Gasto Adminstrativo");
		return "nuevoGastoAdministrativo?faces-redirect=true";
	}
	
	public String guardarGastoAdministrativo(){
		System.out.println("retorno gasto administrativo");
		return "gastosAdministrativos?faces-redirect=true";
	}
	
	public int indiceDato(String bus) {
		int j = -1;
		;

		for (int i = 0; i < listaGrillaAdministrativa.size(); i++) {
			if (listaGrillaAdministrativa.get(i).getIdGastroAdministrativo().equals(bus)) {
				j = i;
				break;
			}
		}
		return j;
	}
	
	
}
