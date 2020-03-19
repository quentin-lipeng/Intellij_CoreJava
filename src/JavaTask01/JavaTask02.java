package JavaTask01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaTask02 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] arr = new int[10];
        int rand;
        Set<Integer> set = new HashSet<>();
        int same = 0;

        for (int i=0;i<10;i++){
            rand = (int)( Math.random()*20+20 );
            arr[i] = rand;
            set.add(arr[i]);
            for (int j=0;j<i;j++) {
                if (arr[j] == rand) {
                    same++;
                    i--;
                    break;
                }
            }
        }
        System.out.println("same element=> " + same);

        Iterator iter = set.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(">");
        }

//        System.out.println("arr.length = " + arr.length);
//        Print(arr);
    }
}
