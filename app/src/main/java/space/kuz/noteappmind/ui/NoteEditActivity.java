package space.kuz.noteappmind.ui;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import space.kuz.noteappmind.R;
import space.kuz.noteappmind.domain.NoteEntity;

public class NoteEditActivity extends AppCompatActivity {
        private EditText titleEditText;
    private EditText descriptionEditText;
    private Button saveButton;
    static final String KEY_LIST_EDIT = ")))";
    private  NoteEntity noteMain;

    static Intent start(Context context, NoteEntity item){
        Intent intent = new Intent(context, NoteEditActivity.class);
        intent.putExtra(NoteEditActivity.KEY_LIST_EDIT,item);
        return intent;
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
            NoteEntity noteEntity = new NoteEntity(noteMain.getId(), titleEditText.getText().toString(), descriptionEditText.getText().toString());
            Intent intent = new Intent();
            intent.putExtra(KEY_LIST_EDIT,noteEntity);
            setResult(RESULT_OK,intent);
            finish();
        });


    }

    private void dataSaveEdit(){
    Intent data = getIntent();
    noteMain =data.getParcelableExtra(KEY_LIST_EDIT);
         titleEditText.setText(noteMain.getTitle());
         descriptionEditText.setText(noteMain.getDescription());

    }

}
