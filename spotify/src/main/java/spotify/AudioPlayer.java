package spotify;

import java.util.List;
import java.util.stream.Stream;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@Tag("audio")
public class AudioPlayer extends Component {

    public AudioPlayer(){
        getElement().setAttribute("controls",true);
        getElement().setAttribute("autoplay", true);
    }

    public void setSource(String path){
        getElement().setProperty("src",path);
    }
    
    public int getDuration() {
    	//No funcional aun
    	return Integer.parseInt(getElement().getAttribute("duration"));
    }
}
