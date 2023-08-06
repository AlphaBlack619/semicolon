package AlphaStore;

public class Users {
    private String name;
    private int age;
    private String emailAddress;
    private Address homeAddress;
    private String password;
    private String phoneNumber;
    private UserType userType;

    public Users(String name, int age, String emailAddress, Address homeAddress, String phoneNumber, UserType userType,String password){
       this.name = name;
       this.userType = userType;
       this.emailAddress = emailAddress;
       this.homeAddress = homeAddress;
       this.phoneNumber = phoneNumber;
       if (age < 0){
           throw new IllegalArgumentException(age + "Is Not A Valid Age");
       }else this.age = age;
       this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public UserType getUserType() {
        return userType;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {return password;}

    public String getPhoneNumber() {return phoneNumber;}

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException(age + "Is Not A Valid Age");
        }else this.age = age;}

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;}

    public void setHomeAddress(Address homeAddress) {this.homeAddress = homeAddress;}

    public void setPassword(String password) {this.password = password;}

    public void setUserType(UserType userType) {this.userType = userType;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
}
