package spotify;

import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;

public class SubirImagen {
	
	public static String Upload(MemoryBuffer memBuffer) {
		
		String ruta = "img/"+memBuffer.getFileName();

        InputStream is = memBuffer.getInputStream();
        
        try {
            OutputStream os = new FileOutputStream("./src/main/webapp/img/" + memBuffer.getFileName());
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
}
