package Homework;

import java.util.Scanner;

public class method4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number){
        int n = 0;
        int m = number;
        while(number>0) {
            n = n * 10 + number % 10;
            number = number / 10;
        }
        if(n == m) {
            System.out.println(m+"是迴文數");
        }
        else {
            System.out.println(m+"不是迴文數");
        }
    }
}
