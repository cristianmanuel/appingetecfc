package Ingetec.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;







import Ingetec.dto.Cajachica;
import Ingetec.dto.GrillaGastosAdministrativos;
import Ingetec.dto.GrillaPendienteDetraccion;
import Ingetec.interfaces.Interfaz;

public class AdministrativoDao implements Interfaz<GrillaGastosAdministrativos>  {

	@Override
	public boolean create(GrillaGastosAdministrativos c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(GrillaGastosAdministrativos c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GrillaGastosAdministrativos read(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GrillaGastosAdministrativos> readAll() {
		List<GrillaGastosAdministrativos> listaAdminisrativa=new ArrayList<GrillaGastosAdministrativos>();
		GrillaGastosAdministrativos objeto=new GrillaGastosAdministrativos("1","2016", "Enero",225645.65);
		GrillaGastosAdministrativos objeto1=new GrillaGastosAdministrativos("2","2016", "Febrero",22235.65);
		GrillaGastosAdministrativos objeto2=new GrillaGastosAdministrativos("3","2016", "Marzo",345045.65);
		GrillaGastosAdministrativos objeto3=new GrillaGastosAdministrativos("4","2016", "Abril",5445.65);
		GrillaGastosAdministrativos objeto4=new GrillaGastosAdministrativos("5","2016", "Mayo",645445.65);
		listaAdminisrativa.add(objeto);
		listaAdminisrativa.add(objeto1);
		listaAdminisrativa.add(objeto2);
		listaAdminisrativa.add(objeto3);
		listaAdminisrativa.add(objeto4);
		return listaAdminisrativa;
	}

	public void eliminarObjeto(String indice) {
		System.out.println("llamando al metodo de percy delete borrando el indice "+indice);
		
	}
	
	public void subirArchivo(Integer idGasto,Integer anio,Integer mes,String tipoGasto,String detalleTipoGasto,double montoGasto){
		System.out.println("grabando archivo en base de datos con los datos requeridos" );
		System.out.println("el ID es "+idGasto+" el año es "+anio+" mes "+mes+" tipo de Gasto "+tipoGasto+" detalle del gasto "+detalleTipoGasto+" y el monto "+montoGasto);
	}
	
	public List<GrillaPendienteDetraccion> cargarGrillaDetracciones(){
		List<GrillaPendienteDetraccion> listaGrilla2=new ArrayList<GrillaPendienteDetraccion>();
		GrillaPendienteDetraccion grilla;
		grilla=new GrillaPendienteDetraccion();
		grilla.setBeneficiario("Vas Consultores Sac");
		grilla.setClaseGasto("Servicios");
		grilla.setFechaComp(new Date());
		grilla.setMonedaDet("Dolares");
		grilla.setMonedaComp("Soles");
		grilla.setMontoDet(5550.20);
		grilla.setNombreComprobante("Factura");
		grilla.setNroComprobante("0001-132");
		grilla.setNroValidac("AD03174");
		grilla.setaPagar(48558.25);
		grilla.setPagoPorceDete(10.0);
		grilla.setProyecto("Jatun Rumi LMT EW");
		grilla.setTotComp(985);
		
		listaGrilla2.add(grilla);
		grilla=new GrillaPendienteDetraccion();
		grilla.setBeneficiario("Contratista Especializada de Ingenieria SAC - Coesing S.A.C.");
		grilla.setaPagar(54328.21);
		grilla.setClaseGasto("Servicios");
		grilla.setFechaComp(new Date());
		grilla.setMonedaDet("Dolares");
		grilla.setMonedaComp("Soles");
		grilla.setMontoDet(124320.20);
		grilla.setNombreComprobante("Factura");
		grilla.setNroComprobante("0001-131");
		grilla.setNroValidac("AD031785");
		grilla.setPagoPorceDete(4.0);
		grilla.setProyecto("Rep Co Bajo Pichanaki LMT EW");
		grilla.setTotComp(54343);
		listaGrilla2.add(grilla);
		System.out.println("cargando lista detracciones desde el dao");
		return listaGrilla2;
		
			
	}
	
	
	public List<Cajachica> cargarGrillaCajaChica(){
		System.out.println("cargando desde el dao");
		List<Cajachica> listaChica=new ArrayList<Cajachica>();
		Cajachica cajaChica;
		
		for(int i=0;i<5;i++){
		cajaChica=new Cajachica();
		cajaChica.setCodProve("0001");
		cajaChica.setTtotal(74589.25);
		cajaChica.setPedido("PC01470-13-Nov-15");
		cajaChica.setComprob("Comp. paraTerceros");
		cajaChica.setnComprob("215-015");
		cajaChica.settGasto("Devolucion en efectivo");
		cajaChica.setProveedor("ATC Sitios ddel Peru");
		cajaChica.setProyecto("Reembolsos 2015 EW");
		cajaChica.setResponsable("Villanueva Orcon Heine Mitse");
		cajaChica.setMoneda("Soles");
		cajaChica.setiGVTotal(1555.6);
		cajaChica.setfCompro(new Date());
		cajaChica.setDevoluc(3242.3);
		cajaChica.setFondo(834);
		cajaChica.setMonto(8765);
		cajaChica.setReembolso(6585);
		cajaChica.setRucProve("454565656");
		cajaChica.setValor(88766);
	
		listaChica.add(cajaChica);
		}
	
		return listaChica;
		

	}
}
