package chapter7;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/24
 */
public class FinalArguments {
    /**
     * final参数
     * @param g
     */
    void with(final Gizmo g) {
        //无法在方法中更改final参数引用所指向的对象
        //g = new Gizmo();
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args){
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
