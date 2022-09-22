package space.kuz.noteappmind.domain;

import java.util.List;

public interface NotesRepo {
    List<NoteEntity> getNotes();
    boolean addNote(NoteEntity note);
    boolean removeNote(int id);
    boolean editNote(int id, NoteEntity note);
}
