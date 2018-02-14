package chapter2;

/**
 * Create by Intellij Idea.
 * 短路
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class ShortCircuit {
    static boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result : " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result : " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result : " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args){
        //一旦能够明确无误地确定整个表达式的值，就不再计算表达式剩余下的部分了
        boolean b = test1(0) && test2(2) && test3(2);
        System.out.println("expression is " + b);
    }

    /*output
    test1(0)
    result : true
    test2(2)
    result : false
    expression is false
     */
}
