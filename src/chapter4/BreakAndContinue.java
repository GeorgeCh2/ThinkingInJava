package chapter4;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/19
 */
public class BreakAndContinue {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                //跳出迭代
                break;
            }

            if (i % 9 != 0) {
                //进入下一次迭代
                continue;
            }

            System.out.println(i + " ");
        }

        System.out.println();

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;

            if (j == 1269) {
                break;
            }

            if (i % 10 != 0) {
                continue;
            }

            System.out.println(i + " ");
        }
    }

    /*output
    0
    9
    18
    27
    36
    45
    54
    63
    72

    10
    20
    30
    40
     */
}
