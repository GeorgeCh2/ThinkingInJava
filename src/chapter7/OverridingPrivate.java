package chapter7;

import static chapter6.Print.print;

/**
 * Create by Intellij Idea.
 * f()和g()方法只是和基类的方法同名而已，并不是覆盖
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class OverridingPrivate extends WithFinals {
    private final void f() {
        print("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}
