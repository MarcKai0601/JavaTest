/*一个五角数被定义为n(3n-1)/2, 其中n=1,2,…。所以, 开始的几个数字就是1,5, 12,22, 编写下面的方法返回一个五角数：

public static int getPentagonalNumber(int n)

        编写一个测试程序显示前100 个五角数，每行显示10 个*/
package Homework;

public class method1_example {
    /**
     * Main Method
     */
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONALS = 100; // Display the first 100 pentagonals
        final int NUMBER_PER_LINE = 10; // Display 10 number per line

        // Display the first 100 pentagol numbers
        System.out.println("The first 100 pentagonal numbers, ten per line: ");
        for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
            // Print ten numbers per line
            if (i % NUMBER_PER_LINE == 0) {
                System.out.printf("%7d\n", getPentagonalNumber(i));
            } else {
                System.out.printf("%7d", getPentagonalNumber(i));
            }
        }
    }

    /**
     * Return a pentagonal number
     */
    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
