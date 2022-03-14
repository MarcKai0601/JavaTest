package Array;

import java.util.Scanner;

public class VarArgsDemo2 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Max(1,4,100,7,2,6,42,93,25);
        //Max();

    }

    public static void Max(double... numbers) {
        if (numbers.length == 0){
            System.out.println("No Data Passed");
            return;
        }

        double Maximum = numbers[0];

        for (int i = 1 ; i < numbers.length ; i++){
            if (numbers[i] > Maximum){
                Maximum  = numbers[i];
            }
        }
        System.out.println("Maximum Value is "+Maximum);
    }
}
