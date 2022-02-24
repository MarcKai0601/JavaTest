/*
設計一個程式，由使用者從螢幕輸入正整數n與m，並且由n至m所有的整數由小至大印出，但每列只印出最多7個數字，
如果輸入m小於(等於)n，則輸出沒有結果。
 */
import java.util.Scanner;

public class C2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int count = 0;
        System.out.printf("Please Enter Start number:");
        int start = s.nextInt();
        System.out.printf("Please Enter Enf number:");
        int end = s.nextInt();

        while (start >= end || end == 0){
            System.out.printf("non result");
            break;
        }

        while (start <= end && count >= 0){
            count = count + 1;
            if(count %7 != 0){
                System.out.printf("%7d",start);
            }else if(count %7 == 0){
                System.out.printf("%7d\n",start);
            }
            start = start + 1;
        }
    }
}

/*
心得:宣告三個變數,兩個控制Start和End,一個控制一行輸出機個數
    第一個while判斷輸入是否正確,第二個while控制印出功能,
    包覆兩個if判斷做一行要印出幾個數,利用count每執行一次
    while就+1,根據while執行的次數傳至count,利用if做計算判斷
    做選擇換行的判斷
 */