package Ingetec.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Ingetec.conexion.Conexion;
import Ingetec.dto.Adelanto;
import Ingetec.dto.Egreso;
import Ingetec.dto.GrillaControlFactura;
import Ingetec.dto.GrillaProyecto;
import Ingetec.dto.Ingreso;
import Ingetec.dto.NotadeCredito;
import Ingetec.dto.Proyecto;
import Ingetec.interfaces.Interfaz;

public class ProyectoDao  implements Interfaz<Proyecto>{
	
	private static final Conexion con = Conexion.saberEstado();

	@Override
	public boolean create(Proyecto c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Proyecto c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Proyecto read(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proyecto> readAll() {
		String query = "{ call sp_get_proyectos() }";
		ResultSet rs;
		CallableStatement stmt;
		List<Proyecto> listaProyecto = new ArrayList<Proyecto>();
		try {
			
			stmt = con.getCnn().prepareCall(query);
			
			// ps=con.getCnn().prepareStatement(SQL_READALL);
			rs = stmt.executeQuery();
			// rs=ps.executeQuery();
			while (rs.next()) {
				listaProyecto.add(new Proyecto(rs.getString(1), rs.getString(2)));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE,null, ex);
		} finally {
			con.cerrarConexion();
		}
		return listaProyecto;
	}
	
	
	public List<Proyecto> readAllxId(String idCliente) {
		String query = "{ call sp_get_pryectos_id(?) }";
		ResultSet rs;
		CallableStatement stmt;
		List<Proyecto> listaProyecto = new ArrayList<Proyecto>();
		try {
			
			stmt = con.getCnn().prepareCall(query);
			stmt.setString(1, idCliente);
			// ps=con.getCnn().prepareStatement(SQL_READALL);
			rs = stmt.executeQuery();
			// rs=ps.executeQuery();
			while (rs.next()) {
				listaProyecto.add(new Proyecto(rs.getString(1), rs.getString(2)));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE,null, ex);
		} finally {
			con.cerrarConexion();
		}
		return listaProyecto;
	}
	
	
	
	public List<GrillaControlFactura> buscarPorParametros(String idCliente,
			String idProyecto,String numeroFactura,Date fechaPrevisto){
		List<GrillaControlFactura> listaControlFactura= new ArrayList<GrillaControlFactura>();
		List<Adelanto> listaAdelanto=new ArrayList<Adelanto>();
		List<NotadeCredito> listaNotaCredito=new ArrayList<NotadeCredito>();
		Adelanto adela=new Adelanto();
		adela.setIdRegistro("1");
		adela.setFechaCobro(new Date());
		adela.setMontoAdelanto(333.53);
		adela.setEstadoAdelanto("1");
		adela.setNombreBanco("BCP");
		adela.setNumeroOperacion("op123");
		listaAdelanto.add(adela);
		NotadeCredito nota=new NotadeCredito();
		nota.setIdnotaCredito("1");
		nota.setDescripcion("credito 1");
		nota.setFechaNotaCredito(new Date());
		nota.setMontoNotaCredito(5454.54);
		listaNotaCredito.add(nota);
		
		
		
	
		GrillaControlFactura factura=new GrillaControlFactura("cliente 01", "proyecto 1", 
				"F001", new Date(),  new Date(), 2000.00, 18885.0, 2500.0, 
				250.8, 28.2, 4545.0,true, "2");
		factura.setListaAdelanto(listaAdelanto);
		factura.setListaNotaCredito(listaNotaCredito);
		
		
		listaControlFactura.add(factura);
		
		
		
		//llamada al procedure
		return listaControlFactura;
		
	}
	
	public void guardarCliente(String nuevoIdCliente,String nuevoIdProyecto,String numeroFactura,
			Date fechaPrevistaCobro, Date fechaPrevistaPago,double subtotal,double total,double igv,
			double retencion, double detraccion,double montoReal,String esAprobado,String estadoFactura){
		System.out.println("guardando el cliente desde el procedimiento con los parametros correspondientes");
		
	}
	
	
	public List<GrillaProyecto> buscarProyectoPorParametros(String nombreProyecto,
			String idCliente,String estadoProyecto){
			List<GrillaProyecto> listaProyecto= new ArrayList<GrillaProyecto>();
			listaProyecto.add(new GrillaProyecto("9935","Entel","Proyecto Celular",5500.0, 
			3300.15, "OC-CLAP1", new Date(), new Date(),"En Ejecucion"));
			//llamada al procedure
		return listaProyecto;
	}
	
	
	
	
	
	
	
	
	
	public void guardarNotaCredito(String idnotaCredito,String acreedot,String descripcion,
	Double montoNotaCredito,Date fechaNotaCredito){
		System.out.println("guardando el no de credito");
	}

	public List<NotadeCredito> buscarNotaCreditoId(String idFacturaa) {
		List<NotadeCredito> listaPrueba=new ArrayList<NotadeCredito>();
		NotadeCredito nota=new NotadeCredito("001", "Movistar", "Empresa de Telefono", 255.69, new Date());
		listaPrueba.add(nota);
		return listaPrueba;
	}
	
	
	public List<Adelanto> buscarAdelantoId(String idFacturaa) {
		List<Adelanto> listaPrueba=new ArrayList<Adelanto>();
		Adelanto adelanto=new Adelanto("001", new Date(), 2558.05, "85", "BBVA", "2");
		listaPrueba.add(adelanto);
		return listaPrueba;
	}
	
	public void guardarAdelanto(String idRegistro,Date fechaCobro,double montoAdelanto,String numeroOperacion,
	String nombreBanco){
		System.out.println("guardando el adelanto");
		
	}
	
	public List<Egreso> listaEgreso(String idProyecto){
		List<Egreso> listaEgresos=new ArrayList<Egreso>();
		//llamar al procedimiento del gordo 
		Egreso egreso=new Egreso("001", "23212", new Date(), new Date(), 
				new Date(), "4", "No llega", "Paitan Echabaudis Francisco", "PROYECTO 01", 0.0, 
				4323.4, 23.0, 3243.33, "PEN", 0.0, "Si", 
				28, "Pro","Pendiente");
		listaEgresos.add(egreso);
		return listaEgresos;
		
	}
	
	public List<Ingreso> listaIngreso(String idProyecto){
		List<Ingreso> listaIngreso=new ArrayList<Ingreso>();
		//llamar al procedimiento del gordo
		Ingreso ingreso=new Ingreso("1", "F001", new Date(), new Date(), 
				4000.0,758.5, 4785.5, 500.25, 0.0, 5856.3, "CANCELADO");
		listaIngreso.add(ingreso);
		return listaIngreso;
	}

	public GrillaProyecto buscarAtributo(String codigoIdProyecto) {
		// TODO Auto-generated method stub
		System.out.println("entro al metodo del dao por buscarAtributo");
		GrillaProyecto grillaProyecto=
		new GrillaProyecto("9935","Entel","Proyecto Celular",5500.0, 
				3300.15, "OC-CLAP1", new Date(), new Date(),"En Ejecucion");
	    
		return grillaProyecto;
	}
	
	
	
	

	
	
	

}
