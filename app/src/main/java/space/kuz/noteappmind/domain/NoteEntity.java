package space.kuz.noteappmind.domain;

import android.os.Parcel;
import android.os.Parcelable;

public class NoteEntity implements Parcelable {
    private int id;
    private String title;
    private String description;


    public NoteEntity(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public NoteEntity( String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    protected NoteEntity(Parcel in) {
        id = in.readInt();
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<NoteEntity> CREATOR = new Creator<NoteEntity>() {
        @Override
        public NoteEntity createFromParcel(Parcel in) {
            return new NoteEntity(in);
        }

        @Override
        public NoteEntity[] newArray(int size) {
            return new NoteEntity[size];
        }
    };

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(description);
    }
}
