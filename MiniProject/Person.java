public abstract class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    public Person(String name, String address, int phoneNumber,String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email=email;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public int getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
}