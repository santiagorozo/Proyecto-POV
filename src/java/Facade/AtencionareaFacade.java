/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Atencionarea;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jusag
 */
@Stateless
public class AtencionareaFacade extends AbstractFacade<Atencionarea> {

    @PersistenceContext(unitName = "PovPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AtencionareaFacade() {
        super(Atencionarea.class);
    }
     public List<Atencionarea> consultarAtencionArea(int estado){
        Query q = em.createQuery("SELECT a FROM Atencionarea a WHERE a.estado=:estado");
                q.setParameter("estado", estado);
                return q.getResultList();
    }
}
