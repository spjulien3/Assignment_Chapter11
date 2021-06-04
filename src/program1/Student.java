package program1;

public class Student extends Person{
    private String classStatus;

    public Student(String name, String phoneNumber, String address, String email, String classStatus) {
        super(name, phoneNumber, address, email);
        this.classStatus = classStatus;
    }
    @Override
    public String toString(){
        return String.format("Name: %-15s||Phone Number: %-15s||Address: %-15s||Email: %-15s||Class Status: %-15s||",getName(),getPhoneNumber(),getAddress(),getEmail(),classStatus);
    }
}
