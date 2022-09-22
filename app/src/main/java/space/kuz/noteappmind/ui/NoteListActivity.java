package space.kuz.noteappmind.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import space.kuz.noteappmind.R;
import space.kuz.noteappmind.domain.NoteEntity;
import space.kuz.noteappmind.domain.NotesRepo;
import space.kuz.noteappmind.domain.NotesRepoImp;
import space.kuz.noteappmind.ui.NoteEditActivity;

public class NoteListActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private NotesRepo notesRepo = new NotesRepoImp();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        fullRepo();
        toolbar = findViewById(R.id.note_list_toolbar);
        setSupportActionBar(toolbar);
    }

    private void fullRepo() {
        notesRepo.addNote(new NoteEntity("Заметка 1","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 2","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 3","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 4","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 5","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 6","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 7","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 8","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 9","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 10","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 11","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 12","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 13","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 14","Опиисание111"));
        notesRepo.addNote(new NoteEntity("Заметка 15","Опиисание111"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater  inflater = getMenuInflater();
        inflater.inflate(R.menu.note_list_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      switch ( item.getItemId()){
          case  R.id.new_note_menu:{
             OpenNoteScreen();
          }
          default:{
              return super.onOptionsItemSelected(item);
          }
      }

    }

    public void OpenNoteScreen(){
        Intent intent = new Intent(this, NoteEditActivity.class);
        startActivity(intent);
    }
}