/*编写一个方法，计算一个整数各位数字之和。使用下面的方法头：

public static int sumDigits(long n)

        例如：sumDigits(234)返回9(2+3+4).

        提示：使用求余操作符％ 提取数字，用除号/ 去掉提取出来的数字。例如：使用234X10 (=4 ) 抽取4。然后使用234/10 (=23 ) 从234 中去掉4。使用一个循环来反复提取和去掉每位数字，直到所有的位数都提取完为止。

        编写程序提示用户输入一个整数，然后显示这个整数所有数字的和。*/
package Homework;

import java.util.*;

public class method2_example {
    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter a integer: ");
        long number = input.nextLong();

        // Display the sum of all the digits in the integer
        System.out.println("The sum of the digits in " + number + " is " +
                sumDigits(number));
    }

    /**
     * Compute the sum of the digits in an integer
     */
    public static long sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;//利用取餘數的效果讓每次除10後餘,搭被n /= 10取代需要每次取一個位數的計算方式,ex:234每次取餘數結果為2,3,4
            n /= 10;
        }

        return sum;
    }
}
