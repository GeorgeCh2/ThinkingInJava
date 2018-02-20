package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/20
 */
public class ExplicitStatic {
    public static void main(String[] args){
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }

    /*output
    Inside main()
    Cup(1)
    Cup(2)
    f(99)
     */
}
