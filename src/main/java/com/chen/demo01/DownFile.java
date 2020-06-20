package com.chen.demo01;

import java.io.File;

/**
 * @author chen
 * @date 2020/5/10 20:59
 */
public class DownFile {
    public static void main(String[] args) {
        File file = new File("E:\\1");
        printDir(file);
    }
    public static void printDir(File file){
        //获取子文件和目录
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                //是文件
                if (file1.getName().endsWith(".mp3")){
                    System.out.println("文件名："+file1.getAbsolutePath());
                }
            }else {
                printDir(file);
            }
        }
    }
}
