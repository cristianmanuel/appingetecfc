package Ingetec.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Ingetec.dao.AdministrativoDao;
import Ingetec.dto.Cajachica;
import Ingetec.dto.GrillaPendienteDetraccion;


@ManagedBean(name = "pendienteBean")
@SessionScoped
public class PendienteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<GrillaPendienteDetraccion> listaGrilla=new ArrayList<GrillaPendienteDetraccion>();
	private List<Cajachica> listaGrillaChica=new ArrayList<Cajachica>();
	AdministrativoDao administrativoDao=new AdministrativoDao();
	
	
	
	
	
	public List<Cajachica> getListaGrillaChica() {
		return listaGrillaChica;
	}
	public void setListaGrillaChica(List<Cajachica> listaGrillaChica) {
		this.listaGrillaChica = listaGrillaChica;
	}
	public List<GrillaPendienteDetraccion> getListaGrilla() {
		System.out.println("entrando al metodo");
		
		return listaGrilla;
	}
	public void setListaGrilla(List<GrillaPendienteDetraccion> listaGrilla) {
		this.listaGrilla = listaGrilla;
	}
	
	public void llenarGrilllaGasto(){
		System.out.println("llamando al metodo llenar lista desde managedBean pendienteBean");
		listaGrilla=administrativoDao.cargarGrillaDetracciones();
	}
	
	public void llenarGrilllaChica(){
		System.out.println("llamando al metodo llenar lista desde managedBean pendienteBean caja chica");
		listaGrillaChica=administrativoDao.cargarGrillaCajaChica();
	}
	
	
}
