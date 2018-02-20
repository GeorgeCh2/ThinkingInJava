package chapter5;

import java.util.Arrays;
import java.util.Random;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class ArrayNew {
    public static void main(String[] args){
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];

        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }

    /*output
    length of a = 18
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
     */
}
