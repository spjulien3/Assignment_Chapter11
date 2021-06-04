package program1;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date myDate;

    public Employee() {
        myDate = new Date();

    }

    public Employee(String name, String phoneNumber, String address, String email, String office, double salary) {
        super(name, phoneNumber, address, email);
        this.office = office;
        this.salary = salary;
        myDate = new Date();
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getMyDate() {
        return myDate;
    }

    @Override
    public String toString(){
        return String.format("Name: %-15s||Phone Number: %-15s||Address: %-15s||Email: %-15s||Office: %-15s||Salary: %-15s|| Date: %-15tb||",getName(),getPhoneNumber(),getAddress(),getEmail(),getOffice(),getSalary(),getMyDate());
    }
}
