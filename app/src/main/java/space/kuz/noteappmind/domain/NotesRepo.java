package space.kuz.noteappmind.domain;

import androidx.annotation.Nullable;

import java.util.List;

public interface NotesRepo {
    List<NoteEntity> getNotes();
    @Nullable
    Integer addNote(NoteEntity note);
    boolean removeNote(int id);
    boolean editNote(int id, NoteEntity note);
}
