package chapter2;

/**
 * Create by Intellij Idea.
 * 比较对象的内容
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class EqualsMethod {
    public static void main(String[] args){
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        //euqals()比较的是对象的实际内容
        System.out.println(n1.equals(n2));
    }
    /*output
    true
     */
}
