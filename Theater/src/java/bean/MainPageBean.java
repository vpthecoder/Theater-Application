/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import EJB.theaterEJB;
import entity.ZIPCODES;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;


/**
 *
 * @author vedantprakash
 */
@Named(value = "mainPageBean")
//Session scoped
@SessionScoped
public class MainPageBean implements Serializable   {

       // EJB
    @EJB
    private theaterEJB theaterEJB;
    
    /**
     * Creates a new instance of MainPageBean
     */
    public MainPageBean() {
    }
    
    //displays list of zipcodes from ejb named query
    public List<ZIPCODES> getZipcode()
    {
        return theaterEJB.findZipcodes();
    }
    
}
