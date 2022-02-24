package Homework;

import java.util.*;

public class method2 {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    long n = input.nextLong();
    int Sum = sumDigits(n);

    System.out.println("Total="+Sum);
    }

    public static int sumDigits(long n){
    long Number1 = n/100;
    long Number2 = ((n/10)-(Number1*10));
    long Number3 = (n-(Number1*100)-(Number2*10));

    int Sum = (int) (Number1+Number2+Number3);

    return Sum;
    }
}
