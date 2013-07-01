package javaapplicationypareo;

import java.util.Collection;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import ypareoEntities.Salle;

/**
 *
 * @author Carole
 */
public class SalleService
{
    protected EntityManager em;

    public SalleService(EntityManager em)
    {
        this.em = em;
    }

    public Salle createSalle(long idSalle, String nom)
    {
        Salle s = new Salle(idSalle);
        s.setNom(nom);
        em.persist(s);
        return s;
    }

    public void removeSalle(int idSalle)
    {
        Salle s = findSalle(idSalle);
        if (s != null)
        {
            em.remove(s);
        }
    }

    public Salle findSalle(int idSalle)
    {
        return em.find(Salle.class, idSalle);
    }

    public Collection<Salle> findAllSalles()
    {
        Query query = em.createQuery("SELECT s FROM Salle s");
        return (Collection<Salle>) query.getResultList();
    }
}