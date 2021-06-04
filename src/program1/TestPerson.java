package program1;

public class TestPerson {
    public static void main(String[] args) {
        //Prints Name, Phone number, Address, email
        Person p = new Person("Bob", "800-888-8888", "1233 Road Ave", "sample@email.com");
        System.out.println(p);
        //Prints Class rank
        Student s = new Student("Bob", "800-888-8888", "1233 Road Ave", "sample@email.com","Freshman");
        System.out.println(s);
        //Prints Office room, salary, and title
        Staff st = new Staff("Bob", "800-888-8888", "1233 Road Ave", "sample@email.com","Room 1234",2000000,"Janitor");
        System.out.println(st);
        //Prints Office hours and Rank
        Faculty f = new Faculty("Bob", "800-888-8888", "1233 Road Ave", "sample@email.com","Room 1234",2000000,"1-3 MWF","PHD");
        System.out.println(f);
    }
}

