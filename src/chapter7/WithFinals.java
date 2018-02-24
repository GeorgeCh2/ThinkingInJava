package chapter7;

import static chapter6.Print.print;

/**
 * Create by Intellij Idea.
 * 如果某方法为private，它就不是基类的接口的一部分。它仅是一些隐藏于类中的程序代码。
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class WithFinals {
    private final void f() {
        print("WithFinals.f()");
    }

    private void g() {
        print("WithFinals.g()");
    }
}
