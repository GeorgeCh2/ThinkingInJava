package chapter2;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class EqualsMethod2 {
    public static void main(String[] args){
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        //equals()的默认行为是比较引用，如果想要在自己的类中使用，需要覆盖equals()方法
        System.out.println(v1.equals(v2));
    }

    /*output
    false
     */
}
