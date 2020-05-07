package com.seecen;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test {



    static Map<String,Integer> map = new HashMap<String,Integer>();

    public static void read() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Administrator\\Desktop\\未提交名单.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] names = bufferedReader.readLine().split("、");

        for (int i = 0; i < names.length; i++) {
            if(map.containsKey(names[i])){
                map.put(names[i],map.get(names[i])+1);
            }else{
                map.put(names[i],1);
            }
        }

        map.forEach((k,v)->{
            System.out.println(k+"一共提交了:"+(5-v));
        });
    }

    public static void main(String[] args) throws IOException {
        read();
        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();

    }

}
