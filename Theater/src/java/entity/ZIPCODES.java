/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

/**
 *
 * @author vedantprakash
 */
@Entity
//named quesries to use in ejb
 @NamedQueries({
    @NamedQuery(name = "ZIPCODES.findAll", query = "SELECT a FROM ZIPCODES a"),
    @NamedQuery(name = "ZIPCODES.findByZip", query = "SELECT a FROM ZIPCODES a WHERE a.zip = :zip"),
    @NamedQuery(name = "ZIPCODES.findByCity", query = "SELECT a FROM ZIPCODES a WHERE a.city = :city"),
    @NamedQuery(name = "ZIPCODES.findByTheaters", query = "SELECT b.tname, b.id, b.zip FROM ZIPCODES a, THEATERS b WHERE a.zip=:zip and a.zip = b.zip")
 })
    
public class ZIPCODES implements Serializable {
   
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    //private attributes of class zipcodes
   private String zip;
    @NotNull
    private String city;
    @NotNull
    private String tstate;
    
    
    //@OneToMany(mappedBy = "zipcode")
    //private List<THEATERS> theaterList;
    

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTstate() {
        return tstate;
    }

    public void setTstate(String tstate) {
        this.tstate = tstate;
    }

    //public List<THEATERS> getTheaterList() {
     //   return theaterList;
   // }

    //public void setTheaterList(List<THEATERS> theaterList) {
      //  this.theaterList = theaterList;
    //}

    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zip != null ? zip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZIPCODES)) {
            return false;
        }
        ZIPCODES other = (ZIPCODES) object;
        if ((this.zip == null && other.zip != null) || (this.zip != null && !this.zip.equals(other.zip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZIPCODES[ zip=" + zip + " ]";
    }
    
}
