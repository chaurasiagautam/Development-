package poc;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class _IHS_mcq {

    private static int $;

/*    @Test
    private void test1() {
        StringBuilder b = "hacker";
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);
    }*/

    @Test
    void test2() {
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
    }

    @Test
    void test3() {
        String str = "HACKEREARTH";
        String result = "";
        int a;
        for(a = str.length()-1; a >= 0; a--)
            result += str.charAt(a);
        System.out.println(result);
    }

    @Test
    void test4() {
        int n;
        for(int i=0; i < 5; i++)
        {
            n = getValue();
            assert n > 2;
            System.out.println(" " + n);
        }
    }

    static int val = 3;

    static int getValue()
    {
         int $;
        return val--;
    }

    @Test
    void test5() {
        String regex = ".@.";

        System.out.println("Hacker@Earth.com".matches(regex));
        System.out.println("a@N".matches(regex));
        System.out.println("Java@Program".matches(regex));
    }

    @Test
    void test6() {
        int n = 9;
        int temp = n;
        int m = 12;
        int cost = 0;

        while(temp < m) {
            List<Integer> list = getEvenDivisor(temp);
            if(list.size() == 0) {
                cost = -1;
                break;
            }
            for (int i_l = list.size()-1 ; i_l>=0; i_l--) {
                if(temp + list.get(i_l) <= m) {
                    cost = cost + temp/list.get(i_l);
                    temp = temp + list.get(i_l);
                    break;
                }
            }
        }
        System.out.println(cost);


    }

    private List<Integer> getEvenDivisor(int n) {
        List list = new ArrayList<Integer>();
        for (int i = 2;i<n ; i = i+2) {
            if(n%i == 0)
                list.add(i);
        }
        return list;
    }

    @Test
    void test7() {

        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(4.0);
        vals.add(16.0);
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.print(" "+n)));
        System.out.println();
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.print(" "+n));
    }

    @Test
    void test8() {
        String h_e;
        System.out.print($);
    }
}
