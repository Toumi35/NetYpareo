
package javaapplicationypareo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ypareoEntities.Cours;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

public class JavaApplicationYPareo
{
    public static void main(String[] args) throws Exception
    {
        // Create a PersistenceManagerFactory 
        PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");

        System.out.println("===================================");
        System.out.println("~        JDO HERE WE GO!!1        ~");
        System.out.println("===================================");

        createCoursesAndProfs(pmf);

        findAllProfs(pmf);

        queryProfs(pmf);

        findAllProfs(pmf);

        deleteEverything(pmf);

        System.out.println("===================================");
        System.out.println("~           Bye bye!              ~");
        System.out.println("===================================");
    }

    private static void deleteEverything(PersistenceManagerFactory pmf)
    {
        PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx = pm.currentTransaction();
        try
        {
            tx.begin();
            System.out.println("Deleting all courses from persistence");
            Query q = pm.newQuery(Cours.class);
            long numberInstancesDeleted = q.deletePersistentAll();
            System.out.println("Deleted " + numberInstancesDeleted + " courses");

            numberInstancesDeleted = 0;
            System.out.println("Deleting all profs from persistence");
            q = pm.newQuery(Prof.class);
            numberInstancesDeleted = q.deletePersistentAll();
            System.out.println("Deleted " + numberInstancesDeleted + " profs");

            tx.commit();
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }

        System.out.println("");
    }

    @SuppressWarnings("unchecked")
    private static void queryProfs(PersistenceManagerFactory pmf)
    {
        PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx = pm.currentTransaction();

        try
        {
            tx.begin();
            System.out.println("Executing Query for Profs with age < 30");
            Extent<Prof> e = pm.getExtent(Prof.class, true);
            Query q = pm.newQuery(e, "age < 30");
            q.setOrdering("age ascending");
            Collection<Prof> c = (Collection<Prof>) q.execute();

            for(Prof p : c)
            {
                System.out.println("* " + p);
                //e.g. of update
                p.setName("young " + p.getName());
            }
            tx.commit();
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
        System.out.println("");
    }

    private static void createCoursesAndProfs(PersistenceManagerFactory pmf)
    {
        PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx = pm.currentTransaction();
        try
        {
            tx.begin();
            System.out.println("Creating some courses and profs");

            Cours c1 = new Cours("Persistance", "Persistance Cours avec Richard");
            Cours c2 = new Cours("XML", "XML cours and stuff");
            Cours c3 = new Cours("Maths", "2+2=?");

            Prof p1 = new Prof();
            p1.setName("Richard");
            p1.setAge(22);

            Prof p2 = new Prof();
            p2.setName("Philippe");
            p2.setAge(44);

            System.out.println("Add courses to prof!");
            Set<Cours> courses = p1.getCourses();
            courses.add(c1);
            courses.add(c2);

            p2.getCourses().add(c3);

            pm.makePersistent(p1);
            pm.makePersistent(p2);

            tx.commit();
            System.out.println("Profs and courses have been persisted");
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
        System.out.println("");
    }

    private static void findAllProfs(PersistenceManagerFactory pmf)
    {
        PersistenceManager pm;
        Transaction tx;
        // Extent of all Profs
        pm = pmf.getPersistenceManager();
        tx = pm.currentTransaction();
        try
        {
            tx.begin();
            System.out.println("Retrieving Extent for Profs");
            Extent<Prof> e = pm.getExtent(Prof.class, true);

            for(Prof p : e)
            {
                System.out.println("* " + p);
            }

            tx.commit();
        }
        catch (Exception e)
        {
            System.out.println("Exception thrown during retrieval of Extent : " + e.getMessage());
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
        System.out.println("");
    }
        
        
        
        
        
        
        
        
        
        
        
//        //JPAUtil jpa = new JPAUtil();
//        //DriveManager dm = new DriveManager();
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplicationYPareoPU");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        
//        // ------ Professeur ------
//        Professeur prof1 = new Professeur();
//        Professeur prof2 = new Professeur();
//        
//        prof1.setNom("Richard King");
//        prof2.setNom("Alain Milone");
//        
//        em.persist(prof1);
//        em.persist(prof2);
//        
//        // ------ Etudiant ------
//        Etudiant etu1 = new Etudiant();
//        Etudiant etu2 = new Etudiant();
//        
//        etu1.setNom("JOURDAN");
//        etu1.setPrenom("Carole");
//        etu2.setNom("de BAGLION");
//        etu2.setPrenom("Alleaume");
//        
//        em.persist(etu1);
//        em.persist(etu2);
//        
//        // ------ Note ------
//        Note note1 = new Note();
//        Note note2 = new Note();
//        
//        note1.setNote(12);
//        note2.setNote(15);
//        
//        em.persist(note1);
//        em.persist(note2);
//        
//        em.getTransaction().commit();
//        
//        // ------ Salle ------
//        Salle sal1 = new Salle();
//        Salle sal2 = new Salle();
//        
//        sal1.setNom("Sakura");
//        sal2.setNom("Progress");
//        
//        em.persist(sal1);
//        em.persist(sal2);
//        
//        em.getTransaction().commit();
//        
//        // ------ Utilisateur ------
//        Utilisateur user1 = new Utilisateur();
//        Utilisateur user2 = new Utilisateur();
//        
//        user1.setIdentifiant("CJOURD");
//        user1.setMdp("000000");
//        user2.setIdentifiant("ADEBAG");
//        user2.setMdp("000000");
//        
//        em.persist(user1);
//        em.persist(user2);
//        
//        em.getTransaction().commit();
//        
//        // ------ Cours ------
//        Cours cours1 = new Cours();
//        Cours cours2 = new Cours();
//        
//        cours1.setIntitule("Java");
//        cours1.setDateCours(null);
//        cours1.setHeureCours("9h-17h");
//        cours2.setIntitule("Persistance");
//        cours2.setDateCours(null);
//        cours2.setHeureCours("9h-17h");
//        
//        em.persist(user1);
//        em.persist(user2);
//        
//        em.getTransaction().commit();
//        
//        // -------------------
//        
//        em.close();
//        emf.close();
//    }
}