public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public Bike() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        speed = 0;
        gear = 1;
    }

    public void accelerate() {
        if (!isOn) return;

        switch (gear) {
            case 1: speed += 1; break;
            case 2: speed += 2; break;
            case 3: speed += 3; break;
            case 4: speed += 4; break;
        }
        updateGear();
    }

    public void decelerate() {
        if (!isOn) return;

        switch (gear) {
            case 1: speed -= 1; break;
            case 2: speed -= 2; break;
            case 3: speed -= 3; break;
            case 4: speed -= 4; break;
        }
        updateGear();
    }

    private void updateGear() {
        if (speed < 20) {
            gear = 1;
        } else if (speed < 30) {
            gear = 2;
        } else if (speed < 40) {
            gear = 3;
        } else {
            gear = 4;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}