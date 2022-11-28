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
@NamedQueries({
    //named quesries to use in ejb
    @NamedQuery(name = "MOVIES.findAll", query = "SELECT b FROM MOVIES b"),
    @NamedQuery(name = "MOVIES.findByName", query = "SELECT a FROM MOVIES a WHERE a.mname = :mname"),
    @NamedQuery(name = "MOVIES.findById", query = "SELECT a FROM MOVIES a WHERE a.mid = :mid"),
    @NamedQuery(name = "MOVIES.findTimes", query = "SELECT b FROM MOVIES a, TIMES b, TIMESOFMOVIES c WHERE a.mid = c.timesofmovies.mid and c.timesofmovies.mid = :mid and b.id = c.timesofmovies.id")})
public class MOVIES implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //private attributes of class movies
    @Id
    @Basic(optional = false)
    @NotNull
    
   private String mid;
    @NotNull
    private String mname;
    @NotNull
    private String description;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MOVIES)) {
            return false;
        }
        MOVIES other = (MOVIES) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MOVIES[ movie id=" + mid + " ]";
    }
    
}
