package Task01;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        Student stu = new Student(30602190218L, "黎冠鹏", Student.Gender.Male, LocalDate.of(2000,02,22));
        System.out.println("getAge()= "+stu.getAge());
        System.out.println(stu);

    }
}
