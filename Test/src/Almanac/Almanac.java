package Almanac;

import java.util.*;

public class Almanac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("使用者輸入:");
        int year = input.nextInt();
        int a = input.nextInt();
        int i;
        int count = a + 1;
        int space = a;


        //印製1月份月曆
        //印出月曆抬頭
        System.out.println(year+"年1月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");


        //印製1月份月曆
        //設定該年一月月曆是從星期幾開始
        if( a == 1 )
        {
            System.out.print("   ");
        }
        if( a == 2)
        {
            System.out.print("   " + "     " );
        }
        if( a == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( a == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( a == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( a == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製1月份月曆
        //輸出結果
        for( i=1 ; i <= 31 ; i++ )
        {

            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }

        count = space + 1;
        System.out.println();//為了換行


        //印製2月份月曆
        //印出月曆抬頭
        System.out.println(year+"年2月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製2月份月曆
        //設定該年二月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製2月份月曆
        //判斷是否為閏年，為閏年的結果
        if(year % 400 == 0  || year % 4 == 0 || year % 100 != 0 )
        {
            //輸出結果
            for( i=1 ; i <= 29 ; i++ )
            {

                if(count % 7 == 1 )
                {
                    System.out.printf("\n%3d",i); //在這裡會換行
                }
                else if(count % 7 == 0)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 2)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 3)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 4)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 5)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 6)
                {
                    System.out.printf("%5d",i);
                }
                space = count % 7;
                count = count + 1 ;
            }
        }



        //印製2月份月曆
        //判斷是否為閏年，不為閏年的結果
        else
        {
            //輸出結果
            for( i=1 ; i <= 28 ; i++ )
            {

                if(count % 7 == 1 )
                {
                    System.out.printf("\n%3d",i); //在這裡會換行
                }
                else if(count % 7 == 0)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 2)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 3)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 4)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 5)
                {
                    System.out.printf("%5d",i);
                }
                else if(count % 7 == 6)
                {
                    System.out.printf("%5d",i);
                }
                space = count % 7;
                count = count + 1 ;
            }
        }

        count = space + 1;
        System.out.println();//為了換行


        //印製3月份月曆
        //印出月曆抬頭
        System.out.println(year+"年3月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製3月份月曆
        //設定該年三月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }
        //印製3月份月曆
        //輸出結果
        for( i=1 ; i <= 31 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }

        count = space + 1;
        System.out.println();//為了換行


        //印4月份月曆
        //印出月曆抬頭
        System.out.println(year+"年4月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" + "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製4月份月曆
        //設定該年四月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }
        //印製4月份月曆
        //輸出結果
        for( i=1 ; i <= 30 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }
        count = space + 1;
        System.out.println();//為了換行


        //印製5月份月曆
        //印出月曆抬頭
        System.out.println(year+"年5月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製5月份月曆
        //設定該年五月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製5月份月曆
        //輸出結果
        for( i=1 ; i <= 31 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }


        count = space + 1;
        System.out.println();//為了換行


        //印製6月份月曆
        //印出月曆抬頭
        System.out.println(year+"年6月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製6月份月曆
        //設定該年六月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }
        //印製6月份月曆
        //輸出結果
        for( i=1 ; i <= 30 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }

        count = space + 1;
        System.out.println();//為了換行


        //印製7月份月曆
        //印出月曆抬頭
        System.out.println(year+"年7月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製7月份月曆
        //設定該年七月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製7月份月曆
        //輸出結果
        for( i=1 ; i <= 31 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }

        count = space + 1;
        System.out.println(); //為了換行


        //印製8月份月曆
        //印出月曆抬頭
        System.out.println(year+"年8月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製8月份月曆
        //設定該年八月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製8月份月曆
        //輸出結果
        for( i=1 ; i <= 31 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1;
        }

        count = space + 1;
        System.out.println();//為了換行


        //印製9月份月曆
        //印出月曆抬頭
        System.out.println(year+"年9月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製9月份月曆
        //設定該年九月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製9月份月曆
        //輸出結果
        for( i=1 ; i <= 30 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i);
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }

        count = space + 1;
        System.out.println();//為了換行


        //印製10月份月曆
        //印出月曆抬頭
        System.out.println(year+"年10月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製10月份月曆
        //設定該年十月月曆是從星期幾開始          if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製10月份月曆
        //輸出結果
        for( i=1 ; i <= 31 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }

        count = space + 1;
        System.out.println(); //為了換行

        //印製11月份月曆
        //印出月曆抬頭
        System.out.println(year+"年11月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");
        //印製11月份月曆
        //設定該年十一月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製11月份月曆
        //輸出結果
        for( i=1 ; i <= 30 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }

        count = space + 1;
        System.out.println(); //為了換行

        //印製12月份月曆
        //印出月曆抬頭
        System.out.println(year+"年12月份");
        System.out.println("Sun" + "  " + "Mon" + "  " + "Tue" + "  " + "Wed" +
                "  " + "Thu" + "  " + "Fri" + "  " +"Sat");

        //印製12月份月曆
        //設定該年十二月月曆是從星期幾開始
        if( space == 1 )
        {
            System.out.print("   ");
        }
        if( space == 2)
        {
            System.out.print("   " + "     " );
        }
        if( space == 3)
        {
            System.out.print("   " + "     " + "     " );
        }
        if( space == 4)
        {
            System.out.print("   " + "     " + "     " + "     ");
        }
        if( space == 5)
        {
            System.out.print("   " + "     " + "     " + "     " + "     ");
        }
        if( space == 6)
        {
            System.out.print("   " + "     " + "     " + "     " + "     " + "     ");
        }

        //印製12月份月曆
        //輸出結果
        for( i=1 ; i <= 31 ; i++ )
        {
            if(count % 7 == 1 )
            {
                System.out.printf("\n%3d",i); //在這裡會換行
            }
            else if(count % 7 == 0)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 2)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 3)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 4)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 5)
            {
                System.out.printf("%5d",i);
            }
            else if(count % 7 == 6)
            {
                System.out.printf("%5d",i);
            }
            space = count % 7;
            count = count + 1 ;
        }
    }

}
