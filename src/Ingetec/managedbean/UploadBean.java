package Ingetec.managedbean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Ingetec.dao.AdministrativoDao;
import Ingetec.dto.Gastos;

@ManagedBean(name = "pruebaArchivoBean")
@SessionScoped
public class UploadBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UploadedFile file;
	private Integer idGasto;
	private Integer anio;
	private Integer mes;
	private String tipoGasto;
	private String detalleTipoGasto;
	private double montoGasto;

	AdministrativoDao administrativoDao = new AdministrativoDao();

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void subirArchivo(FileUploadEvent event) {
		File destFile = null;
		try {

			this.file = event.getFile();
			// InputStream inputStream = this.file.getInputstream();
			// File file2 = new File(this.file.getContentType());
			// System.out.println("la ruta absoluta es "+file2.getAbsolutePath());

			destFile = new File(this.file.getFileName());

			FileUtils.copyInputStreamToFile(event.getFile().getInputstream(),
					destFile);
			System.out.println("la ruta del archivo es "
					+ destFile.getAbsolutePath());
			System.out
					.println("el nombre del archivo es " + destFile.getName());

			// getFileExtension.

			String ext = getFileExtension(destFile);
			System.out.println("la extension del archivo es " + ext);

			// File initialFile = new File("src/main/resources/sample.txt");
			InputStream targetStream = FileUtils.openInputStream(destFile);

			// leerArchivoExcel(destFile);
			leerArchivoExcel(targetStream, ext);
			FacesMessage message = new FacesMessage("El archivo",
					file.getFileName() + " fue registrado!!");
			FacesContext.getCurrentInstance().addMessage(null, message);
		} catch (Exception e) {
			System.out.println("excepcion " + e.getMessage());
		} finally {
			destFile = null;
		}

	}

	private static String getFileExtension(File file) {
		String fileName = file.getName();
		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			return fileName.substring(fileName.lastIndexOf(".") + 1);
		else
			return "";
	}

	public void leerArchivoExcel(InputStream file2, String ext) {

		// FileInputStream file = new FileInputStream(new
		// File("C:\\prueb_excel.xls"));
		// Crear el objeto que tendra el libro de Excel

		// revisa y piensa para mañana, tambien hacer todas las paginas a
		// formato decente ya!!!!/*/
		HSSFWorkbook workbook = null;
		XSSFWorkbook workbook2 = null;

		try {

			/*
			 * HSSFWorkbook workbook=null; XSSFWorkbook workbook2 = null;
			 */
			Iterator<Row> rowIterator;

			if (ext.equals("xlsx") || ext.equals("XLSX")) {

				workbook2 = new XSSFWorkbook(file2);// para 2010
				XSSFSheet sheet = workbook2.getSheetAt(0);
				rowIterator = sheet.iterator();

			} else {

				workbook = new HSSFWorkbook(file2);// para 97-2003-2007 o xls
				HSSFSheet sheet = workbook.getSheetAt(0);
				rowIterator = sheet.iterator();
			}

			System.out.println("llego aqui 222");
			System.out.print(rowIterator.toString());
			// rowIterator = sheet.iterator();

			/*
			 * Obtenemos la primera pestaña a la que se quiera procesar
			 * indicando el indice. Una vez obtenida la hoja excel con las filas
			 * que se quieren leer obtenemos el iterator que nos permite
			 * recorrer cada una de las filas que contiene.
			 */
			// HSSFSheet sheet = workbook.getSheetAt(0);

			// rowIterator = sheet.iterator();

			Row row;
			// Recorremos todas las filas para mostrar el contenido de cada
			// celda
			
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				System.out.println("primer while");
				// Obtenemos el iterator que permite recorres todas las celdas
				// de una fila
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell celda;
				//INT K=0;
				int k=0;
				while (cellIterator.hasNext()) {
					System.out.println("segundo while  "+k);
					celda = cellIterator.next();

					switch (celda.getCellType()) {

					case Cell.CELL_TYPE_NUMERIC:
						if(k==0){
						idGasto=(int)celda.getNumericCellValue();break;}
						if(k==1){
						anio=(int)celda.getNumericCellValue();break;}
						if(k==2){mes=(int)celda.getNumericCellValue();break;}
						if(k==5){montoGasto=celda.getNumericCellValue();break;}
					//	String ok=String.valueOf(celda.getNumericCellValue());
					//	System.out.println(celda.getNumericCellValue());
						
					case Cell.CELL_TYPE_STRING:
						if(k==3){
						tipoGasto=celda.getStringCellValue();break;}
					    if(k==4){detalleTipoGasto=celda.getStringCellValue();break;}
						//System.out.println(celda.getStringCellValue());
					
					/*case Cell.CELL_TYPE_BOOLEAN:
						System.out.println(celda.getBooleanCellValue());
						break;*/
					}

				/*
					 switch(k){ 
					 case 0:idGasto=(int)celda.getNumericCellValue();System.out.println("idGasto "+idGasto);;break;
					  case 1: anio=String.valueOf((int)(celda.getNumericCellValue()));System.out.println("anio "+anio);break;
					  case 2: mes=String.valueOf((int) celda.getNumericCellValue());System.out.println("mes "+mes);break; 
					  case 3: tipoGasto=celda.getStringCellValue();System.out.println("tipoGasto "+tipoGasto);break; 
					  case 4:  detalleTipoGasto=celda.getStringCellValue();System.out.println("detalleTipoGasto "+detalleTipoGasto);break;
					  case 5: montoGasto=  celda.getNumericCellValue();System.out.println("montoGasto "+montoGasto);break;
					  //().replace(",","."));break; 
					  default:System.out.println(
					  "problemas, el excel tiene un formato inapropiado para el trabajo"); }
				

				}*/
				k=k+1;
				
			}
				administrativoDao.subirArchivo(idGasto, anio, mes, tipoGasto,
						detalleTipoGasto, montoGasto);
				}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("llego aqui");
			e1.printStackTrace();
		}

		
		 finally{ // cerramos el libro excel 
			 if(workbook2!=null){
		 workbook2=null; } if(workbook!=null){ workbook=null; }
		 
		 }
		

	}

/*	public void leerArchivoExcel2003(File file2) {

		try {
			Workbook archivoExcel = Workbook.getWorkbook(file2); // getWorkbook(file3);;
			// System.out.println("archivo excel esta en "+archivoExcel.get);
			System.out.println("Número de Hojas\t"
					+ archivoExcel.getNumberOfSheets());
			for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++)
			// Recorre cada hoja
			{
				Sheet hoja = archivoExcel.getSheet(sheetNo);
				int numColumnas = hoja.getColumns();
				int numFilas = hoja.getRows();
				String data;
				System.out.println("Nombre de la Hoja\t"
						+ archivoExcel.getSheet(sheetNo).getName());
				for (int fila = 0; fila < numFilas; fila++) { // Recorre cada
																// fila de la
																// hoja

					for (int columna = 0; columna < numColumnas; columna++) {
						// Recorre cada columna de la fila
						data = hoja.getCell(columna, fila).getContents();
						switch (columna) {
						case 0:
							idGasto = Integer.parseInt(data);
							break;
						case 1:
							anio = data;
							break;
						case 2:
							mes = data;
							break;
						case 3:
							tipoGasto = data;
							break;
						case 4:
							detalleTipoGasto = data;
							break;
						case 5:
							montoGasto = Double.parseDouble(data.replace(",",
									"."));
							break;
						default:
							System.out
									.println("problemas, el excel tiene un formato inapropiado para el trabajo");
						}
					}
					administrativoDao.subirArchivo(idGasto, anio, mes,
							tipoGasto, detalleTipoGasto, montoGasto);

					// System.out.print(data + " ");

				}
				// System.out.println("\n");
			}
		} catch (Exception ioe) {
			ioe.printStackTrace();
		}

	}*/

}
