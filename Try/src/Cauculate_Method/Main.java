package Cauculate_Method;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Number1 = input.nextInt();
        int Number2 = input.nextInt();
        String Cal = input.next();
        int Sum = Calculate(Number1, Number2,Cal);


        System.out.println(Sum);
    }

    public static int Calculate(int Number1, int Number2,String Cal){
        //String Cal = "+";
        //Scanner input = new Scanner(System.in);
        //String Cal = input.next();    新方法不需再宣告一次Scanner
        //Cal = null;   字串型態不須給初始值,給了反而會出錯
        int Sum = 0;
        switch (Cal){
            case "+":
                //Cal = "+";
                Sum = Number1 + Number2;
                break;
            case "-":
                //Cal = "-";
                Sum = Number1 - Number2;
                break;
            case "*":
                //Cal = "*";
                Sum = Number1 * Number2;
                break;
            case "/":
                //Cal = "/";
                Sum = Number1 / Number2;
                break;
        }

        return Sum;
    }


}
/*嘗試使用method的作法做計算題目
1.發現想將1號method的參數用於2號method
需如下宣告method:public static int Calculate(int Number1,int Number2){}
而想將2號method做完的參數回傳1號method時,因為2號method宣告方式有帶參數,
因此要call時需要使用以下語法:int Sum = Calculate(Number1,Number2);
資料型態 (1號method中)參數名稱= method名稱(參數名稱,參數名稱),

2.switch-case可以使用字串或符號作為選擇,但是要記得加上""

3.

TODO:
1.要找出不須在method中在宣告一次Scanner的方法,改善上面的switch
如果需要多一次宣告不如全部寫在Main
->已完成不在method中再次宣告方法
 */