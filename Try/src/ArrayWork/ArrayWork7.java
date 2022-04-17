package ArrayWork;

import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class ArrayWork7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] Numbers = new double[10];
        System.out.println("Enter ten numbners : ");
        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = input.nextDouble();
        }

        bubbleSort(Numbers);

        for (double e : Numbers) {
            System.out.print(e + " ");
        }
    }

    public static void bubbleSort(double[] list) {  //對輸入的數做冒泡排序判斷
        double temp;
        boolean swapped;
        do {                                        //用do...while至少會判斷一次
            swapped = false;
            for (int i = 0; i < list.length -1; i++) {      //對list中的所有數做一輪判斷
                if (list[i] > list[i + 1]) {                //若list[i] > list[i + 1],則會對值做交換,並將swapped輸出為true
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    swapped = true;
                }
            }

        } while (swapped);       //若有執行if則會swapped=ture,會在執行一次do...while,直到沒有數做交換,並回傳false
    }
}
