package chapter6;

import java.io.PrintStream;

public class Print {
    /**
     * 打印一行
     * @param obj 要打印的内容
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }

    /**
     * 打印空白行
     */
    public static void print() {
        System.out.println();
    }

    /**
     * 打印一行，不换行
     * @param obj 要打印的内容
     */
    public static void printb(Object obj) {
        System.out.print(obj);
    }


    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
