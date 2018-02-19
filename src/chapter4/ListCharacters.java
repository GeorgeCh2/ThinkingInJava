package chapter4;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2018/2/19
 */
public class ListCharacters {
    public static void main(String[] args){
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int)c + " character: " + c);
            }
        }
    }

    /*output
    value: 97 character: a
    value: 98 character: b
    value: 99 character: c
    value: 100 character: d
    value: 101 character: e
    value: 102 character: f
    value: 103 character: g
    value: 104 character: h
    value: 105 character: i
    value: 106 character: j
    value: 107 character: k
    value: 108 character: l
    value: 109 character: m
    value: 110 character: n
    value: 111 character: o
    value: 112 character: p
    value: 113 character: q
    value: 114 character: r
    value: 115 character: s
    value: 116 character: t
    value: 117 character: u
    value: 118 character: v
    value: 119 character: w
    value: 120 character: x
    value: 121 character: y
    value: 122 character: z
     */
}
