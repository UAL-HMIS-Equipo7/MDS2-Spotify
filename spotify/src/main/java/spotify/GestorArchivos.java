package spotify;

import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Base64;

import org.apache.catalina.webresources.FileResource;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;

public class GestorArchivos {
	
	private static final String _path = "src/main/webapp/";
	
	public static String SubirImagen(MemoryBuffer memBuffer) {
		
		String ruta = "img/"+memBuffer.getFileName();

        InputStream is = memBuffer.getInputStream();
        
        try {
            OutputStream os = new FileOutputStream(_path + ruta);
            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = is.read(buffer)) != -1){
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            //flush OutputStream to write any buffered data to file
            os.flush();
            os.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
		return ruta;
	}
	
	public static String SubirAudio(MemoryBuffer memBuffer) {
		
		String ruta = "audio/"+memBuffer.getFileName();

        InputStream is = memBuffer.getInputStream();
        
        try {
            OutputStream os = new FileOutputStream(_path + ruta);
            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = is.read(buffer)) != -1){
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            //flush OutputStream to write any buffered data to file
            os.flush();
            os.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
		return ruta;
	}
	
	public static String CargarImagen(String ruta) {
		return ruta;
	}
	
	public static String CargarAudio(String ruta) {
		return ruta;
	}
}
