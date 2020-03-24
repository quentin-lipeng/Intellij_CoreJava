package FileTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class InFileTest {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("src\\FileOnly\\File.txt"),"UTF-8");
        String file = in.next();
        Path path = Paths.get("src\\FileOnly\\File.txt");
        byte[] bytes = Files.readAllBytes(path);


        try (FileInputStream fileInputStream = new FileInputStream(path.toFile())){
            byte[] bytes1 = new byte[fileInputStream.available()];
            fileInputStream.read(bytes1);

            String str = new String(bytes1);
            System.out.println(str);

            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
