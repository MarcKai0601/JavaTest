package Array;

import java.util.Scanner;

public class ArrayOperatel {
    public static void main(String[] args){
        double mylist[] = new double[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + mylist.length + " values:");
        for (int i = 0 ; i < mylist.length ; i++){
            mylist[i] = input.nextDouble();
        }

        for ( int i = 0 ; i < mylist.length ; i++){
            System.out.print(mylist[i] + " ");
        }
    }
}
