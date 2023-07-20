package tdd;

public class AirCondition {
    private boolean isOn;
    private String productName;
    private int temperature = 16;

    public AirCondition() {
    }


    public boolean getIsOn() {
        return isOn;
    }

    public void setOn() {
        if (!isOn) {
            isOn = true;
        } else {
            isOn = false;
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void increaseTemperature() {
        if (temperature > 16 && temperature < 30) {
            temperature++;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature < 30 && temperature > 16) {
            temperature--;
        }
    }
}