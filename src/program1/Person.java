package program1;

public class Person {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;

    public Person() {
    }

    public Person(String name, String phoneNumber, String address, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return String.format("Name: %-15s||Phone Number: %-15s||Address: %-15s||Email: %-15s||",getName(),getPhoneNumber(),getAddress(),getEmail());
    }
}
