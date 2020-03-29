package com.CoreJava.PreferencesTest;

import java.io.*;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * 输出一个.XML的首选项文件
 */
public class PreferencesTest {
    public static void main(String[] args) {

        Preferences preferences = Preferences.userRoot();
        Preferences node = null;
        node = Preferences.userNodeForPackage(new PreferencesTest().getClass());
//        node = preferences.node("src\\com\\CoreJava\\PreferenceTest");

        File file = new File("src\\com\\CoreJava\\PreferenceTest");
        System.out.println(node.get("name", "def"));
//        try (OutputStream outputStream = new FileOutputStream(file);){
//            node.put("name","quinlan");
//            node.exportNode(outputStream);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (BackingStoreException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
