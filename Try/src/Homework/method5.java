package Homework;

import java.util.Scanner;

public class method5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double num1,num2,num3;
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        displaySortedNumbers(num1,num2,num3);
        //System.out.println(displaySortedNumbers(num1,num2,num3));
    }

    public static void displaySortedNumbers(double num1,double num2,double num3){
        double A = 0,B = 0,C = 0;
        if(num1 > num2 && num1 > num3){
            A = num1;
            if(num2 > num3){
                B = num2;
                C = num3;
            }
            else if(num3 > num2){
                B = num3;
                C = num2;
            }
        }
        else if(num2 > num1 && num2 > num3){
            A = num2;
            if(num1 > num3){
                B = num1;
                C = num3;
            }
            else if(num3 > num1){
                B = num3;
                C = num1;
            }

        }
        else if(num3 > num2 && num3 > num1){
            A = num3;
            if(num1 > num2){
                B = num1;
                C = num2;
            }
            else if(num2 > num1){
                B = num2;
                C = num1;
            }
        }
        System.out.println(A+">"+B+">"+C);
    }
}
