package chapter7;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class BlankFinal {
    private final int i = 0;
    /**
     * 空白final
     */
    private final int j;
    private final Poppet p;

    /**
     * 必须在域的定义处或每个构造器中用表达式对final进行赋值
     */
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args){
        new BlankFinal();
        new BlankFinal(47);
    }
}
