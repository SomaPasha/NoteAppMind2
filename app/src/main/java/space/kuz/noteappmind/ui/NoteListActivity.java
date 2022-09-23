package space.kuz.noteappmind.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import space.kuz.noteappmind.R;
import space.kuz.noteappmind.domain.NoteEntity;
import space.kuz.noteappmind.domain.NotesRepo;
import space.kuz.noteappmind.domain.NotesRepoImp;

public class NoteListActivity extends AppCompatActivity {
    private Toolbar toolbar ;
    private RecyclerView recyclerView;
    private NotesRepo notesRepo = new NotesRepoImp();
    private NotesAdapter adapter = new NotesAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        initToolBar();
    }

    public void initToolBar(){

        toolbar = findViewById(R.id.note_list_toolbar);
        setSupportActionBar(toolbar);
        fillRepoByTestValue();
        initRecyclerView();


        }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.note_list_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.new_note_menu:{
              openNoteScreen();
                return true;
            }
            default:{
                return super.onOptionsItemSelected(item);
            }
        }

    }

    public void openNoteScreen(){
        Intent intent = new Intent(this, NoteEditActivity.class);
        startActivity(intent);
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.note_list_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private void fillRepoByTestValue() {
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
        notesRepo.addNote(new NoteEntity("dsdfdsfv","sdfsdfsdfwdfsddfsdfsd"));
    }
}
