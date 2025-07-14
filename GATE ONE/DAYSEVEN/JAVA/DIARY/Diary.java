import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private final List<DiaryEntry> entries = new ArrayList<>();
    private int entryId = 1;

    public Diary(String username, String password) {
        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Username and password cannot be empty");
        }
        this.username = username;
        this.password = password;
        this.isLocked = true;
    }

    public void unlockDiary(String password) {
        if (!password.equals(this.password)) {
            throw new IllegalStateException("Diary unlock failed: try a correct password");
        }
        this.isLocked = false;
        System.out.println("Diary unlocked for user: " + this.username);
    }

    public void lockDiary() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        if (isLocked) {
            throw new IllegalStateException("Diary is locked");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        DiaryEntry entry = new DiaryEntry(entryId++, title, body);
        entries.add(entry);
        System.out.println("Entry created with ID: " + entry.getId());
    }

    public void deleteEntry(int entryId) {
        if (isLocked) {
            throw new IllegalStateException("Diary is locked");
        }
        DiaryEntry entry = findEntryById(entryId);
        entries.remove(entry);
        System.out.println("Entry with ID " + entryId + " deleted");
    }

    public DiaryEntry findEntryById(int id) {
        if (isLocked) {
            throw new IllegalStateException("Diary is locked");
        }
        return entries.stream()
                .filter(entry -> entry.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Entry not found"));
    }

    public void updateEntry(int entryId, String title, String body) {
        if (isLocked) {
            throw new IllegalStateException("Diary is locked");
        }
        DiaryEntry entry = findEntryById(entryId);
        entry.setTitle(title);
        entry.setBody(body);
        System.out.println("Entry updated: " + entry.getTitle());
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return username;
    }
}