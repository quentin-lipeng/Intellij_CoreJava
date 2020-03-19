package GenericTest;

public class Test<E , V> {
    public E e;
    public static void main(String[] args) {
        String e = null;
        Test<String , Integer> test = new Test<String, Integer>(e);
        Test<String , Integer> son = new son<Integer>();
        

    }
    public Test(){
        System.out.println("调用的无参构造");
    }

    public Test(E e){
        System.out.println("调用的一个参数的构造");
    }
}
class son<T> extends Test{
    public T t;
    public son() {
        System.out.println("调用的son的无参构造");
    }
    public void sonMethod(){
        System.out.println();
    }
}

