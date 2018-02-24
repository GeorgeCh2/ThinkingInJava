package chapter7;

import static chapter6.Print.*;

public class Bath {
    /**
     * 在定义对象的地方，初始化引用
     */
    private String s1 = "Happy",
                   s2 = "Happy",
                   s3,s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        print("Inside Bath()");
        //在类的构造器中初始化引用
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        //实例初始化
        i = 47;
    }
    @Override
    public String toString() {
        if (s4 == null) {
            //在正要使用这些对象之前初始化（惰性初始化）
            s4 = "Joy";
        }
        return
                "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        print(b);
    }

    /*output
    Inside Bath()
    Soap()
    s1 = Happy
    s2 = Happy
    s3 = Joy
    s4 = Joy
    i = 47
    toy = 3.14
    castille = Constructed
     */
}
