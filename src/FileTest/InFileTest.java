package FileTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class InFileTest {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("src\\FileOnly\\File.txt"),"UTF-8");
        String file = in.next();
        System.out.println(file);

    }
}
