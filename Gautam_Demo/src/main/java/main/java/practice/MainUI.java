package main.java.practice;

import main.java.myLearning.FuncInterface;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MainUI {


    public static void main(String[] args){

        testCollection();
    }

    private void testInnerClass(){
        main.java.practice.Outer outer = new main.java.practice.Outer();
        main.java.practice.Outer.Inner inner = outer.new Inner();
        inner.display();
    }

    private static void anonyumsClass(){
        /**
         * only single copy of inner class, we cannot get multiple
         * instance of runnable object;
         */
        Thread thread = new Thread(){
            public void run(){
                System.out.println("RUN");
            }
        };

        /**
         * Now using lambda
         */

    }

    private static void testInterface(){
        main.java.practice.MapImpl mapD = new main.java.practice.MapImpl(){
            @Override
            public void myDef() {
                System.out.println("Anonymous class");
            }
        };
        mapD.myMethod();
        mapD.myDef();
        main.java.practice.map.show();

    }

    private static void testFunc(){
        FuncInterface anInterface = (n,d) -> 100;
        anInterface.myMethod("Gautam",10);
    }

    private static <e> void testCollection(){
       List list = new ArrayList();
       list.add(Collections.nCopies(10, 10));
       list.forEach(x -> System.out.println(x));

       ConcurrentHashMap map = new ConcurrentHashMap<>();
       map.put(1,"ABC");
       map.put(2,"CDE");
        System.out.println(map.remove(2,"ABC"));
        list.stream().mapToDouble(n -> (double) n).max();
        List<Integer> list1 = Arrays.asList(3, 4, 6, 12, 20);
        list1.stream().filter(num -> num >20).forEach(System.out::println);

        Map<String,List<main.java.practice.Car>> listMap = (Map<String, List<main.java.practice.Car>>) list.stream().collect(Collectors.groupingBy
                ((main.java.practice.Car c)->{return c.getCondition();}));
        listMap.forEach((k,v)->System.out.println(k + " - " + v));

        System.out.println(listMap);

        InputStream in;
        try(BufferedReader reader = new BufferedReader(new FileReader("in"));) {
            reader.lines().forEach(ln -> System.out.println(ln));
            reader.lines().map(ln -> ln.split(",")).
                    mapToInt(ar -> new Integer(ar[3]))
                    .forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }{

        }

    }
}
