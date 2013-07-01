
package javaapplicationypareo;


public class NoteDAO extends DAO<Note>
{
    public Note find(long idNote)
    {
        //...
        return new Note();
    }
    
    public Note create(Note note)
    {
        //...
        return note;
    }
    
    public Note update(Note note)
    {
            //...
    return note;
    }
    
    public void delete(Note note)
    {
        //...
    }
}