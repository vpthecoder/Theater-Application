/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entity.MOVIES;
import entity.THEATERS;
import entity.TIMES;
import entity.ZIPCODES;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vedantprakash
 */
@Stateless
public class theaterEJB {
    @PersistenceContext(unitName = "TheaterPU")
    private EntityManager em;
    
    //persists to database
    public void persist(Object object) {
        em.persist(object);
    }
    
    //returns list of all zipcodes
    public List<ZIPCODES> findZipcodes()
    {
        return em.createNamedQuery("ZIPCODES.findAll", ZIPCODES.class).getResultList();
    }

    
    
    //returns list of all theaters
    public List<THEATERS> getTheaterDetails(String zip)
    {
        
        return em.createNamedQuery("THEATERS.findByZip", THEATERS.class).setParameter("zip", zip)
                .getResultList();
    }
    
    //returns list of all movies
    public List<MOVIES> getMovies(String id)
    {
        return em.createNamedQuery("THEATERS.findMovies", MOVIES.class)
                .setParameter("id", id)
                .getResultList();
    }
    
    
    
    
    //returns list of all times
    public List<TIMES> getTimesForMovies(String mid)
    {
        return em.createNamedQuery("MOVIES.findTimes", TIMES.class)
                .setParameter("mid", mid)
                .getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
