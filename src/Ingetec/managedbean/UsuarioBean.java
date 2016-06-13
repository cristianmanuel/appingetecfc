/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingetec.managedbean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import Ingetec.Util.Util;

@ManagedBean(name = "loginUsuario")
@SessionScoped
public class UsuarioBean implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Creates a new instance of Usuario
     */
    public UsuarioBean() {
    }
	
	private String nombreUsuario;
    private String clave;
    private String mensaje="";
    private boolean entrada=false;
    
    
    
    

    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isEntrada() {
		return entrada;
	}

	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}

	public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    public void loguear(){
    	if(nombreUsuario.equals("admin") && clave.equals("1234")){
    		HttpSession hs=Util.getSession();
    		hs.setAttribute("nombreUsuario",nombreUsuario);
    		entrada=true;
    		doRedirect("bienvenido.xhtml");
    		//return "bienvenido?faces-redirect=true";
    		//return "bienvenido.xhtml";
    		
    	}else{
    		FacesMessage fe= new FacesMessage("Error en el logueo","ERROR MSG");
    		fe.setSeverity(FacesMessage.SEVERITY_ERROR);
    		FacesContext.getCurrentInstance().addMessage(null, fe);
    		mensaje="Credenciales incorrectas";
    		doRedirect("login.xhtml");
    		//return "login.xhtml";
    	}
    }
    
    public void verifyLogin(){
    	if(!this.entrada){
    		doRedirect("login.xhtml");
    	}
    	
    }
    
    private void doRedirect(String url){
    	try{
    		FacesContext fc=FacesContext.getCurrentInstance();
    		fc.getExternalContext().redirect(url);
    		
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    	
    }
   
    public void salirSistema(){
    		HttpSession hs=Util.getSession();
    		entrada=false;
    		hs.invalidate();
    		doRedirect("login.xhtml");
    		//return "login?faces-redirect=true";
    	}
    	
  
    public String enviarPagoProveedores(){
        return "pagoProveedores?faces-redirect=true";
    }
    
    public String enviarProyectos(){
        return "proyecto?faces-redirect=true";
    }
    
    
    public String enviarGastosAdministrativos(){
    	return "gastosAdministrativos?faces-redirect=true";
    }
    
    public String enviarCajaChica(){
    	return "cajaChica?faces-redirect=true";
    }
    
    public String enviarPrestamos(){
    	return "prestamos?faces-redirect=true";
    }
    
    public String enviarTraspasoEfectivo(){
    	return "traspasoEfectivo?faces-redirect=true";
    }
    
    public String enviarPendienteDetracciones(){
    	return "pendienteDetracciones?faces-redirect=true";
    }
    
    
    public String enviarSincronizarInformacion(){
    	return "sincronizar?faces-redirect=true";
    }
 
    
    public String enviarControldeFacturas(){
    	return "controldeFacturas?faces-redirect=true";
    }
    
    
    public String enviarAdelanto(){
        return "adelanto?faces-redirect=true";
    }
    
     public String enviarNotaCredito(){
         System.out.println("enviando nota credito");
        return "notaCredito?faces-redirect=true";
    }
     
     
     public String enviarFlujoSoles(){
         System.out.println("enviando nota credito");
        return "flujoSoles?faces-redirect=true";
    }
     
     public String enviarFlujoDolares(){
         System.out.println("enviando nota credito");
        return "flujoDolares?faces-redirect=true";
    }
    
 
    }
    

