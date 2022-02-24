import java.util.*;

public class C1 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);


            System.out.println("Please Enter start namber:");
            int start = input.nextInt();
            System.out.println("Please Enter End namber:");
            int end = input.nextInt();
            int countwhile = 0;  //countwhile是用來控制一行顯示幾個數
            int countfor = 0;    //countfor是用來控制一行顯示幾個數
            int number = start;

            //判斷式,確認start和end是否想同與start>end
            while (start == end || start > end){
                //countfor = countfor - 100;
                //countwhile = countwhile - 100;
                System.out.println("non result");
                break;
            }

           /*for(int n = start ; n <= end ; n++){
                countfor = countfor + 1;

                if( countfor % 5 != 0 && countfor >0){  //要求一次顯示幾個數字是裡用%_控制
                    System.out.printf("%7d",n); //%_d中間的_數字帶表空格數
                }
                else if(countfor %5 == 0 && countfor > 0){
                    System.out.printf("%7d\n",n);
                }
            }

            System.out.println("");
            System.out.println("");*/

            while(number <= end && countwhile >= 0){ //number就是start,但是因為程式執行流程stsrt可能會被改變,所以另外宣告一個number變數
                countwhile = countwhile + 1;
                if(countwhile % 7 !=0){
                    System.out.printf("%7d",number);
                }
                else if(countwhile % 7 == 0){
                    System.out.printf("%7d\n",number);
                }
                number =    number + 1;
            }
        }
}
