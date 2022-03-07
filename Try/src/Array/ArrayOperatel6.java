package Array;

public class ArrayOperatel6 {
    public static void main(String[] args) {
        double myList [] = {1 ,2 ,3 ,4 ,5 ,6};

        for ( int i = 0 ; i < myList.length ; i++){
            int j = (int) (Math.random()* (myList.length));
            //Math.random()* 100 會自動生成 0~100間的亂數
            //(int) (Math.random()* (myList.length)),由於Random()的type是double，要讓它變成Integer就需要利用casting把double type的variable變為integer


        double temp = myList[i];
        myList[i] = myList[j];
        myList[j] = temp;

        }

        for (int i = 0 ; i < myList.length ; i++){
            System.out.printf(myList[i]+" ");

        }
    }
}
