package practice;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        System.out.println("Enter number");
        String n = null;
                n.toString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total bitset count is: "+ getBitCount(scanner.nextInt()));
    }

    private static int getBitCount(int nextInt) {
        if(nextInt <0)
            return -1;
        else {
            int count = 0;
            while(nextInt>0){
                nextInt &= (nextInt-1);
                count++;
            }
            return count;
        }
    }
}
