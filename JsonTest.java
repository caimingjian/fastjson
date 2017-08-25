package com.jianbing.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cmj on 2017/8/24.
 */
public class JsonTest {
    public static void main(String[] args) {
        Book book=new Book();
        book.setId(1);
        book.setName("十万个为什么");
//        JavaBean对象转JSONObject
        JSONObject jsonObject= (JSONObject) JSON.toJSON(book);
//        JSONObject转JSONString
        String jsonString=JSONObject.toJSONString(jsonObject);
//        JSONString转JavaBean对象
        Book book1=JSON.parseObject(jsonString,Book.class);
//        JSONObject转JavaBean对象
        Book book2 = jsonObject.toJavaObject(Book.class);
//        System.out.println(jsonObject);
        HashMap map=new HashMap();
        map.put("1","姓名");
        map.put("2","性别");
        JSONObject jsonObject1= (JSONObject) JSON.toJSON(map);
//        System.out.println(map);


        Book book22=new Book();
        book22.setName("JAVA");
        book22.setId(1);
        Book book33=new Book();
        book33.setName("C");
        book33.setId(2);
        List<Book> books=new ArrayList<>();
        books.add(book33);
        books.add(book22);
//        list转JSONArray
        String js= JSON.toJSONString(books);
        JSONArray jsonArray=JSONArray.parseArray(js);
//        JSONArray转list
        List<Book> list= JSONObject.parseArray(jsonArray.toString(),Book.class);
        System.out.println(list);

    }
}
