package Array;

public class ArrayOperatel4 {
    public static void main(String[] args) {
        double mylist[] = new double[10];

        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = Math.random() * 100;
        }

        double max = mylist[0];
        for (int i = 1; i < mylist.length; i++) {
            if (mylist[i] > max) {
                max = mylist[i];
            }
        }

        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }

        System.out.println();
        System.out.printf("max =" + max);
    }


}
