
import java.util.Scanner;

public class Try3 {
    public static void main(String[] args){

        System.out.println("請輸入一個數：");
        Scanner scan = new Scanner(System.in);
        int m= scan.nextInt();
        int number=m;//先快取輸入的這個數，為之後比對做準備
        int n=0;//用來快取倒著計算出的數
        while(m>0) {
            n=n*10+m%10;
            m=m/10;
        }
        if(n==number) {
            System.out.println(number+"是迴文數");
        }
        else {
            System.out.println(number+"不是迴文數");
        }
    }
}
