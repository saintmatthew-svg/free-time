import java.time.LocalDateTime;

public class DiaryEntry {
    private int id;
    private String title;
    private String body;
    private final LocalDateTime dateCreated;

    public DiaryEntry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getBody() {
        return body;
    }
    public String getDateCreated() {
        return dateCreated.toString();
    }
}