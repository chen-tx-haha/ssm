package com.chen.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @author chen
 * @date 2020/3/15 11:28
 */
@RestController
@RequestMapping("/time")
public class controller {
    public static void main(String[] args) {
        getTime();
    }
    @RequestMapping("/getTime")
    public static void getTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String s = sdf.format(new Date());
        System.out.println(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("today",s);
        Gson gson = new Gson();
        String toJson = gson.toJson(map);
        System.out.println(toJson);


    }
}
