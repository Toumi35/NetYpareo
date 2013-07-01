package javaapplicationypareo;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import ypareoEntities.Professeur;

/**
 *
 * @author Carole
 */
public class ProfesseurService
{
    protected EntityManager em;

    public ProfesseurService(EntityManager em)
    {
        this.em = em;
    }

    public Professeur createProfesseur(long idProfesseur, String nom)
    {
        Professeur p = new Professeur(idProfesseur);
        p.setNom(nom);
        em.persist(p);
        return p;
    }

    public void removeProfesseur(int idProfesseur)
    {
        Professeur p = findProfesseur(idProfesseur);
        if (p != null)
        {
            em.remove(p);
        }
    }

    public Professeur findProfesseur(int idProfesseur)
    {
        return em.find(Professeur.class, idProfesseur);
    }

    public Collection<Professeur> findAllProfesseurs()
    {
        Query query = em.createQuery("SELECT p FROM Professeur p");
        return (Collection<Professeur>) query.getResultList();
    }
}