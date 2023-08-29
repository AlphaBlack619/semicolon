package MyOOP;

class MottoBike {
    private String colour;
    private final TypeOfBike typeOfBike;

    private final int numberOfTires;
    public MottoBike(String colour, int numberOfTires, TypeOfBike typeOfBike){
        this.colour = colour;
        this.numberOfTires = numberOfTires;
        this.typeOfBike = typeOfBike;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public TypeOfBike getTypeOfBike() {
        return typeOfBike;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }
}
