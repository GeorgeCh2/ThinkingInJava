package chapter4;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/19
 */
public class IfElse {
    static int result = 0;
    static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target)
            result = -1;
        else
            result = 0;
    }

    public static void main(String[] args){
        test(10, 5);
        System.out.println(result);

        test(5, 10);
        System.out.println(result);

        test(5, 5);
        System.out.println(result);
    }

    /*output
    1
    -1
    0
     */
}
