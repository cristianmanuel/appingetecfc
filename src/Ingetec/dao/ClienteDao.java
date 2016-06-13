package Ingetec.dao;

import java.net.ConnectException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



import Ingetec.conexion.Conexion;
import Ingetec.dto.Cliente;
import Ingetec.interfaces.Interfaz;

public class ClienteDao implements Interfaz<Cliente> {

	private static final String SQL_INSERT = "INSERT INTO cliente values (?,?)";
	private static final String SQL_READ = "select * from cliente where idCliente=?";
	private static final String SQL_READALL = "select * from cliente";
	
	@Override
	public boolean create(Cliente c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente read(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	private static final Conexion con = Conexion.saberEstado();// aplica el
																// patron
																// singleton al
																// dao
	/*
	 * @Override public boolean create(Cliente c) { PreparedStatement ps; try {
	 * ps = con.getCnn().prepareStatement(SQL_INSERT); ps.setInt(1,
	 * c.getIdCLiente()); ps.setString(2, c.getNombreCliente()); if
	 * (ps.executeUpdate() > 0) { return true; } } catch (SQLException ex) {
	 * Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
	 * } finally { con.cerrarConexion(); } return false; }
	 */

	@Override
	public boolean delete(Object key) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public boolean update(Cliente c) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	/*
	 * @Override public Cliente read(Object key) { PreparedStatement ps;
	 * ResultSet rs; Cliente c = null;
	 * 
	 * try { ps = con.getCnn().prepareStatement(SQL_READ); ps.setString(1,
	 * key.toString()); rs = ps.executeQuery(); while (rs.next()) { c = new
	 * Cliente(rs.getInt(1), rs.getString(2)); } return c; }catch (SQLException
	 * ex) { Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE,
	 * null, ex); }finally{ con.cerrarConexion(); } return c;
	 * 
	 * }
	 * 
	 * 
	 * @Override public List<Cliente> readAll() { PreparedStatement ps;
	 * ResultSet rs; List<Cliente> listaCliente=new ArrayList<Cliente>(); try {
	 * ps=con.getCnn().prepareStatement(SQL_READALL); rs=ps.executeQuery();
	 * while(rs.next()){ listaCliente.add(new
	 * Cliente(rs.getInt(1),rs.getString(2))); } } catch (SQLException ex) {
	 * Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
	 * }finally{ con.cerrarConexion(); } return listaCliente;
	 * 
	 * }
	 */

	@Override
	public List<Cliente> readAll() {
		
		String query = "{ call get_clientes() }";
		ResultSet rs;
		CallableStatement stmt;
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		try {
			
			stmt = con.getCnn().prepareCall(query);
			// ps=con.getCnn().prepareStatement(SQL_READALL);
			rs = stmt.executeQuery();
			// rs=ps.executeQuery();
			while (rs.next()) {
				listaCliente.add(new Cliente(rs.getString(1), rs.getString(2)));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE,
					null, ex);
		} finally {
			con.cerrarConexion();
		}
		return listaCliente;

	}

	

}
