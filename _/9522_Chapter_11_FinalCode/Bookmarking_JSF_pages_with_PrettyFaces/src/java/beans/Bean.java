/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Anghel Leonard
 */
@ManagedBean
@SessionScoped
public class Bean {

    private String hello = "";

    public Bean() {
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void upperHello() {
        this.hello = this.hello.toUpperCase();
    }

    public String beanURL(){
        return "/faces/hello3.xhtml";        
    }
}
