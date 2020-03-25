package CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

  public static void main(String[] args) {
    Collection<Integer> collection = new ArrayList<>();
    collection.add(1);
    collection.add(2);
    collection.add(3);
    //使用Stream
//    collection.parallelStream().filter(b -> !b.equals(2)).forEach(System.out::println);

    collection.stream().filter(s -> !s.equals(2)).forEach(System.out::println);
    Iterator<Integer> iterator = collection.iterator();
    //使用Iterator
//    iterator.forEachRemaining(x -> System.out.println(x));
  }

}
