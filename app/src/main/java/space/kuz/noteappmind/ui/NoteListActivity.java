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
import space.kuz.noteappmind.ui.NoteEditActivity;

public class NoteListActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        toolbar = findViewById(R.id.note_list_toolbar);
        setSupportActionBar(toolbar);
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