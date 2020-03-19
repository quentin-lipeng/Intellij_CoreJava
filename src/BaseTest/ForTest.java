package BaseTest;

public class ForTest {
    public static void main(String[] args) {
        int a =0;
        for(int i=1;i<=3;i++)
        for (int j=1;j<=i;j++)
            a = a+j;
        System.out.println(a);
    }
}
