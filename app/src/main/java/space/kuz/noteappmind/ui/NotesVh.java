package space.kuz.noteappmind.ui;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import space.kuz.noteappmind.R;

public class NotesVh extends RecyclerView.ViewHolder {
    public NotesVh(@NonNull View itemView) {
        super(itemView);
    }

    public TextView titleTextView = itemView.findViewById(R.id.title_text_view);
    public TextView descriptionTextView = itemView.findViewById(R.id.description_text_view);
}
