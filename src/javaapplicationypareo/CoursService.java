package javaapplicationypareo;

import java.sql.Date;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import ypareoEntities.Cours;

/**
 *
 * @author Carole
 */
public class CoursService
{
    protected EntityManager em;

    public CoursService(EntityManager em)
    {
        this.em = em;
    }

    public Cours createCours(long idCours, String intitule, Date date_cours, String horaire)
    {
        Cours c = new Cours(idCours);
        c.setIntitule(intitule);
        c.setDateCours(date_cours);
        c.setHeureCours(horaire);
        em.persist(c);
        return c;
    }

    public void removeCours(int idCours)
    {
        Cours c = findCours(idCours);
        if (c != null)
        {
            em.remove(c);
        }
    }

    public Cours findCours(int idCours)
    {
        return em.find(Cours.class, idCours);
    }

    public Collection<Cours> findAllCourss()
    {
        Query query = em.createQuery("SELECT c FROM Cours c");
        return (Collection<Cours>) query.getResultList();
    }
}
