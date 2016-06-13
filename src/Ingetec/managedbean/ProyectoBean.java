package Ingetec.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Ingetec.dao.ProyectoDao;
import Ingetec.dto.Egreso;
import Ingetec.dto.GrillaProyecto;
import Ingetec.dto.Ingreso;

/*
 * @author cristian manuel
 */

@ManagedBean(name = "proyectoBean")
@SessionScoped
public class ProyectoBean implements Serializable{
		

	private static final long serialVersionUID = 1L;
	private String nombreProyecto;
	private String idCliente;
	private String estadoProyecto;
	private GrillaProyecto grillaProyecto=new GrillaProyecto();;
	private List<GrillaProyecto> listaGrilla=new ArrayList<GrillaProyecto>();
	private List<Egreso> listaGrillaEgreso=new ArrayList<Egreso>();
	private List<Ingreso> listaGrillaIngreso=new ArrayList<Ingreso>();
	ProyectoDao proyectoDao=new ProyectoDao();
	
	
	public GrillaProyecto getGrillaProyecto() {
		return grillaProyecto;
	}

	public void setGrillaProyecto(GrillaProyecto grillaProyecto) {
		this.grillaProyecto = grillaProyecto;
	}

	public List<Egreso> getListaGrillaEgreso() {
		return listaGrillaEgreso;
	}

	public void setListaGrillaEgreso(List<Egreso> listaGrillaEgreso) {
		this.listaGrillaEgreso = listaGrillaEgreso;
	}

	public List<Ingreso> getListaGrillaIngreso() {
		return listaGrillaIngreso;
	}

	public void setListaGrillaIngreso(List<Ingreso> listaGrillaIngreso) {
		this.listaGrillaIngreso = listaGrillaIngreso;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}


	public String getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getEstadoProyecto() {
		return estadoProyecto;
	}

	public void setEstadoProyecto(String estadoProyecto) {
		this.estadoProyecto = estadoProyecto;
	}
	
	
	
	
	public List<GrillaProyecto> getListaGrilla() {
		return listaGrilla;
	}

	public void setListaGrilla(List<GrillaProyecto> listaGrilla) {
		this.listaGrilla = listaGrilla;
	}

	public void buscarFactura(){
			
		listaGrilla=proyectoDao.buscarProyectoPorParametros(nombreProyecto, idCliente, estadoProyecto);
	}
	
	public String enviarDetalleProyecto(){
		//llamando a listas de egreso e ingreso por el id de proyecto
		
		String codigoIdProyecto = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get("codigoIdProyecto");
		listaGrillaEgreso=proyectoDao.listaEgreso(codigoIdProyecto);
		listaGrillaIngreso=proyectoDao.listaIngreso(codigoIdProyecto);
		//llamando los atributos del objeto GrillaProyecto para pintarlo tambien en la pantalla segun maqueta del gordo!!!
		
		grillaProyecto=proyectoDao.buscarAtributo(codigoIdProyecto);
		System.out.println("++++----"+grillaProyecto.getIdProyecto());
		System.out.println("++++----"+grillaProyecto.getNombreCliente());
		System.out.println("++++----"+grillaProyecto.getNombreProyecto());
		//llamando a los daos que construiran y poblaran las grillas egreso e ingreso...
		
		System.out.println("llego a detalle de proyecto");
		return "detalleProyecto?faces-redirect=true";
	}
	
}
