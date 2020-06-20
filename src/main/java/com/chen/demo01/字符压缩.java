package com.chen.demo01;

import java.util.Scanner;

/**
 * @author chen
 * @date 2020/3/20 15:37
 */
public class 字符压缩 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String str = zipData(s);
            System.out.println(str);
        }
    }
    public static String zipData(String s){
        StringBuilder stringBuilder = new StringBuilder();//空
        //获取第一个字符
        char oneChar = s.charAt(0);
        //字符数量默认1个
        int count = 1;
        for (int i = 1;i<s.length();i++){
            char c = s.charAt(i);//第二个字符
            if (oneChar==c){
                count++;
            }else {
                if (count>1){
                    stringBuilder.append(oneChar);
                    stringBuilder.append(count);
                    count=1;
                }else {
                    stringBuilder.append(oneChar);
                }
            }
            //把第二个字符赋值给第一个
            oneChar=c;
        }
        if (count>1){
            stringBuilder.append(oneChar);
            stringBuilder.append(count);
        }else {
            stringBuilder.append(oneChar);
        }

        return stringBuilder.toString();
    }
}
