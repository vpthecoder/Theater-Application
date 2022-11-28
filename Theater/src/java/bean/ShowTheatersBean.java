/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import EJB.theaterEJB;
import entity.MOVIES;
import entity.THEATERS;
import entity.TIMES;
import entity.ZIPCODES;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

import javax.faces.context.FacesContext;

/**
 *
 * @author vedantprakash
 */
@Named(value = "showTheatersBean")
//Session scoped
@SessionScoped
public class ShowTheatersBean implements Serializable   {

        //EJB 
    @EJB
    private theaterEJB theaterEJB;
    
    
    // private variables
    private ZIPCODES zipcode;
    private THEATERS theater;
    private MOVIES movie;
   private TIMES time;
   private List<THEATERS> list1;
   private List<MOVIES> list2;
   private List<TIMES> list3;
    
   //getters and setters
    public ZIPCODES getZipcode() {
        return zipcode;
    }

    public void setZipcode(ZIPCODES zipcode) {
        this.zipcode = zipcode;
    }

    public THEATERS getTheater() {
        return theater;
    }

    public void setTheater(THEATERS theater) {
        this.theater = theater;
    }

    public MOVIES getMovie() {
        return movie;
    }

    public void setMovie(MOVIES movie) {
        this.movie = movie;
    }

    public TIMES getTime() {
        return time;
    }

    public void setTime(TIMES time) {
        this.time = time;
    }

    public List<THEATERS> getList1() {
        return list1;
    }

    public void setList1(List<THEATERS> list1) {
        this.list1 = list1;
    }

    public List<MOVIES> getList2() {
        return list2;
    }

    public void setList2(List<MOVIES> list2) {
        this.list2 = list2;
    }

    public List<TIMES> getList3() {
        return list3;
    }

    public void setList3(List<TIMES> list3) {
        this.list3 = list3;
    }

    
    
    
    
   
    
  
    
    
    //stores list of theaters in list1 from ejb named query
    public String showTheaters() {
       FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
        fc.getExternalContext().getRequestParameterMap();
     String zip =  params.get("zip"); 
       
     
       list1 = theaterEJB.getTheaterDetails(zip);
     return "ShowTheaters.xhtml";
    }
    
    
    
    //stores list of movies in list2 from ejb named query
    public String showMovies()
    {
         FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
        fc.getExternalContext().getRequestParameterMap();
      String id =  params.get("id"); 
           list2 = theaterEJB.getMovies(id);
        return "ShowMovies.xhtml";
    }
    
    //stores list of times in list3 from ejb named query
    public String showTimes()
    {
         FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
        fc.getExternalContext().getRequestParameterMap();
      String mid = params.get("mid");
           list3 = theaterEJB.getTimesForMovies(mid);
        return "ShowTimes.xhtml";
    }
    
    
    
    

    /**
     * Creates a new instance of ShowTheatersBean
     */
    public ShowTheatersBean() {
    }
    
}
