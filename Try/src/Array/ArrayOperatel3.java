package Array;

public class ArrayOperatel3 {
    public static void main(String[] args){
        double mylist[] = new double[10];

        for (int i = 0 ; i < mylist.length ; i++){
            mylist[i] = Math.random() * 100;
        }

        double total = 0;
        for (int i = 0 ; i < mylist.length ; i++){
            System.out.print(mylist[i] + " ");
            total += mylist[i];
        }
        System.out.println();
        System.out.printf("total " + total);
    }
}
