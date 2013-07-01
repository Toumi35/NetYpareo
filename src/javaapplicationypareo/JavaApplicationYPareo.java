
package javaapplicationypareo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ypareoEntities.Cours;
import ypareoEntities.Etudiant;
import ypareoEntities.Note;
import ypareoEntities.Professeur;
import ypareoEntities.Salle;
import ypareoEntities.Utilisateur;

public class JavaApplicationYPareo
{
    public static void main(String[] args) throws Exception
    {                
        JPAUtil jpa = new JPAUtil();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProfesseurService");
        EntityManager em = emf.createEntityManager();
        ProfesseurService service = new ProfesseurService(em);

        em.getTransaction().begin();
        Professeur p = service.createProfesseur(158, "test");
//        Utilisateur u = service.createUtilisateur(158, "test");
//        Cours c = service.createCours(158, "test");
//        Note n = service.createNote(158, "test");        
//        Salle s = service.createSalle(158, "test");
//        Etudiant e = service.createEtudiant(158, "test");
        em.getTransaction().commit();
        System.out.println("Persisted " + p);

        
        jpa.checkData("SELECT p FROM Professeur p");
//        jpa.checkData("SELECT u FROM Utilisateur u");
//        jpa.checkData("SELECT c FROM Cours c");
//        jpa.checkData("SELECT n FROM Note n");
//        jpa.checkData("SELECT s FROM Salle s");
//        jpa.checkData("SELECT e FROM Etudiant e");

        em.close();
        emf.close();
    }
}