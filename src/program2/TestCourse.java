package program2;

public class TestCourse {
    public static void main(String[] args) {
        Course math = new Course("Math");
        math.addStudent("Billy Bob");
        math.addStudent("Sarah Bulger");
        System.out.println(math.getStudents());
        //Prints the names of the students as an array list

    }
}
