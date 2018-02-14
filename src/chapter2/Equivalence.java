package chapter2;

/**
 * Create by Intellij Idea.
 * 对象的等价性
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class Equivalence {
    public static void main(String[] args){
        //尽管对象的内容相同，对象的引用却是不同的，==与!=比较的是对象的引用
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }

    /*output
    false
    true
     */
}
