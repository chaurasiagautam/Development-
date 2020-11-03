package main.java.practice;

public class Outer {

    private int id;
    private String name;

    //non-static Inner class
    // we can access outer class variable inside inner class
    // but vice versa not possible.

    public void show(){
        System.out.println("Outer class");
    }

    /**
     * overloading is an advantage
     */
    class Inner{
        private int eid;
        public void display(){
            System.out.println(id +" "+eid);
        }
    }
}
