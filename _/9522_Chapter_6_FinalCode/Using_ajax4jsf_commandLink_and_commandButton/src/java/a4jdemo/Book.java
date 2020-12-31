package a4jdemo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "book")
@SessionScoped
public class Book {

	private int pagenr = 1;

	public int getPagenr() {
		return pagenr;
	}

	public void setPagenr(int pagenr) {
		this.pagenr = pagenr;
	}
	  
	 public void pageItForward() {
		    pagenr = pagenr + 1;		    
		  }
	 
	 public void pageItBackwards() {
		    pagenr = pagenr - 1;		    
		  }		    	  
}
