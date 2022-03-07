package Array;

import java.util.Scanner;

public class ArrayOperatel2 {
    public static void main(String[] args){
        double mylist[] = new double[10];

        for (int i = 0 ; i < mylist.length ; i++){
            mylist[i] = Math.random() * 100;
        }

        for ( int i = 0 ; i < mylist.length ; i++){
            System.out.print(mylist[i] + " ");
        }

        System.out.println();
        char [] city = {'D','B','A'};
        System.out.println(city);

    }
}
