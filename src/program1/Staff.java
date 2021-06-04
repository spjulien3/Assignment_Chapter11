package program1;

import java.util.Date;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String phoneNumber, String address, String email, String office, double salary, String title) {
        super(name, phoneNumber, address, email, office, salary);
        this.title = title;
    }

    @Override
    public String toString(){
        return String.format("Name: %-15s||Phone Number: %-15s||Address: %-15s||Email: %-15s||Office: %-15s||Salary: %-15s|| Date: %-15tb|| Title: %-15s",getName(),getPhoneNumber(),getAddress(),getEmail(),getOffice(),getSalary(),getMyDate(),title);
    }
}
