/*使用下面的方法头编写两个方法：

// Return the reversal of an integer, i.e., reverse(456) returns 654

public static int reverse(int number)

// Return true if number is a palindrome

public static boolean isPalindrome(int number)

        使用reverse 方法实现isPalindrome。如果一个数字的反向倒置数和它的顺向数一样，这个数就称作回文数。编写一个测试程序，提示用户输人一个整数值，然后报告这个整数是否是回文数。*/
package Homework;

import java.util.Scanner;

public class method3_example {
    /**
     * Main Method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Report whether the integer is a palindrome.
        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
        // 條件運算符號 ？：	資料型態 變數名稱 = (條件運算) ? 條件為 true 取此值 : 條件為 false 取此值
        //System.out.println(reverse(number));
    }

    /**
     * Method isPalindrome returns true if number is a palindrome
     */
    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
        //reverse(number)使用與方法引用相同,可以看方法的筆記有詳細說明
    }

    /**
     * Method reverse returns the reversal of an integer
     */
    public static int reverse(int number) {
        String reverse = "";  // Holds reversed number,宣告為字串所以須有雙引號
        String n = number + ""; // Convert number to string
        // Reverse string
        for (int i = n.length() - 1; i >= 0; i--) { //https://medium.com/cubemail88/java-%E4%B8%AD%E7%9A%84-length-length-size-%E4%B8%80%E6%AC%A1%E6%91%B8%E9%80%8F%E9%80%8F-24b82cb41e22
                                                    //n.n.length()為取得n的字串長度

            reverse += n.charAt(i);                 //n.charAt(i)為回傳n字串中的第i個字元,
            //System.out.println(reverse);
        }
        return Integer.parseInt(reverse); // Return reversed integer
        //https://kknews.cc/zh-tw/code/yz5aa9k.html  Integer.parseInt()將字符串參數解析為帶符號的十進位整數。
    }
    //reverse方法 為將輸入的數先利用n.length()取的輸入字串的長度,並利用for迴圈做邏輯控制
    //for迴圈邏輯控制如下:取得字串長度後-1,以i>=0為條件每次i-1,每次執行會用n.charAt(i),取字串中的數並放入reverse
    //因為reverse為字串,所以每次執行reverse += n.charAt(i),只會往後補數字
    //最後return Integer.parseInt(reverse),將reversr的字串轉換為十進位整數後回傳,再利用另外兩個方法做判斷,確認事後為回文數
}
