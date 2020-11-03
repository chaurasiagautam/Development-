package main.java.practice;

import java.util.Arrays;
import java.util.List;

public class ListPrac extends  Thread{

    public static void main(String[] args){
        testLst();
        int i = 2;
        int x[] = {1,2,3,4};
        x[i] = x[i=i++];
        System.out.println(x[i]);
        System.out.println (0.0 % 0.0);


        String t = "!";

    }

    private static void testLst(){
        List<String> lst = Arrays.asList(("Ab,c,d,e,f").split(","));
        lst.forEach(System.out::println);
        System.out.println(lst.contains("e"));
    }

    int test(int i){
        return i;
    }
    void test(){
        System.out.println("q");
    }
}
