package chapter7;

import static chapter6.Print.print;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        print("OverridingPrivate2.f()");
    }

    public void g() {
        print("OveridingPrivate2.g()");
    }
}
