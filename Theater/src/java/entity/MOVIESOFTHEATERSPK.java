/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;


import javax.validation.constraints.NotNull;

/**
 *
 * @author vedantprakash
 */
@Embeddable
public class MOVIESOFTHEATERSPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    //private attributes of class moviesoftheatersPK
   private String mid;
    @Basic(optional = false)
    @NotNull
    private String id;

        public MOVIESOFTHEATERSPK() {
    }

    public MOVIESOFTHEATERSPK(String mid, String id) {
        this.mid = mid;
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MOVIESOFTHEATERSPK)) {
            return false;
        }
        MOVIESOFTHEATERSPK other = (MOVIESOFTHEATERSPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MOVIESOFTHEATERSPK[ id=" + id + " ]";
    }
    
}
