/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author vedantprakash
 */
@Entity
@NamedQueries({
    //named quesries to use in ejb
    @NamedQuery(name = "THEATERS.findAll", query = "SELECT b FROM THEATERS b"),
   @NamedQuery(name = "THEATERS.findByZip", query = "SELECT a FROM THEATERS a WHERE a.zip = :zip"),
    @NamedQuery(name = "THEATERS.findByName", query = "SELECT a FROM THEATERS a WHERE a.tname = :tname"),
    @NamedQuery(name = "THEATERS.findMovies", query = "SELECT b FROM THEATERS a, MOVIES b, MOVIESOFTHEATERS c WHERE a.id = :id and b.mid = c.moviesoftheaters.mid and a.id = c.moviesoftheaters.id"),
 @NamedQuery(name = "THEATERS.findById", query = "SELECT a FROM THEATERS a WHERE a.id = :id")})
   
public class THEATERS implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
   //private attributes of class theaters
    @NotNull
    private String tname;
    @NotNull
    @Id
    private String id;
    @Basic(optional = false)
    @NotNull
    private String zip;
   // @JoinColumn(name = "zipcode", referencedColumnName="zipcode")
   // @ManyToOne
    //private ZIPCODES zipcode;

    public String getZip() {
        return zip;
    }

    public void setZip(String zips) {
        this.zip = zips;
    }
    
        
  //  public ZIPCODES getZipcode() {
  //      return zipcode;
  //  }

  //  public void setZipcode(ZIPCODES zip) {
   //     this.zipcode = zip;
   // }
    

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    

     @Override
    public int hashCode() {
        int hash = 0;
        hash += (zip != null ? zip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof THEATERS)) {
            return false;
        }
        THEATERS other = (THEATERS) object;
        if ((this.zip == null && other.zip != null) || (this.zip != null && !this.zip.equals(other.zip))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "entity.THEATERS[ zip=" + zip + " ]";
    }
    
}
