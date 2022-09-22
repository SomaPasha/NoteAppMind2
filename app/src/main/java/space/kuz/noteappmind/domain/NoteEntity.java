package space.kuz.noteappmind.domain;

public class NoteEntity {
    private int id;
    private String title;
    private String description;

    public NoteEntity(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

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
}
