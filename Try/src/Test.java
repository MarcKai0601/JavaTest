public class Test {
    public static void main(String[] args){
//        int[] myList = {1, 2, 3, 4, 5, 6};
//
//        for (int i = myList.length - 2; i >= 0; i--) {
//            myList[i + 1] = myList[i];
//        }
//
//        for (int e: myList)
//            System.out.print(e + " ");



//        int list[] = {1, 2, 3, 4, 5, 6};
//
//        for (int i = 1; i < list.length; i++)
//            list[i] = list[i - 1];
//
//        for (int i = 0; i < list.length; i++)
//            System.out.print(list[i] + " ");


        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        list2 = list1;//有這行list2會永遠等於list1
        System.out.println(list1[0]+" "+list1[1]+" "+list1[2]);
        System.out.println(list2[0]+" "+list2[1]+" "+list2[2]);
        System.out.println();
        list1[0] = 0;
        System.out.println(list1[0]+" "+list1[1]+" "+list1[2]);
        System.out.println(list2[0]+" "+list2[1]+" "+list2[2]);
        System.out.println();
        list1[1] = 1;
        System.out.println(list1[0]+" "+list1[1]+" "+list1[2]);
        System.out.println(list2[0]+" "+list2[1]+" "+list2[2]);
        System.out.println();
        list2[2] = 2;
        System.out.println(list1[0]+" "+list1[1]+" "+list1[2]);
        System.out.println(list2[0]+" "+list2[1]+" "+list2[2]);
        System.out.println();

        for (int i = 0; i < list2.length; i++)
            System.out.print(list2[i] + " ");

    }
}
