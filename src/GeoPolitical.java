public enum GeoPolitical {
    NORTH_CENTRAL ("Benue, kogi, Kwara, Nasarawa, Niger, Plateau, Federal Capital Territory"),
    NORTH_EAST ("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe"),
    NORTH_WEST("Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamafara"),
    SOUTH_EAST("Abai, Anambra, Ebonyi, Enugu, Imo"),
    SOUTH_SOUTH("Akwa Ibom, Basyelsa, Cross River, Delta, Edo, Rivers"),
    SOUTH_WEST("Ekiti, Lagos, Ogun, Ondo, Osun, Oyo");
    private final String state;
    GeoPolitical(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    public static void main(String[] args) {
        String display = NORTH_CENTRAL.getState();
        System.out.println(display);

    }
}
