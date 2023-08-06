package AlphaStore;

public class Address {
    private String cityName;
    private String countryName;
    private int houseNumber;
    private String street;
    private String state;
    public Address(String cityName, String countryName, String state, String street, int houseNumber){
        this.cityName = cityName;
        this.countryName = countryName;
        this.state = state;
        this.street = street;
        if (houseNumber < 0){
            throw new IllegalArgumentException(houseNumber + "Is An Invalid House Number");
        }else this.houseNumber = houseNumber;
    }

    public void displayAddress(){
        System.out.println(houseNumber + street + cityName + "\n" + state + countryName);
    }

    public int getHouseNumber() {return houseNumber;}
    public String getCityName() {return cityName;}
    public String getCountryName() {return countryName;}
    public String getState() {return state;}
    public String getStreet() {return street;}
    public void setCityName(String cityName) {this.cityName = cityName;}
    public void setCountryName(String countryName) {this.countryName = countryName;}
    public void setHouseNumber(int houseNumber) {
        if (houseNumber < 0) {
            throw new IllegalArgumentException("Invalid House number");
        }else this.houseNumber = houseNumber;
        }
    public void setState(String state) {this.state = state;}
    public void setStreet(String street) {this.street = street;}
}
