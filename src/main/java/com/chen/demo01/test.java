package com.chen.demo01;

/**
 * @author chen
 * @date 2020/3/20 14:55
 */
public class test {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b=3;
        int c =3;
        System.out.println(a==b);
        System.out.println(a==c);

        /*System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String s1 = format(s);
            System.out.println(s1);
        }*/

    }
    /*public static String format(String s) {
        StringBuilder sb = new StringBuilder();
        char num = (char)(32);
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c>='a'&&c<='z'||c>='A'&&c<='Z'){//是字母
                if (c>='a'&&c<='z'){
                    c=(char) (c-num);
                    sb.append(c);
                }else {
                    c=(char) (c+num);
                    sb.append(c);
                }
            }else {
                //不是字母直接拼接
                sb.append(c);
            }
        }
        String s1 = sb.toString();
        return s1;

    }*/


}
