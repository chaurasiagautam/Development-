package main.java.practice;

import main.java.myLearning.Java8ListFilesInDirectory;

public class Excp {
    public static void main(String[] args){

//        testexcep(new Exception(Java8ListFilesInDirectory.errorMsg));
//        String temp = "I217_LF03_NL_00097850_000_20200618140832240.xml";
        String temp = "I217_LF03_00097850_000_20200618140832240.xml";
        String[] arr = temp.split("_");
        System.out.println(arr.length);
        System.out.println(arr[arr.length-2]);

    }

    public static void testexcep(Exception exp){
        System.out.println(exp.toString());
        System.out.println(exp.getStackTrace());
    }

}
