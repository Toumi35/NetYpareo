package javaapplicationypareo;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import ypareoEntities.Etudiant;

/**
 *
 * @author Carole
 */
public class EtudiantService
{
    protected EntityManager em;

    public EtudiantService(EntityManager em)
    {
        this.em = em;
    }

    public Etudiant createEtudiant(long idEtudiant, String nom, String prenom)
    {
        Etudiant e = new Etudiant(idEtudiant);
        e.setNom(nom);
        e.setNom(prenom);
        em.persist(e);
        return e;
    }

    public void removeEtudiant(int idEtudiant)
    {
        Etudiant e = findEtudiant(idEtudiant);
        if (e != null)
        {
            em.remove(e);
        }
    }

    public Etudiant findEtudiant(int idEtudiant)
    {
        return em.find(Etudiant.class, idEtudiant);
    }

    public Collection<Etudiant> findAllEtudiants()
    {
        Query query = em.createQuery("SELECT e FROM Etudiant e");
        return (Collection<Etudiant>) query.getResultList();
    }
}