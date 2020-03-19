package APITest.Interface;

public interface SaySomeThing {
    void sayName();
    String name = "lee";
    default String printName(){
        return name;
    }
}
