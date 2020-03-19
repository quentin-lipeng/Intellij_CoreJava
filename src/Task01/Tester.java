package Task01;

import static jdk.nashorn.internal.objects.Global.println;

public class  Tester {
    public static void main(String[] args) {
        StudentArrayList students = new StudentArrayList();
        students.add(new Student(1001L,"宋江",null,null));
        students.add(new Student(1002L,"吴用",null,null));
        students.add(new Student(1003L,"李逵",null,null));
        println(students);
    }
    private static void println(StudentArrayList students){
        System.out.println("size = " + students.Size());
        for (int i = 0; i < students.Size(); i++){
            System.out.println(students.get(i));
        }
    }
}
