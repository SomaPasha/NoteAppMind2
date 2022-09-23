package space.kuz.noteappmind.ui;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import space.kuz.noteappmind.R;
import space.kuz.noteappmind.domain.NoteEntity;

public class NoteEditActivity extends AppCompatActivity {
        private EditText titleEditText;
    private EditText descriptionEditText;
    private Button saveButton;
    static final String KEY_LIST_EDIT = ")))";

    static void start(Context context, NoteEntity item){
        Intent intent = new Intent(context, NoteEditActivity.class);
        intent.putExtra(NoteEditActivity.KEY_LIST_EDIT,item);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_edit);
        titleEditText= findViewById(R.id.title_edit_text);
        descriptionEditText = findViewById(R.id.description_edit_text);
        saveButton = findViewById(R.id.save_button);
        dataSaveEdit();
        saveButton.setOnClickListener(v -> {
            NoteEntity noteEntity = new NoteEntity(titleEditText.getText().toString(), descriptionEditText.getText().toString());

        });

    }

    private void dataSaveEdit(){
    Intent data = getIntent();
    NoteEntity note =data.getParcelableExtra(KEY_LIST_EDIT);
         titleEditText.setText(note.getTitle());
         descriptionEditText.setText(note.getDescription());
    }

}
