import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();

    public void add(String username, String password) {
        diaries.add(new Diary(username, password));
    }
    public Diary findByUsername(String username) {
        return diaries.stream().filter(diary -> diary.getUsername().equals(username)).findFirst().orElse(null);
    }
    public void delete(String username, String password) {
        Diary diary;
        diary = findByUsername(username);
        diary.unlockDiary(password);
        diaries.remove(diary);
    }
}