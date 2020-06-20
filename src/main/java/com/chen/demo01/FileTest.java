package com.chen.demo01;

import java.io.File;

/**
 * @author chen
 * @date 2020/3/21 21:49
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("d:\\黑马");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("================");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
