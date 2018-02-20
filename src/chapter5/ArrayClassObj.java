package chapter5;

import java.util.Arrays;
import java.util.Random;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class ArrayClassObj {
    public static void main(String[] args){
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];

        System.out.println("length of a = " + a.length);

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500);
        }

        System.out.println(Arrays.toString(a));
    }

    /*output
    length of a = 18
    [55, 193, 361, 461, 429, 368, 200, 22, 207, 288, 128, 51, 89, 309, 278, 498, 361, 20]
     */
}
