package program1;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String phoneNumber, String address, String email, String office, double salary, String officeHours, String rank) {
        super(name, phoneNumber, address, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString(){
        return String.format("Name: %-15s||Phone Number: %-15s||Address: %-15s||Email: %-15s||Office: %-15s||Salary: %-15s|| Date: %-15tb|| Office Hours : %-15s|| Rank: %-15s||",getName(),getPhoneNumber(),getAddress(),getEmail(),getOffice(),getSalary(),getMyDate(),officeHours,rank);
    }
}

