import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    public Bike bike = new Bike();

    @Test
    public void testTurnOn() {
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testTurnOff() {
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testAccelerateGear1() {
        bike.turnOn();
        int result = 0;
        bike.setSpeed(result);
        for (int speed = result; speed < 20; speed++) {
            result = bike.getSpeed() + 1;
        }
        bike.accelerate();
        bike.setSpeed(result);
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void testAccelerateGear2() {
        bike.turnOn();
        int result = 20;
        bike.setSpeed(result);
        for (int speed = result; speed < 30; speed++) {
            result = bike.getSpeed() + 2;
        }
        bike.accelerate();
        bike.setSpeed(result);
        assertEquals(22, bike.getSpeed());
    }

    @Test
    public void testAccelerateGear3() {
        bike.turnOn();
        int result = 30;
        bike.setSpeed(result);
        for (int speed = result; speed < 41; speed++) {
            result = bike.getSpeed() + 3;
        }
        bike.accelerate();
        bike.setSpeed(result);
        assertEquals(33, bike.getSpeed());
    }

    @Test
    public void testAccelerateGear4() {
        bike.turnOn();
        int result = 40;
        bike.setSpeed(result);
        for (int speed = 0; speed < 41; speed++) result = bike.getSpeed() + 4;
        bike.accelerate();
        bike.setSpeed(result);
        assertEquals(44, bike.getSpeed());
    }

    @Test
    public void testDecelerateGear1() {
        bike.turnOn();
        bike.accelerate();
        bike.decelerate(); 
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testDecelerateGear2() {
        bike.turnOn();
        int result = 30;
        bike.setSpeed(result);
        for (int speed = 0; speed < 30; speed++) result = bike.getSpeed() - 2;
        bike.decelerate();
        bike.setSpeed(result);
        assertEquals(28, bike.getSpeed());
    }

    @Test
    public void testDecelerateGear3() {
        bike.turnOn();
        int result = 40;
        bike.setSpeed(result);
        for (int speed = 0; speed < 40; speed++) result = bike.getSpeed() - 3;
        bike.decelerate();
        bike.setSpeed(result);
        assertEquals(37, bike.getSpeed());
    }

    @Test
    public void testDecelerateGear4() {
        bike.turnOn();
        int result = 48;
        bike.setSpeed(result);
        for (int speed = 0; speed < 50; speed++) result = bike.getSpeed() - 4;
        bike.decelerate();
        bike.setSpeed(result);
        assertEquals(44, bike.getSpeed());
    }

    @Test
    public void testGearChangeOnAcceleration() {
        bike.turnOn();
        bike.setGear(1);
        bike.accelerate();
        while (bike.getSpeed() > 0) bike.accelerate();
        assertEquals(1, bike.getGear());
        bike.setGear(1);
        while (bike.getSpeed() > 20) bike.accelerate();
        assertEquals(2, bike.getGear() + 1);
        bike.setGear(2);
        while (bike.getSpeed() > 30) bike.accelerate();
        assertEquals(3, bike.getGear() + 1);
        bike.setGear(3);
        while (bike.getSpeed() > 40) bike.accelerate();
        assertEquals(4, bike.getGear() + 1);
    }

    @Test
    public void testGearChangeOnDeceleration() {
        bike.turnOn();
        bike.setGear(4);
        while (bike.getSpeed() > 40) bike.accelerate();
        assertEquals(4, bike.getGear());
        bike.setGear(4);
        while (bike.getSpeed() > 40) bike.decelerate();
        assertEquals(3, bike.getGear() - 1);
        bike.setGear(3);
        while (bike.getSpeed() > 30) bike.decelerate();
        assertEquals(2, bike.getGear() - 1);
        bike.setGear(2);
        while (bike.getSpeed() > 20) bike.decelerate();
        assertEquals(1, bike.getGear() - 1);
    }
}