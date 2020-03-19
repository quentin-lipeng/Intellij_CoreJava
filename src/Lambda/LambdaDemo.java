package Lambda;

import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {

        /**只需要传一个参数时可以不用括号
         * 方法体括号也可以不写 但需要返回值还是要写{};
         * MyInter<String> mine = s1 -> System.out.println(s1);
         */
        MyInter<Integer> mine = (s1, s2) -> {
            System.out.println(s1+s2);
        };
        mine.apple(3,5);

        //Lambda表达式
//        Comparator<String> lambdaCom = (o1, o2) -> o1.compareTo(o2);
        //上面的Lambda相当于下面的Lambda
//        Comparator<String> lambdaCom = (o1, o2) -> {
//            return o1.compareTo(o2);
//        };
//        int lambdaStr = lambdaCom.compare("hello", "world");
//        System.out.println(lambdaStr);

        //普通方法
//        Comparator<String> strCom = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        int normalStr = strCom.compare("hello", "world");
//        System.out.println(normalStr);
    }
}
