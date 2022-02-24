package Caculater;

import java.util.*;

public class Main {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        //float number = scanner.nextFloat();
        //float number1 = scanner.nextFloat();

        /*while(true){

            float number1 = scanner.nextFloat();
            //float number2 = scanner.nextFloat();
            String caculate = scanner.next();
            float number2 = scanner.nextFloat();

            switch(caculate){
                case "+":
                    System.out.println(number1 + number2);
                    //number1 = number1 + number2;
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    //number1 = number1 - number2;
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    //number1 = number1 * number2;
                    break;
                case "/":
                    System.out.println(number1 / number2);
                    //number1 = number1 / number2;
                    break;
                default:
                    break;
            }*/


        do {
                System.out.println("input first number:");
                float number1 = scanner.nextFloat();
                System.out.println("input Operator" );
                String caculate = scanner.next();
                System.out.println("input second number:");
                float number2 = scanner.nextFloat();
            switch(caculate){

                case "+":
                    System.out.println(number1 + number2);
                    //number1 = number1 + number2;
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    //number1 = number1 - number2;
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    //number1 = number1 * number2;
                    break;
                case "/":
                    System.out.println(number1 / number2);
                    //number1 = number1 / number2;
                    break;
                default:
                    break;
            }
                i = scanner.nextInt();

            }while (i == 1);

        }


}
