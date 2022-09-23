package space.kuz.noteappmind.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import space.kuz.noteappmind.R;

public class NotesAdapter  extends RecyclerView.Adapter<NotesVh>  {
    @NonNull
    @Override
    public NotesVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note,parent,false);
        return new NotesVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesVh holder, int position) {
        holder.titleTextView.setText("");
        holder.descriptionTextView.setText("1");

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
