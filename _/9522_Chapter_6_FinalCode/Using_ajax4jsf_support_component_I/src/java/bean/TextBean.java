package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="textBean")
@RequestScoped
public class TextBean {
   private String text;   
  
   public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void upperText() {
	this.text = this.text.toUpperCase();        
   }

}
