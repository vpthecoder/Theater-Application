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
    @NamedQuery(name = "MOVIESOFTHEATERS.findAll", query = "SELECT b FROM MOVIESOFTHEATERS b"),
    @NamedQuery(name = "MOVIESOFTHEATERS.findById", query = "SELECT a FROM MOVIESOFTHEATERS a WHERE a.moviesoftheaters.id = :id"),
    @NamedQuery(name = "MOVIESOFTHEATERS.findByMovieId", query = "SELECT a FROM MOVIESOFTHEATERS a WHERE a.moviesoftheaters.mid = :mid"),
   })
public class MOVIESOFTHEATERS implements Serializable {

    private static final long serialVersionUID = 1L;
    //private attributes of class moviesoftheaters
    @EmbeddedId
    protected MOVIESOFTHEATERSPK moviesoftheaters;

    public MOVIESOFTHEATERSPK getMoviesoftheaters() {
        return moviesoftheaters;
    }

    public void setMoviesoftheaters(MOVIESOFTHEATERSPK moviesoftheaters) {
        this.moviesoftheaters = moviesoftheaters;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moviesoftheaters != null ? moviesoftheaters.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MOVIESOFTHEATERS)) {
            return false;
        }
        MOVIESOFTHEATERS other = (MOVIESOFTHEATERS) object;
        if ((this.moviesoftheaters == null && other.moviesoftheaters != null) || (this.moviesoftheaters != null && !this.moviesoftheaters.equals(other.moviesoftheaters))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MOVIESOFTHEATERS[ id=" + moviesoftheaters + " ]";
    }
    
}
