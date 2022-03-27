package Array;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.sort(numbers);//Array類的排序

        for (double e : numbers) {
            System.out.print(e + " ");
        }

        System.out.println();

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars);

        System.out.println(chars);

        int[] list = {12, 31, 4, 1, 6, 8, 1};
        int[] list1 = {31, 12, 4, 1, 6, 8, 1};
        int[] list2 = {12, 31, 4, 1, 6, 8, 1};

        int index = Arrays.binarySearch(list, 1);//回傳Key數值陣列中第一個值的下標
        System.out.println("index = " + index);

        boolean flag = Arrays.equals(list, list1);//對陣列每個值做比對
        System.out.println("flag = " + flag);
        boolean flag1 = Arrays.equals(list, list2);
        System.out.println("flag1 = " + flag1);

        /*.fill(list, 10);//填充陣列中的值,ex:此行在list陣列中每個位置填入10
        for (double e : list) {
            System.out.print(e + " ");
        }*/

        Arrays.fill(list, 1, 5, 11);//填充指定陣列位置中的值,ex:此行在list陣列中1~4位置填入11,結束需+1,ex:1~4顯示11,需給值為1~5
        for (double e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(list));//Arrays.toString(list)為返回陣列的值,可以使用左邊的code取代for迴圈
                                                  //即可完成顯示所有陣列中的值

    }
}
