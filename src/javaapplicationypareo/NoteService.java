package javaapplicationypareo;

import java.util.Collection;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import ypareoEntities.Note;

/**
 *
 * @author Carole
 */
public class NoteService
{
    protected EntityManager em;

    public NoteService(EntityManager em)
    {
        this.em = em;
    }

    public Note createNote(long idNote, int note, Date date)
    {
        Note n = new Note(idNote);
        n.setDate(date);
        n.setNote(note);
        em.persist(n);
        return n;
    }

    public void removeNote(int idNote)
    {
        Note n = findNote(idNote);
        if (n != null)
        {
            em.remove(n);
        }
    }

    public Note findNote(int idNote)
    {
        return em.find(Note.class, idNote);
    }

    public Collection<Note> findAllNotes()
    {
        Query query = em.createQuery("SELECT n FROM Note n");
        return (Collection<Note>) query.getResultList();
    }
}
