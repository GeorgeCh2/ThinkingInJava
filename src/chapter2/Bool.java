package chapter2;

import java.util.Random;

/**
 * Create by Intellij Idea.
 * 逻辑操作符
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class Bool {
    public static void main(String[] args){
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));
        //&&、||、 !操作只可应用于布尔值
        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
    }

    /*output
    j = 55
    i > j is true
    i < j is false
    i >= j is true
    i <= j is false
    i == j is false
    i != j is true
    (i < 10) && (j < 10) is false
    (i < 10) || (j < 10) is false
     */
}
