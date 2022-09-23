package space.kuz.noteappmind.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import space.kuz.noteappmind.R;

public class NoteListActivity extends AppCompatActivity {
    private Toolbar toolbar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        initToolBar();
    }

    public void initToolBar(){
        toolbar = findViewById(R.id.note_list_toolbar);
        setSupportActionBar(toolbar);

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
                Toast.makeText(this,"ssss",Toast.LENGTH_LONG).show();
                return true;
            }
            default:{
                return super.onOptionsItemSelected(item);
            }
        }

    }
}
