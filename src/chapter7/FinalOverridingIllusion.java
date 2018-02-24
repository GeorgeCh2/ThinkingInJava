package chapter7;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class FinalOverridingIllusion {
    public static void main(String[] args){
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = op2;
        //op.f();
        //op.g();
        WithFinals wf = op2;
        //wf.g();
        //wf.f();
    }

    /*output
    OverridingPrivate2.f()
    OveridingPrivate2.g()
     */
}
