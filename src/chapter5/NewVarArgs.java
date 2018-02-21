package chapter5;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/21
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        printArray(new Integer(47), new Float(3.14), new Double(11.11));

        printArray(47, 3.14f, 11.11);

        printArray("one", "two", "three");

        printArray(new A(), new A(), new A());

        printArray((Object[])new Integer[]{1, 2, 3, 4});

        printArray();
    }

    /*output
    47 3.14 11.11
    47 3.14 11.11
    one two three
    chapter5.A@1540e19d chapter5.A@677327b6 chapter5.A@14ae5a5
    1 2 3 4

     */
}
