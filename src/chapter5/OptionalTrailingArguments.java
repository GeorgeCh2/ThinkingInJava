package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/21
 */
public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for (String s : trailing) {
            System.out.print(s + " ");
        }

        System.out.println();
    }

    public static void main(String[] args){
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }

    /*output
    required: 1 one
    required: 2 two three
    required: 0
     */
}
