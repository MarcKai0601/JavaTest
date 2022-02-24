
import java.util.Scanner;

public class Almanac_Test {

        public static void main(String[] args) {    //main區段

            Scanner input = new Scanner(System.in);

            //獲得用戶輸入的年月數據
            System.out.print("請輸入年月(格式：年.月，如2019.9): ");
            String yearAndMonth = input.nextLine();     //  輸入字串宣告方式

            //把客戶輸入的數據分離出年與月，並且轉爲整數類型
            int year,month;
            year = Integer.parseInt(yearAndMonth.substring(0,yearAndMonth.indexOf('.')));
            month = Integer.parseInt(yearAndMonth.substring(yearAndMonth.indexOf('.')+1));
            //Integer.parseInt介紹在此url:https://vimsky.com/zh-tw/examples/usage/java-integer-parseint-method-01.html
            //用途主要為將輸入的String轉換為二進制

            //打印日曆的頭部
            printMonthTitle(year,month);
            //打印日曆的日期部分
            printMonthbody(year,month);
        }

        //打印日曆的頭部部分
        public static void printMonthTitle(int year, int month) {
            // TODO Auto-generated method stub
            String nameOfMonth = getNameOfMonth(month);
            System.out.printf("\n%13s-%-13d\n",nameOfMonth,year);
            for(int i=0;i<27;i++) System.out.print('=');
            System.out.println("\nMon Tue Wed Thu Fri Sat Sun");
        }

        //獲得某個月的英文名稱
        public static String getNameOfMonth(int month) {
            // TODO Auto-generated method stub
            String nameOfMonth="January";
            switch(month) {
                case 1: nameOfMonth = "January";break;
                case 2: nameOfMonth = "February";break;
                case 3: nameOfMonth = "March";break;
                case 4: nameOfMonth = "April";break;
                case 5: nameOfMonth = "May";break;
                case 6: nameOfMonth = "June";break;
                case 7: nameOfMonth = "July";break;
                case 8: nameOfMonth = "August";break;
                case 9: nameOfMonth = "September";break;
                case 10: nameOfMonth = "October";break;
                case 11: nameOfMonth = "November";break;
                case 12: nameOfMonth = "Decmber";break;
            }

            return nameOfMonth;
        }

        //輸出打印的月份日期部分
        public static void printMonthbody(int year, int month) {
            // TODO Auto-generated method stub
            int count=0;
            int firstDayOfMonth=getFirstDayOfMonth(year,month);
            int totalDayOfMonth=getTotalDayOfMonth(year,month);

            //打印1號之前的日曆空格
            for(int i=1;i<firstDayOfMonth;i++) {
                System.out.print("    ");
                count++;
            }
            //開始從1號開始打印，一直到整個月結束
            for(int day=1;day<=totalDayOfMonth;day++) {
                if(count==7) {
                    System.out.print("\n");
                    count = 0;
                }
                System.out.printf("%-4d",day);
                count++;
            }
        }

        //獲得某個月的總天數
        public static int getTotalDayOfMonth(int year, int month) {
            //返回各個月的天數
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                return 31;
            else if(month==4||month==6||month==9||month==11)
                return 30;
            else{
                if(isLeapYear(year)) return 29;
                else return 28;
            }
        }

        //算出某月第一天是星期幾
        public static int getFirstDayOfMonth(int year, int month) {
            // 返回某個月的第一天是星期幾,已知2019-1-1是週二
            int totalDayFrom2019_1_1=0,day=2;
            if(year>=2019) {
                //累加2019年到year之間的所有整年總天數
                if(year>2019) {
                    for(int i=2019;i<year;i++) {
                        if(isLeapYear(i)){
                            totalDayFrom2019_1_1 += 366;
                        }else {
                            totalDayFrom2019_1_1 += 365;
                        }
                    }
                }
                //累加該月份到該年1月的總天數
                for(int j=1;j<month;j++) {
                    totalDayFrom2019_1_1 += getTotalDayOfMonth(year,j);
                }
            }
            else {
                //累加2019年到year之間的所有整年總天數
                for(int i=year+1;i<2019;i++) {
                    if(isLeapYear(i)){
                        totalDayFrom2019_1_1 += 366;
                    }else {
                        totalDayFrom2019_1_1 += 365;
                    }
                }
                //累加該月份到該年12月的總天數
                for(int j=12;j>=month;j--) {
                    totalDayFrom2019_1_1 += getTotalDayOfMonth(year,j);  //意思同 sum = i + sum => sum += i(此為簡寫)
                }
            }

            //計算得到該月第一天星期幾，如果結果爲0即剛好被7整除，爲星期天
            if(year>=2019) {
                day = ((totalDayFrom2019_1_1%7)+day)%7;
            }else {
                day = (day-(totalDayFrom2019_1_1%7)+7)%7;
            }
            if(day==0) day=7;

            return day;
        }

        //計算某年是否爲閏年
        public static boolean isLeapYear(int year) {
            //判斷一個年份是否是閏年
            boolean leapYearOrNot=false;
            if ((year%4==0 && year%100!=0)||year%400==0) {
                leapYearOrNot=true;
            }
            else
                leapYearOrNot=false;
            return leapYearOrNot;
        }


}
