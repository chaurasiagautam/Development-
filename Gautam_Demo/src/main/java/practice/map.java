package main.java.practice;

import java.util.HashMap;

public interface map {

//    HashMap mp = new HashMap();

     void myMethod();
     default void myDef(){
         System.out.println("Default method");
     };
     static void show(){
         System.out.println("Static method");
     };
}
