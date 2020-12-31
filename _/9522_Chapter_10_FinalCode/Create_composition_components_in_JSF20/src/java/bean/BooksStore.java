/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@SessionScoped
public class BooksStore {

    private List books = new ArrayList();

    public BooksStore() {
        books.add(new Book("Learning Website Development with Django", "Ayman Hourieh", "€26.34"));
        books.add(new Book("Building Websites with Joomla! 1.5", "Hagen Graf", "€29.74"));
        books.add(new Book("ASP.NET 3.5 Application Architecture and Design", "Vivek Thakur", "€30.99"));
        books.add(new Book("Drupal 6 Themes", "Ric Shreves", "€26.34"));
        books.add(new Book("WordPress Theme Design", "Tessa Blakeley Silver", "€26.34"));
    }

    public List getBooks() {
        return books;
    }

    public void setBooks(List books) {
        this.books = books;
    }

    public void sortBooks() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        HttpServletRequest httpServletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();

        String by = httpServletRequest.getParameter("by");
        String order = httpServletRequest.getParameter("order");

        System.out.println("The books should be order " + order + " by " + by + "!");

        //ordering books
    }
}
