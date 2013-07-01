package javaapplicationypareo;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import ypareoEntities.Utilisateur;

/**
 *
 * @author Carole
 */
public class UtilisateurService
{
    protected EntityManager em;

    public UtilisateurService(EntityManager em)
    {
        this.em = em;
    }

    public Utilisateur createUtilisateur(long idUtilisateur, String identifiant, String mdp)
    {
        Utilisateur u = new Utilisateur(idUtilisateur);
        u.setIdentifiant(identifiant);
        u.setMdp(mdp);        
        em.persist(u);
        return u;
    }

    public void removeUtilisateur(int idUtilisateur)
    {
        Utilisateur u = findUtilisateur(idUtilisateur);
        if (u != null)
        {
            em.remove(u);
        }
    }

    public Utilisateur findUtilisateur(int idUtilisateur)
    {
        return em.find(Utilisateur.class, idUtilisateur);
    }

    public Collection<Utilisateur> findAllUtilisateurs()
    {
        Query query = em.createQuery("SELECT u FROM Utilisateur u");
        return (Collection<Utilisateur>) query.getResultList();
    }
}