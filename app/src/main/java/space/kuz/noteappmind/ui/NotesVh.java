package space.kuz.noteappmind.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import space.kuz.noteappmind.R;
import space.kuz.noteappmind.domain.NoteEntity;

public class NotesVh extends RecyclerView.ViewHolder {
    private TextView titleTextView = itemView.findViewById(R.id.title_text_view);
    private TextView descriptionTextView = itemView.findViewById(R.id.description_text_view);
    private  NoteEntity note;
    public  NotesVh(@NonNull ViewGroup parent, NotesAdapter.OnItemClickListener clickListener){
        super(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note,parent,false));
        itemView.setOnClickListener(v -> clickListener.onItemClick(note));
    }


    public void bind(NoteEntity note) {
       this.note=note;
        titleTextView.setText(note.getTitle());
        descriptionTextView.setText(note.getDescription());
    }
}
