package chapter5;

import java.util.Arrays;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class ArrayInit {
    public static void main(String[] args){
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3,
        };
        Integer[] b = new Integer[] {
                new Integer(1),
                new Integer(2),
                3,
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    /*output
    [1, 2, 3]
    [1, 2, 3]
     */
}
