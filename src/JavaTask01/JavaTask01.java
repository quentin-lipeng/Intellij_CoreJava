package JavaTask01;

import java.util.ArrayList;
import java.util.List;

public class JavaTask01 {
    public static void main(String[] args) {
        boolean flag = true;
        String[] arr = new String[]{"aaa", "bbb", "aaa", "abc", "xyz", "123", "xyz"};

        List<String> list = new ArrayList<>();


        for (String s : arr) {
            if (!list.isEmpty()) {
                //因为是查看list已存在元素是否和要添加的元素相等
                //所以是要在list.size()次以内
                for (String temp : list) {
                    if (temp.equals(s)) {
                        flag = false;
                        break;
                    }
                    flag = true;
                }
            }
            if (flag) {
                list.add(s);
            }
        }
        System.out.println(list);
    }
}
