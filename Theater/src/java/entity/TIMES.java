/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
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
    @NamedQuery(name = "TIMES.findAll", query = "SELECT b FROM TIMES b"),
    @NamedQuery(name = "TIMES.findByTime", query = "SELECT a FROM TIMES a WHERE a.mtime = :mtime"),
    @NamedQuery(name = "TIMES.findById", query = "SELECT a FROM TIMES a WHERE a.id = :id"),
   })
public class TIMES implements Serializable {

    private static final long serialVersionUID = 1L;
    //private attributes of class times
    @Id
    @NotNull
    private String id;
    
    @NotNull
    private String mtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
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
        if (!(object instanceof TIMES)) {
            return false;
        }
        TIMES other = (TIMES) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TIMES[ id=" + id + " ]";
    }
    
}
