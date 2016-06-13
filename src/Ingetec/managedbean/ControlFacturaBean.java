/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import Ingetec.dto.Adelanto;
import Ingetec.dto.Cliente;
import Ingetec.dto.GrillaControlFactura;
import Ingetec.dto.NotadeCredito;
import Ingetec.dto.Proveedor;
import Ingetec.dto.Proyecto;

/**
 *
 * @author cristian manuel
 */

@ManagedBean(name = "controlFacturaBean")
@SessionScoped
public class ControlFacturaBean implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//para adelanto
	private String idRegistro;
	private Date fechaCobro;
	private double montoAdelanto;
	private String numeroOperacion;
	private String nombreBanco;
	private String estadoAdelanto;
	//fin de adelanto
	
	
	
	//para nota de credito ///
	private String idnotaCredito;
	private String acreedot;
	private String descripcion;
	private Double montoNotaCredito;
	private Date fechaNotaCredito;
	//fin de nota de credito
	
	
	
	private String nuevoIdCliente;
	private String nuevoIdProyecto;
	private String estadoCliente;
	private Date fechaPrevistaCobro;
	private Date fechaPrevistaPago;
	private double subtotal;
	private double igv;
	private double total;
	private double retencion;
	private double detraccion;
	private double montoReal;
	private String numeroFactura;
	
	private String estadoFactura;
	private String esAprobado="Aprobado";
	private double montoTotal;
	private int totalPendientes;
	
	
	List<Adelanto> listaAdelanto=new ArrayList<Adelanto>();
	List<NotadeCredito> listaNotaCredito=new ArrayList<NotadeCredito>();
	List<Cliente> listaCliente=new ArrayList<Cliente>(); 
	List<Proyecto> listaProyecto=new ArrayList<Proyecto>();
	List<GrillaControlFactura> listaGrilla=new ArrayList<GrillaControlFactura>();
	ClienteDao clienteDao=new ClienteDao();
	ProyectoDao proyectoDao=new ProyectoDao();
	ProveedorDao proveedorDao=new ProveedorDao();
	private NotadeCredito notadeCredito;
	
	
	
	
	
	
	
	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public int getTotalPendientes() {
		return totalPendientes;
	}

	public void setTotalPendientes(int totalPendientes) {
		this.totalPendientes = totalPendientes;
	}

	public NotadeCredito getNotadeCredito() {
		return notadeCredito;
	}

	public void setNotadeCredito(NotadeCredito notadeCredito) {
		this.notadeCredito = notadeCredito;
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

	public String getIdnotaCredito() {
		return idnotaCredito;
	}

	public void setIdnotaCredito(String idnotaCredito) {
		this.idnotaCredito = idnotaCredito;
	}

	public String getAcreedot() {
		return acreedot;
	}

	public void setAcreedot(String acreedot) {
		this.acreedot = acreedot;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getMontoNotaCredito() {
		return montoNotaCredito;
	}

	public void setMontoNotaCredito(Double montoNotaCredito) {
		this.montoNotaCredito = montoNotaCredito;
	}

	public Date getFechaNotaCredito() {
		return fechaNotaCredito;
	}

	public void setFechaNotaCredito(Date fechaNotaCredito) {
		this.fechaNotaCredito = fechaNotaCredito;
	}

	
	
	
	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("GrillaControlFactura Edited", ((GrillaControlFactura) event.getObject()).getIdProyecto());
        System.out.println("la nuvea fecha es "+((GrillaControlFactura) event.getObject()).getFechaPago());
       FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
       FacesMessage msg = new FacesMessage("Edit Cancelled", ((GrillaControlFactura) event.getObject()).getIdProyecto());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
   public List<Adelanto> getListaAdelanto() {
		return listaAdelanto;
	}

	public void setListaAdelanto(List<Adelanto> listaAdelanto) {
		this.listaAdelanto = listaAdelanto;
	}

	public List<NotadeCredito> getListaNotaCredito() {
		return listaNotaCredito;
	}

	public void setListaNotaCredito(List<NotadeCredito> listaNotaCredito) {
		this.listaNotaCredito = listaNotaCredito;
	}

	public ControlFacturaBean() {
    }
    
	
	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getRetencion() {
		return retencion;
	}

	public void setRetencion(double retencion) {
		this.retencion = retencion;
	}

	public double getDetraccion() {
		return detraccion;
	}

	public void setDetraccion(double detraccion) {
		this.detraccion = detraccion;
	}

	public double getMontoReal() {
		return montoReal;
	}

	public void setMontoReal(double montoReal) {
		this.montoReal = montoReal;
	}

	public Date getFechaPrevistaPago() {
		return fechaPrevistaPago;
	}

	public void setFechaPrevistaPago(Date fechaPrevistaPago) {
		this.fechaPrevistaPago = fechaPrevistaPago;
	}

	public Date getFechaPrevistaCobro() {
		return fechaPrevistaCobro;
	}

	public void setFechaPrevistaCobro(Date fechaPrevistaCobro) {
		this.fechaPrevistaCobro = fechaPrevistaCobro;
	}


	public String getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(String estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	public String getNuevoIdCliente() {
		return nuevoIdCliente;
	}

	public void setNuevoIdCliente(String nuevoIdCliente) {
		this.nuevoIdCliente = nuevoIdCliente;
	}

	public String getNuevoIdProyecto() {
		return nuevoIdProyecto;
	}

	public void setNuevoIdProyecto(String nuevoIdProyecto) {
		this.nuevoIdProyecto = nuevoIdProyecto;
	}

	public List<Cliente> getListaCliente() {
		listaCliente=clienteDao.readAll();
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public List<Proyecto> getListaProyecto() {
	//	listaProyecto=proyectoDao.readAll();
		return listaProyecto;
	}

	public void setListaProyecto(List<Proyecto> listaProyecto) {
		this.listaProyecto = listaProyecto;
	}
	
	public void cambiarComboProyecto(){
		System.out.println("ruc del cliente es "+nuevoIdCliente);
		listaProyecto=proyectoDao.readAllxId(nuevoIdCliente);
	}

	public void buscarFactura(){
		//usados solo como prueba dura
		//String numeroFactura="D000154";
		//String fechaPrevisto="10/10/16";
		
		listaGrilla=proyectoDao.buscarPorParametros(nuevoIdCliente, nuevoIdProyecto, numeroFactura, 
				fechaPrevistaCobro);
		
	}
	
	
	
	
	public String enviarControldeFacturas(){
    	System.out.println("llego aqui control facturas!!!");
    	
        return "registrarFactura?faces-redirect=true";
    }
    
    public void retornarControldeFacturas(){
    	proyectoDao.guardarCliente(nuevoIdCliente,nuevoIdProyecto,numeroFactura,
    			fechaPrevistaCobro,fechaPrevistaPago,subtotal,total,igv,
   			 retencion,detraccion,montoReal,esAprobado,estadoFactura);
    	System.out.println("retornando valores!!!");
    	//nuevoIdProyecto="";
    	numeroFactura="";
    	subtotal=0.0;
    	total=0.0;
    	retencion=0.0;
    	detraccion=0.0;
    	igv=0.0;
    	montoReal=0.0;
    	esAprobado="Aprobado";
    	estadoFactura="0";
    	fechaPrevistaCobro=new Date();
    	fechaPrevistaPago=new Date();
    	
   
    }
    
    public void limpiarCamposNueva(){
    	numeroFactura="";
    	subtotal=0.0;
    	total=0.0;
    	retencion=0.0;
    	detraccion=0.0;
    	igv=0.0;
    	montoReal=0.0;
    	esAprobado="Aprobado";
    	estadoFactura="0";
    	fechaPrevistaCobro=new Date();
    	fechaPrevistaPago=new Date();
    	
    }
       
    
    
    
    
    
    public String enviarNotaCredito(){
    	String idFacturaa = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get("codigoFactura");
    	
    	listaNotaCredito=proyectoDao.buscarNotaCreditoId(idFacturaa);
    	return "notaCredito?faces-redirect=true";    	
    }
    
    
      
    
    
        
    public String enviarVerAdelantos(){
    	String idFacturaa = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get("codigoFactura");
    	
    	listaAdelanto=proyectoDao.buscarAdelantoId(idFacturaa);
    	return "adelanto?faces-redirect=true";    	
    }


    
    


	

	public List<GrillaControlFactura> getListaGrilla() {
		return listaGrilla;
	}




	public void setListaGrilla(List<GrillaControlFactura> listaGrilla) {
		this.listaGrilla = listaGrilla;
	}

	

	
	
	

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	






	public String getEstadoFactura() {
		return estadoFactura;
	}



	public void setEstadoFactura(String estadoFactura) {
		this.estadoFactura = estadoFactura;
	}



	public String getNumeroFactura() {
		return numeroFactura;
	}



	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}



	public String getEsAprobado() {
		return esAprobado;
	}

	public void setEsAprobado(String esAprobado) {
		this.esAprobado = esAprobado;
	}
	
	
	public void guardarCredito(){
		//simulando
		notadeCredito=new NotadeCredito();
	//	NotadeCredito notadeCredito1=new NotadeCredito();
		notadeCredito.setIdnotaCredito(idnotaCredito);
	//	System.out.println("1 "+notadeCredito.getIdnotaCredito());
		notadeCredito.setAcreedot(acreedot);
		//System.out.println("2 "+notadeCredito.getAcreedot());
	
	notadeCredito.setDescripcion(descripcion);
	//	System.out.println("3 "+notadeCredito.getDescripcion());
		notadeCredito.setMontoNotaCredito(montoNotaCredito);
		notadeCredito.setFechaNotaCredito(fechaNotaCredito);
		listaNotaCredito.add(notadeCredito);
		listaNotaCredito.size();
		proyectoDao.guardarNotaCredito(idnotaCredito,acreedot, descripcion, 
				montoNotaCredito, fechaNotaCredito);
		montoNotaCredito=0.0;
		idnotaCredito="";
		acreedot="";
		descripcion="";
		fechaNotaCredito=new Date();
		
		
		
		
	}
	
	
	public void abrirDialogo(){
		System.out.println("entron al metodo que debe limpiar");
		notadeCredito=new NotadeCredito();
	}
	
	public void guardarAdelanto(){
		//simulando
		System.out.println("guardarAdelanto");
		Adelanto adelanto=new Adelanto();
		adelanto.setIdRegistro(idRegistro);
		adelanto.setFechaCobro(fechaCobro);
		adelanto.setMontoAdelanto(montoAdelanto);
		adelanto.setNumeroOperacion(numeroOperacion);
		adelanto.setNombreBanco(nombreBanco);
		adelanto.setEstadoAdelanto(estadoAdelanto);
		listaAdelanto.add(adelanto);
		//guardando en el daoBD
		proyectoDao.guardarAdelanto(idRegistro, fechaCobro, montoAdelanto, 
				numeroOperacion, nombreBanco);
		//adelanto=new Adelanto();
		idRegistro="";
		fechaCobro=new Date();
		montoAdelanto=0.0;
		numeroOperacion="";
		nombreBanco="";
		estadoAdelanto="0";
	}
	
	
	
	
	
	
	
	
		 
}
