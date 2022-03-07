package Array;

public class ArrayOperatel5 {
    public static void main(String[] args) {
        double mylist[] = {1 ,5 ,3 ,4 ,5 ,5};

        double max = mylist[0];
        int indexOfmax = 0;

        for (int i = 1 ; i < mylist.length ; i++){
            if (mylist[i] > max){
                max = mylist[i] ;
                indexOfmax = i;
            }
        }
        System.out.printf("max = "+ max);
        System.out.println(" indexOfmax =" + indexOfmax);
    }
}
