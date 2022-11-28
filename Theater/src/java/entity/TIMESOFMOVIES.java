/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author vedantprakash
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "TIMESOFMOVIES.findAll", query = "SELECT b FROM TIMESOFMOVIES b"),
    @NamedQuery(name = "TIMESOFMOVIES.findById", query = "SELECT a FROM TIMESOFMOVIES a WHERE a.timesofmovies.id = :id"),
    @NamedQuery(name = "TIMESOFMOVIES.findByMovieId", query = "SELECT a FROM TIMESOFMOVIES a WHERE a.timesofmovies.id = :mid"),
   })
public class TIMESOFMOVIES implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TIMESOFMOVIESPK timesofmovies;

    public TIMESOFMOVIESPK getTimesofmovies() {
        return timesofmovies;
    }

    public void setTimesofmovies(TIMESOFMOVIESPK timesofmovies) {
        this.timesofmovies = timesofmovies;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timesofmovies != null ? timesofmovies.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TIMESOFMOVIES)) {
            return false;
        }
        TIMESOFMOVIES other = (TIMESOFMOVIES) object;
        if ((this.timesofmovies == null && other.timesofmovies != null) || (this.timesofmovies != null && !this.timesofmovies.equals(other.timesofmovies))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TIMESOFMOVIES[ id=" + timesofmovies + " ]";
    }
    
}
