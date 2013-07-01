
package javaapplicationypareo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ypareoEntities.Professeur;

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
        em.getTransaction().commit();
        System.out.println("Persisted " + p);

        
        jpa.checkData("SELECT p FROM Professeur p");

        em.close();
        emf.close();
    }
}