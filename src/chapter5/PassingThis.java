package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class PassingThis {
    public static void main(String[] args){
        new Person().eat(new Apple());
    }
    /*output
    Yummy
     */
}
