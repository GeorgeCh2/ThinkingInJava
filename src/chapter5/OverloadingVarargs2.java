package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/21
 */
public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args){
        f(1, 'a');
        //f('a', 'b');
    }
}
