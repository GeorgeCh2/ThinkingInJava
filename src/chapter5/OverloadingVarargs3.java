package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/21
 */
public class OverloadingVarargs3 {
    static void f(float i, Character... args) {
        System.out.println("frist");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args){
        f(1, 'a');
        f('a', 'b');
    }

    /*output
    frist
    second
     */
}
