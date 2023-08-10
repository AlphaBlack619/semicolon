import java.util.Arrays;

public enum August10 {
        NORTH_CENTRAL ("Benue", "kogi", "Kwara", "Nasarawa", "Niger", "Plateau", "Federal Capital Territory"),
        NORTH_EAST ("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
        NORTH_WEST("Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Sokoto", "Zamafara"),
        SOUTH_EAST("Abai", "Anambra", "Ebonyi", "Enugu", "Imo"),
        SOUTH_SOUTH("Akwa Ibom", "Basyelsa", "Cross River", "Delta", "Edo", "Rivers"),
        SOUTH_WEST("Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo");

    private final String [] state;
    August10 (String...arg){
        state = arg;
    }
        public String [] getState(){
            return state;
        }

        public static void checker(String sts){
            August10 [] geos = August10.values();
            for (August10 goe: geos) {
                for (String stt: goe.getState()){
                    if (stt.equalsIgnoreCase(sts)){
                        System.out.println(goe);
                    }

                }
            }
        }

    public static void main(String[] args) {

    }

     }

