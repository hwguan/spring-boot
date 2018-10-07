package com.ghw.springboot02;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.text.resources.cldr.ff.FormatData_ff;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author ghw
 * @date 2018-10-06 13:55
 */
@RestController
public class Controller {
    /**
     * 注释一下
     */
    private int aa = 11;
    
    /**
     * ffg
     */
    private int ff;
    
    /**
     * ss
     */
    private String fff;
    


    public static final String sh="f";
    private static final String SA="h";

    public static final int aaa = 123;


    @RequestMapping("/hello")
    public String hello() {
        return "hello ghw";
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println();

    }





    public static void method(String aa) {
//        System.out.println("enen");
//        System.out.println("aa = " + aa);
//        System.out.println("aa = [" + aa + "]");
//        System.out.println("Controller.method");
//        int bb = 10;
//        System.out.println("bb = " + bb);
//        int cc = 20;
//        System.out.println("cc = " + cc);
//        System.out.println(bb);

        String[] arr = new String[]{"ghw","aaa","bbb"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);

        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

        ArrayList<Object> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        for (Object o : list) {
            System.out.println(o);

        }

        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {

            System.out.println(i);
        }

        if (list == null) {

        }

        if (list != null) {

        }

        if (list == null) {


        }

        if (list != null) {


        }

        if (list != null) {

        }

        if (list == null) {

        }
        if (list != null) {

        }

        if (list == null) {

        }


    }
}
