package Homework;

import java.util.Scanner;

public class method3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int n = reverse(number);
        Boolean A= isPailndrome(number,n);
        if(A==true){
            System.out.println(number+"此數為回文數");
        }
        else {
            System.out.println(number+"此數不是回文數");
        }
    }

    public static int reverse(int number){
        int n = 0;
        while(number > 0) {
            n= n * 10 + number % 10;
            number = number / 10;
        }
        return n;
    }

    public static boolean isPailndrome(int number,int n){
        if(n==number){
            return true;
        }
        else{
            return false;
        }
    }
}
