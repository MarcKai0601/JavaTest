package Array;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pleasr Enter total number:");
        int n = input.nextInt();
        double number [] = new double[n];
        double sum = 0;
        System.out.print("Please Enter number :");
        for (int i = 0 ; i < n ; i++){
            number[i] = input.nextDouble();
            sum += number[i];
        }

        double avg = sum / n;
        int count = 0;
        for (int i = 0 ; i < n ; i++){
            if(number[i] > avg){
                count++;
            }
        }

        System.out.println("Average is " +avg);
        System.out.println("Number of elements above the average is "+count);
    }
}
