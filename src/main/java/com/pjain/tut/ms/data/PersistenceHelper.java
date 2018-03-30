package com.pjain.tut.ms.data;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author pjain
 */
@ApplicationScoped
public class PersistenceHelper {

    @PersistenceContext(unitName="MyDS")
    private EntityManager em;

    public EntityManager getEntityManager() {
        return em;
    }
}