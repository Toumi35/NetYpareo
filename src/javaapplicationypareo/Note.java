
package javaapplicationypareo;

import java.sql.Date;
import sun.util.calendar.BaseCalendar;


public class Note
{
    private int idNote;
    private Date dateNote;
    private float note;

    public int getIdNote()
    {
        return idNote;
    }

    public void setIdNote(int idNote)
    {
        this.idNote = idNote;
    }

    public Date getDateNote()
    {
        return dateNote;
    }

    public void setDateNote(Date dateNote)
    {
        this.dateNote = dateNote;
    }

    public float getNote()
    {
        return note;
    }

    public void setNote(float note)
    {
        this.note = note;
    }
}