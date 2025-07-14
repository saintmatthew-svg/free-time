import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    public AirConditioner ac = new AirConditioner();

    @Test
    public void testAcTurnOn() {
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    public void testAcTurnOff() {
        ac.turnOn();
        assertTrue(ac.isOn());
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    public void testIncreaseTemperature() {
        ac.turnOn();
        int temperature = 23;
        ac.setTemperature(temperature);
        ac.increaseTemperature();
        assertEquals(24, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(25, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(26, ac.getTemperature());
    }

    @Test
    public void testDecreaseTemperature() {
        ac.turnOn();
        int temperature = 18;
        ac.setTemperature(temperature);
        ac.decreaseTemperature();
        assertEquals(17 , ac.getTemperature());
        ac.decreaseTemperature();
        assertEquals(16 , ac.getTemperature());
        ac.decreaseTemperature();
        assertEquals(16 , ac.getTemperature());
    }

    @Test
    public void testTemperatureDoesNotExceed30() {
        ac.turnOn();
        int temperature = 28;
        ac.setTemperature(temperature);
        ac.increaseTemperature();
        assertEquals(29, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void testTemperatureDoesNotGoBelow16() {
        ac.turnOn();
        int temperature = 18;
        ac.setTemperature(temperature);
        ac.decreaseTemperature();
        assertEquals(17, ac.getTemperature());
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }
}