package com.chen.demo01;

/**
 * @author chen
 * @date 2020/3/28 1:32
 */
public class HasStatic {
    private static int x = 100;
    private  int y = 100;
    public static void main(String[] args) {
        HasStatic hs = new HasStatic();
        hs.x++;
        hs.y++;
        hs =new HasStatic();
        hs.x++;
        hs.y++;
        System.out.println("x="+hs.x+":y="+hs.y);
    }
}
