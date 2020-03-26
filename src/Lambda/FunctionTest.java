package Lambda;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> f = s -> s+1;
        Function<Integer, Integer> m = s -> s*2;

        System.out.println(((Function<Integer, Integer>) (s) -> s * 2).apply(12));

//        System.out.println( Function.identity().apply(12) );
    }
}
