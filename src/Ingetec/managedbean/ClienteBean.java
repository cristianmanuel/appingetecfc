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
import javax.faces.model.SelectItem;

import Ingetec.dao.ClienteDao;
import Ingetec.dto.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Cliente> listaCliente=new ArrayList<Cliente>();
    private int nuevoIdCliente;
    private Date fechaPrevistaCobro;
    List<Cliente> listaClienteGuardado=new ArrayList<Cliente>();
    private String aprobado;
    
    public String getAprobado() {
		return aprobado;
	}

	public void setAprobado(String aprobado) {
		this.aprobado = aprobado;
	}

	ClienteDao clienteDao=new ClienteDao();
    public ClienteBean() {
        listaCliente=clienteDao.readAll();
    }
    
   /* public List<SelectItem> cargarComboCliente(){
        listaCliente=clienteDao.readAll();
        List<SelectItem> listaZona=new ArrayList<SelectItem>();
        //List<Cliente> comboCliente=new ArrayList<Cliente>();
        for(int i=0;i<listaCliente.size();i++){
            listaZona.add(new SelectItem(listaCliente.get(i).getIdCLiente(),listaCliente.get(i).getNombreCliente()));
        }
        return listaZona;
    }*/
    
    public List<Cliente> cargarComboCliente2(){
        return clienteDao.readAll();
    }

    
    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public int getNuevoIdCliente() {
        return nuevoIdCliente;
    }

    public void setNuevoIdCliente(int nuevoIdCliente) {
        this.nuevoIdCliente = nuevoIdCliente;
    }

    public Date getFechaPrevistaCobro() {
        return fechaPrevistaCobro;
    }

    public void setFechaPrevistaCobro(Date fechaPrevistaCobro) {
        this.fechaPrevistaCobro = fechaPrevistaCobro;
    }

    public List<Cliente> getListaClienteGuardado() {
        return listaClienteGuardado;
    }

    public void setListaClienteGuardado(List<Cliente> listaClienteGuardado) {
        this.listaClienteGuardado = listaClienteGuardado;
    }
    
    
    
    
    public String guardarSeleccionados(){
        for(Cliente p:listaCliente){
            if(p.isSelect()){
                listaClienteGuardado.add(p);
            }
        }
        if(!listaClienteGuardado.isEmpty()){
            //metodo guardar del dao
            //listaPersona.removeAll(lista_eliminados);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Guardados"));
        }
        return "index";
    }
    
    
    
  
    
    
    
    
    
}
