package Homework;

public class method1 {
    public static void  main(String[] args){
        int k = 0;
        for(int i = 1; i <= 100; i++) {
            int num = getPentagonalNumber(i);
            System.out.printf("%10d",num);
            k++;
            if(k % 10 == 0){
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n){
    return (n*(3*n-1)/2);
    }
}
