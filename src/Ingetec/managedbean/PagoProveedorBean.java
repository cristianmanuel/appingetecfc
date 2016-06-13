package Ingetec.managedbean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import org.primefaces.event.RowEditEvent;

import Ingetec.dao.ClienteDao;
import Ingetec.dao.ProveedorDao;
import Ingetec.dao.ProyectoDao;
import Ingetec.dto.Cliente;
import Ingetec.dto.GrillaPagoProveedores;
import Ingetec.dto.Proveedor;
import Ingetec.dto.Proyecto;

/**
*
* @author cristian manuel
*/

@ManagedBean(name = "pagoProveedorBean")
@SessionScoped
public class PagoProveedorBean implements Serializable {

	private String nuevoCodigoProv;
	private String nuevocodProyecto;
	private Date fechaCobro;
	private String nuevoEstado;
	private static final long serialVersionUID = 1L;
	private List<Proveedor> listaProveedor=new ArrayList<Proveedor>();
	private List<Proyecto> listaProyecto=new ArrayList<Proyecto>();
	private List<GrillaPagoProveedores> listaGrillaPagoProveedores=new ArrayList<GrillaPagoProveedores>();;
	ProveedorDao proveedorDao=new ProveedorDao();
	private String numComprobante;
	
	
	
	
	
	public PagoProveedorBean() {
		
	}


	
	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("factura Edited", ((GrillaPagoProveedores) event.getObject()).getnComprobante());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((GrillaPagoProveedores) event.getObject()).getnComprobante());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	
	
	
	public String getNumComprobante() {
		return numComprobante;
	}

	public void setNumComprobante(String numComprobante) {
		this.numComprobante = numComprobante;
	}

	public String getNuevoEstado() {
		return nuevoEstado;
	}

	public void setNuevoEstado(String nuevoEstado) {
		this.nuevoEstado = nuevoEstado;
	}

	public Date getFechaCobro() {
		return fechaCobro;
	}

	public void setFechaCobro(Date fechaCobro) {
		this.fechaCobro = fechaCobro;
	}

	public String getNuevocodProyecto() {
		return nuevocodProyecto;
	}

	public void setNuevocodProyecto(String nuevocodProyecto) {
		this.nuevocodProyecto = nuevocodProyecto;
	}

	public String getNuevoCodigoProv() {
		return nuevoCodigoProv;
	}

	public void setNuevoCodigoProv(String nuevoCodigoProv) {
		this.nuevoCodigoProv = nuevoCodigoProv;
	}

	public List<Proyecto> getListaProyecto() {
		return listaProyecto;
	}

	public void setListaProyecto(List<Proyecto> listaProyecto) {
		this.listaProyecto = listaProyecto;
	}

	public List<Proveedor> getListaProveedor() {
		listaProveedor=proveedorDao.readAll();
		return listaProveedor;
	}

	public void setListaProveedor(List<Proveedor> listaProveedor) {
		this.listaProveedor = listaProveedor;
	}

	public List<GrillaPagoProveedores> getListaGrillaPagoProveedores() {
		//listaGrillaPagoProveedores=proveedorDao.buscarPorParametros2(nuevoCodigoProv, nuevocodProyecto, numComprobante, fechaCobro, nuevoEstado);
		return listaGrillaPagoProveedores;
	}

	public void setListaGrillaPagoProveedores(
			List<GrillaPagoProveedores> listaGrillaPagoProveedores) {
		this.listaGrillaPagoProveedores = listaGrillaPagoProveedores;
	}
	
	public void buscarComprobantee(){
		//usados solo como prueba dura
		System.out.println("llamando al metodo buscar desde el managedbean pago proveedor !!!");
		listaGrillaPagoProveedores=proveedorDao.buscarPorParametros2(nuevoCodigoProv, nuevocodProyecto, numComprobante, fechaCobro, nuevoEstado);
		
	}
	
	
}





