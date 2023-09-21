package data.model;

import java.time.LocalDateTime;

public class Contact {
    private String name;
    private String address;
    private String telephoneNumber;
    private String email;
    private final LocalDateTime time = LocalDateTime.now();
    private final MyGUI gui = new MyGUI();

    public Contact(String name, String address, String telephoneNumber, String email) {
        try {
            this.name = name;
            this.address = address;
            this.telephoneNumber = telephoneNumber;
            this.email = email;
        }
        catch (IllegalArgumentException num){
           gui.error("Invalid Value detected","Error");
        }
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
                this.name = name;}

    public String getAddress() {
        return address;
    }

    public void updateAddress(String address) {
                this.address = address;}
    public String getTelephoneNumber() {
        return telephoneNumber;}
    public void updateTelephoneNumber(String telephoneNumber) {
                this.telephoneNumber = telephoneNumber;}

    public String getEmail() {
        return email;}

    public void updateEmail(String email) {
                this.email = email;}


    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", time=" + time +
                '}';
    }
}
