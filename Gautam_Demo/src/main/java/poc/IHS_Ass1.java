package poc;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.Math.abs;

public class IHS_Ass1 {
     public static void main(String[] args){

         int q = 6;
         int[][] queries = { { 1, -3 }, { 1, 4 }, {3,5}, {2,1},{3,5},{1,11} };
         long[] arr = solve(q,queries);
         for (long l : arr) {
             System.out.println(l);
         }
     }

     private static long[] solve(int Q, int[][] queries){
         LinkedList linkedList = new LinkedList<Integer>();

         ArrayList < Long > arrList = new ArrayList< Long >();


             for(int q_i = 0; q_i < Q; q_i++) {
                int operation = queries[q_i][0];
                int value =  queries[q_i][1];

                switch (operation) {
                    case 1:
                        linkedList.add(value);
                        break;
                    case 2:
                        linkedList.remove(value-1);
                        break;
                    case 3:
                        arrList.add(getSum(linkedList, value));
                        break;
                }

             }

         final long[] arr = new long[arrList.size()];
         int index = 0;
         for (final Long value : arrList) {
             arr[index++] = value;
         }
//         return null;
         return arr;
     }

     private static long getSum(LinkedList linkedList, int value) {
         int sum = 0;
         for (Object ls: linkedList) {
            sum =  abs((int)ls - value) > sum ? abs((int)ls - value) : sum;
         }
         return sum;
     }
}
