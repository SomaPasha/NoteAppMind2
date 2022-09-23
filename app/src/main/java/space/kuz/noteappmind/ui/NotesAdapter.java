package space.kuz.noteappmind.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import space.kuz.noteappmind.R;
import space.kuz.noteappmind.domain.NoteEntity;
import space.kuz.noteappmind.domain.NotesRepo;

public class NotesAdapter  extends RecyclerView.Adapter<NotesVh>  {

    private List<NoteEntity>  data = new ArrayList<>();
    private OnItemClickListener listener = null;
    public void setData(List<NoteEntity> data) {
    this.data = data;
      notifyDataSetChanged();  }

    @NonNull
    @Override
    public NotesVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotesVh(parent,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesVh holder, int position) {
        NoteEntity note = getItem(position);
        holder.bind(note);


    }

    private  NoteEntity getItem(int position){
        return data.get(position);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener =listener ;    }

    interface OnItemClickListener{
        void onItemClick(NoteEntity item);
    }
}
