package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/21
 */
public class AutoboxingVarargs {
    public static void f(Integer... args) {
        for (Integer i : args) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        f(new Integer(1), new Integer(2));
        f(10, new Integer(11), 12);
    }

    /*output
    1 2
    10 11 12
     */
}
