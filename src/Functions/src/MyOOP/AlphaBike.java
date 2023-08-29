package MyOOP;

class AlphaBike extends MottoBike {
    private boolean power;
    private int speed;
    private int gear;

    public AlphaBike(String colour, int numberOfTires, TypeOfBike typeOfBike) {
        super(colour, numberOfTires, typeOfBike);
    }

    public boolean getIsOn() {
        return power;
    }

    public void setOn() {
        power = !power;
    }

    public int Show_gear() {
        if (power) {
            if (speed == 0) {
                return 0;
            } else {
                return gear;
            }
        } return 0;
    }
    public int Show_speed () {
        return speed;
    }

    public void accelerate () {
        if (power) {
            if (speed >= 0 && speed <= 20) {
                speed++;
                gear = 1;
            } else if (speed >= 21 && speed <= 30) {
                speed += 2;
                gear = 2;
            } else if (speed >= 31 && speed <= 40) {
                speed += 3;
                gear = 3;
            } else if (speed > 40) {
                speed += 4;
                gear = 4;
            }
        }
    }
    public void deAccelerate () {
        if (power) {
            if (speed >= 0 && speed <= 20) {
                speed--;
                gear = 1;
            } else if (speed >= 21 && speed <= 30) {
                speed -= 2;
                gear = 2;
            } else if (speed >= 31 && speed <= 40) {
                speed -= 3;
                gear = 3;
            } else if (speed > 40) {
                speed -= 4;
                gear = 4;
            }
        }
    }


}
