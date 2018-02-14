package chapter2;

import java.util.Random;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/14
 */
public class MathOps {
    public static void main(String[] args) {
        //随机数生成器，47作为种子（用于随机数生成器的初始化值，随机数生成器对于特定的种子值总是产生相同的随机数序列）
        Random rand = new Random(47);
        int i, j, k;

        //产生1到100之间的随机数(参数设置了产生随机数的上限，下限为0)
        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);

        //"+"
        i = j + k;
        System.out.println("j + k : " + i);

        //"-"
        i = j - k;
        System.out.println("j - k :" + i);

        //"/"
        i = k / j;
        System.out.println("k / j :" + i);

        //"*"
        i = j * k;
        System.out.println("j * k :" + i);

        //"%"
        i = k % j;
        System.out.println("k % j : " + i);

        //"%="
        j %= k;
        System.out.println("j %= k :" + j);


        //浮点型
        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextFloat();
        System.out.println("w : " + w);

        //"+"
        u = v + w;
        System.out.println("v + w : " + u);

        //"-"
        u = v - w;
        System.out.println("v - w : " + u);

        //"*"
        u = v * w;
        System.out.println("v * w : " + u);

        //"/"
        u = v / w;
        System.out.println("v / w : " + u);

        //"+="
        u += v;
        System.out.println("u += v : " + u);

        //"-="
        u -= v;
        System.out.println("u -= v : " + u);

        //"*="
        u *= v;
        System.out.println("u *= v : " + u);

        //"/="
        u /= v;
        System.out.println("u /= v : " + u);
    }

    /*output
    j: 59
    k: 56
    j + k : 115
    j - k :3
    k / j :0
    j * k :3304
    k % j : 56
    j %= k :3
    v : 0.5309454
    w : 0.0534122
    v + w : 0.5843576
    v - w : 0.47753322
    v * w : 0.028358962
    v / w : 9.940527
    u += v : 10.471473
    u -= v : 9.940527
    u *= v : 5.2778773
    u /= v : 9.940527
     */
}
