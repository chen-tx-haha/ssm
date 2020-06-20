package com.chen.demo01;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author chen
 * @date 2020/5/9 16:31
 */
public class FileCount {
    public static void main(String[] args) throws Exception {
        //文件输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\test.txt");
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fileInputStream.read(bytes))!=-1){
            arrayOutputStream.write(bytes,0,len);
        }
        arrayOutputStream.close();
        fileInputStream.close();
        byte[] byteArray = arrayOutputStream.toByteArray();
        String s = new String(byteArray);
        String dest = "";
        //去空格换行
        if (s!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(s);
            dest = m.replaceAll("");
        }
        lind(dest);
    }
    public static void lind(String str){
        //创建一个map
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)){//判断key是否存在
                //不存在
                map.put(c,1);
            }else {
                //存在
                Integer count = map.get(c);//获取key的值
                map.put(c,++count);
            }
        }
        //map转为list
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {
            @Override
            //降序排序
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }

        });
        System.out.println(list.get(0));
    }
}
