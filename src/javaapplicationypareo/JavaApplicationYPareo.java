
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
        //JPAUtil jpa = new JPAUtil();
        //DriveManager dm = new DriveManager();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplicationYPareoPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        // ------ Professeur ------
        Professeur prof1 = new Professeur();
        Professeur prof2 = new Professeur();
        
        prof1.setNom("Richard King");
        prof2.setNom("Alain Milone");
        
        em.persist(prof1);
        em.persist(prof2);
        
        // ------ Etudiant ------
        Etudiant etu1 = new Etudiant();
        Etudiant etu2 = new Etudiant();
        
        etu1.setNom("JOURDAN");
        etu1.setPrenom("Carole");
        etu2.setNom("de BAGLION");
        etu2.setPrenom("Alleaume");
        
        em.persist(etu1);
        em.persist(etu2);
        
        // ------ Note ------
        Note note1 = new Note();
        Note note2 = new Note();
        
        note1.setNote(12);
        note2.setNote(15);
        
        em.persist(note1);
        em.persist(note2);
        
        em.getTransaction().commit();
        
        // ------ Salle ------
        Salle sal1 = new Salle();
        Salle sal2 = new Salle();
        
        sal1.setNom("Sakura");
        sal2.setNom("Progress");
        
        em.persist(sal1);
        em.persist(sal2);
        
        em.getTransaction().commit();
        
        // ------ Utilisateur ------
        Utilisateur user1 = new Utilisateur();
        Utilisateur user2 = new Utilisateur();
        
        user1.setIdentifiant("CJOURD");
        user1.setMdp("000000");
        user2.setIdentifiant("ADEBAG");
        user2.setMdp("000000");
        
        em.persist(user1);
        em.persist(user2);
        
        em.getTransaction().commit();
        
        // ------ Cours ------
        Cours cours1 = new Cours();
        Cours cours2 = new Cours();
        
        cours1.setIntitule("Java");
        cours1.setDateCours(null);
        cours1.setHeureCours("9h-17h");
        cours2.setIntitule("Persistance");
        cours2.setDateCours(null);
        cours2.setHeureCours("9h-17h");
        
        em.persist(user1);
        em.persist(user2);
        
        em.getTransaction().commit();
        
        // -------------------
        
        em.close();
        emf.close();
    }
}