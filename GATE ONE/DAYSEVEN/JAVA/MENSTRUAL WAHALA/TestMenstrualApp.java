import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class TestMenstrualApp {
    
    @Test
    public void testGetNextPeriod() {
        MenstrualApp app = new MenstrualApp("2023-01-01", 28, 5);
        LocalDate expected = LocalDate.parse("2023-01-29");
        assertEquals(expected, app.getNextPeriod());
    }

    @Test
    public void testGetOvulation() {
        MenstrualApp app = new MenstrualApp("2023-01-01", 28, 5);
        LocalDate expected = LocalDate.parse("2023-01-15");
        assertEquals(expected, app.getOvulation());
    }

    @Test
    public void testGetFertileStart() {
        MenstrualApp app = new MenstrualApp("2023-01-01", 28, 5);
        LocalDate expected = LocalDate.parse("2023-01-13");
        assertEquals(expected, app.getFertileStart());
    }

    @Test
    public void testGetFertileEnd() {
        MenstrualApp app = new MenstrualApp("2023-01-01", 28, 5);
        LocalDate expected = LocalDate.parse("2023-01-17");
        assertEquals(expected, app.getFertileEnd());
    }

    @Test
    public void testGetSafeEndBeforeFertile() {
        MenstrualApp app = new MenstrualApp("2023-01-01", 28, 5);
        LocalDate expected = LocalDate.parse("2023-01-12");
        assertEquals(expected, app.getSafeEndBeforeFertile());
    }

    @Test
    public void testDifferentCycleLength() {
        MenstrualApp app = new MenstrualApp("2023-01-01", 30, 5);
        LocalDate expectedNextPeriod = LocalDate.parse("2023-01-31");
        LocalDate expectedOvulation = LocalDate.parse("2023-01-16");
        assertEquals(expectedNextPeriod, app.getNextPeriod());
        assertEquals(expectedOvulation, app.getOvulation());
    }
}