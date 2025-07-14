import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void testFindDiaryByUsername() {
        Diaries diaries = new Diaries();
        String username = "fat boy";
        String password = "fat";
        diaries.add(username, password);
        Diary found = diaries.findByUsername(username);
        assertEquals(username, found.getUsername());
    }

    @Test
    public void testUnlockDiary() {
        String username = "test user";
        String password = "test123";
        Diary diary = new Diary(username, password);
        diary.unlockDiary(password);
        assertFalse(diary.isLocked());
    }

    @Test
    public void testCreateEntry() {
        Diary diary = new Diary("user", "pass");
        diary.unlockDiary("pass");
        diary.createEntry("Title", "Body");
        assertEquals("Title", diary.findEntryById(1).getTitle());
    }
}