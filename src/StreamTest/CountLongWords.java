package StreamTest;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
/*
计算长字母单词数量
 */

public class CountLongWords
{
    public static void main(String[] args) throws IOException
    {
        String contents = new String(Files.readAllBytes(
                Paths.get("C:\\Users\\16670\\Desktop\\03-16-20.txt")), StandardCharsets.UTF_8);
        //F:\CoreJava\src\StreamTest\CountLongWords.java
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long count = 0;
        for (String w : words)
            if (w.length() > 12) count++;
        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 3).count();
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 3).count();
        System.out.println(count);
    }
}