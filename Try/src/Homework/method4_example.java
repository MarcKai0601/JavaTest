/*使用下面的方法头编写方法，反向显示一个整数：

public static void reverse(int number)

        例如：reverse(3456)返回6543。编写一个测试程序，提示用户输人一个整数，然后显示它的反向数。*/
package Homework;

import java.util.Scanner;

public class method4_example {


    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("Display and integer reversed:");

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Display the reversal of number
        reverse(number);
    }

    /**
     * Reverse Method displays an integer in reverse order
     */
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print((number % 10));//每次對number取10的餘,再將number/10,當while執行到最後一次時就會將輸入的數倒序
            number /= 10;
            //System.out.println(number);
        }
        System.out.println();
    }
}
