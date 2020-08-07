package org.mp.sesion06;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.*;

public class UtilidadArchivos {

	private ArrayList<File> lista = new ArrayList<File>();

	public UtilidadArchivos() {

	}

	public static void copiar(File origen, File destino) {

		try {
			Files.copy(origen.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList listarDirectoriosArchivos(File dir) {
		this.lista = new ArrayList<File>();
		listarDirectoriosArchivosRec(dir);
		return lista;
	}

	private void listarDirectoriosArchivosRec(File dir) {
		// TODO Auto-generated method stub
	}

	public void zip(File directorio, String caminoSalida, String nombreArchivo) {
		/*listarDirectoriosArchivos(directorio);
		String localDirectory = directorio.getParentFile().getAbsolutePath() + File.separator;
		byte[] buffer = new byte[1024];
		String outAbsolutePath = salida + File.separator + nombreFichero;
		try {
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outAbsolutePath));
			zos.setLevel(Deflater.BEST_COMPRESSION);
		
			for (File f : lista) {
				if (f.isFile()) {
					FileInputStream fis = new FileInputStream(f);
					zos.putNextEntry(new ZipEntry(f.getAbsolutePath().replace(localDirectory, "")));
					int length;
					while ((length = fis.read(buffer)) > 0) {
						zos.write(buffer, 0, length);
					}
					zos.closeEntry();
					fis.close();
				}
			}
			zos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		listarDirectoriosArchivos(directorio);
		byte[] buffer = new byte[1024];
		try {
			String archivoSalida = caminoSalida + File.separator + nombreArchivo;
			ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(archivoSalida));
			
			for(Iterator iter = lista.iterator(); iter.hasNext();) {
				File elemento = ((File) iter.next());
				if(elemento.isFile()) {
					FileInputStream fis = new FileInputStream(elemento.getAbsolutePath());
					zos.putNextEntry(new ZipEntry(elemento.getAbsolutePath()));
					int len;
					while((len = fis.read(buffer))>0) {
						zos.write(buffer, 0, len);
					}
					
					zos.closeEntry();
				}
				
			}
			}catch(IOException e) {
				e.printStackTrace();
		}
		
	}

}
