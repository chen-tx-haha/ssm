package com.chen.demo01;

import java.util.Arrays;

/**
 * @author chen
 * @date 2020/4/29 17:41
 */
public class SortDemo1 {
    public static void main(String[] args) {
        String s = "7904652";
        demo(s);
    }
    public static void demo(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
    }
}
