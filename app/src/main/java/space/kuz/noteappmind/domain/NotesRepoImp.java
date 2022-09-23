package space.kuz.noteappmind.domain;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class NotesRepoImp implements NotesRepo{
    public ArrayList<NoteEntity> repo = new ArrayList<>();
   private int counter = 0;
    @Override
    public List<NoteEntity> getNotes() {
        return new ArrayList<NoteEntity>(repo);
    }
    @Nullable
    @Override
    public Integer addNote(NoteEntity note) {
        int newId = ++counter;
        note.setId(newId);
        repo.add(note);
        return newId;

    }

    @Override
    public boolean removeNote(int id) {
        for (int i = 0; i < repo.size(); i++) {
            if(id == repo.get(i).getId()) {
                repo.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editNote(int id, NoteEntity note) {
        removeNote(id);
        note.setId(id);
        repo.add(id-1,note);
        return true;
    }


}
