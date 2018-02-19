package chapter4;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/19
 */
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result +", ");
        return result;
    }

    public static void main(String[] args){
        while (condition())
            System.out.println("Inside 'while'");

        System.out.println("exited 'while'");
    }
}
