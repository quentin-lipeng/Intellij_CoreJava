package APITest.Interface;

public class InterTest implements SaySomeThing{
    @Override
    public void sayName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        
    }
}
