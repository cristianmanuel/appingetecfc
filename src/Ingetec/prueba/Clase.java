/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingetec.prueba;

import java.util.ArrayList;
import java.util.List;

import Ingetec.dao.ClienteDao;
import Ingetec.dao.ProveedorDao;
import Ingetec.dao.ProyectoDao;
import Ingetec.dto.Cliente;
import Ingetec.dto.Proveedor;
import Ingetec.dto.Proyecto;

/**
 *
 * @author cristian manuel
 */
public class Clase {
    public static void main(String[] args){
      ClienteDao cl=new ClienteDao();
        List<Cliente> c=new ArrayList<Cliente>();
        c=cl.readAll();
        System.out.println(c.size());
        
        ProveedorDao por=new ProveedorDao();
        List<Proveedor> p=new ArrayList<Proveedor>();
        p=por.readAll();
        System.out.println("lista proveedor es "+p.size());
        
        ProyectoDao pro=new ProyectoDao();
        List<Proyecto> pr=new ArrayList<Proyecto>();
        pr=pro.readAllxId("013");
        System.out.println("lista proyecto tiene "+pr.size());
        
    }
}
