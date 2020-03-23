package StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 通过intStream输出随机数
 *  > Random下的ints返回intStream对象
 * 通过Stream遍历list
 */
public class FirstStream {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(5,15).limit(10).forEach(System.out::println);
//        random.ints().limit(5).sorted().forEach(System.out::println);
//        random.ints().limit(5).sorted().forEach( (s)-> System.out.println(s*2));
        Stream st = Stream.empty();
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
//        l.stream().limit(2).forEach(System.out::println);

    }
}
