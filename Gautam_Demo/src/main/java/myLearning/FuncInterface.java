package main.java.myLearning;

/**
 * Only one abstract method
 */
@FunctionalInterface
public interface FuncInterface {
    int myMethod(String name, int id);

    static void mySTatic(){
        System.out.println("MyStatic");
    }

    default void myDef(){
        System.out.println("Def");
    }
}
