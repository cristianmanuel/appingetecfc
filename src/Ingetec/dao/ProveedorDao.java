package Ingetec.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Ingetec.dto.GrillaControlFactura;
import Ingetec.dto.GrillaPagoProveedores;
import Ingetec.dto.Proveedor;
import Ingetec.conexion.Conexion;
import Ingetec.interfaces.Interfaz;

public class ProveedorDao implements Interfaz<Proveedor>{
	private static final Conexion con = Conexion.saberEstado();

	@Override
	public boolean create(Proveedor c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Proveedor c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Proveedor read(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proveedor> readAll() {
		String query = "{ call get_proveedores() }";
		ResultSet rs;
		CallableStatement stmt;
		List<Proveedor> listaProveedor = new ArrayList<Proveedor>();
		try {
			
			stmt = con.getCnn().prepareCall(query);
			// ps=con.getCnn().prepareStatement(SQL_READALL);
			rs = stmt.executeQuery();
			// rs=ps.executeQuery();
			while (rs.next()) {
				listaProveedor.add(new Proveedor(rs.getString(1), rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE,null, ex);
		} finally {
			con.cerrarConexion();
		}
		return listaProveedor;
	}
	
	public List<GrillaPagoProveedores> buscarPorParametros2(String idCProveedor,
			String idProyecto,String numeroComprobante,Date fechaPrevisto,String idEstado){
		List<GrillaPagoProveedores> listaGrillaPagoProveedores= new ArrayList<GrillaPagoProveedores>();
		
		/*
		 * (String tipoComprobante, String nComprobante,
			Date fechaComp, Date fechaValid, Date fechaPagoPrev, String nPago,
			String tipoGasto1, String proveedor, String proyecto,
			String montoOc, String montoSolic, String porcentaje,
			String validado, String moneda, String detraccion,
			String bancarizado, String nroSemana, String tipoGasto2,
			String marca)
		 * */
		System.out.println("llamando al metodo buscar desde el dao");
		
		listaGrillaPagoProveedores.add(new GrillaPagoProveedores("Planilla","1212",new Date(),
				new Date(),new Date(),"CF-55563","Sarvicios","Lopez Consultores","Gastos Administrativos",
				"0","7500","100","4500","PEN","0","--","53","G-FI","--"));
		
		//llamada al procedure
		return listaGrillaPagoProveedores;
		
	}
	
	
	
	
	public void guardarCliente(String nuevoIdCliente,String nuevoIdProyecto,String numeroFactura,
			Date fechaPrevistaCobro, Date fechaPrevistaPago,Integer subtotal,Integer total,
			 Integer retencion, Integer detraccion,Integer montoReal,String esAprobado,String estadoFactura){
		System.out.println("guardando el cliente desde el procedimiento con los parametros correspondientes");
		
	}
	
	
	

}
