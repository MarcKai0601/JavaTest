package ArrayWork;

import java.util.Scanner;

public class ArrayWork1 {

    //public double Score{}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        double Score[] = new double[input.nextInt()];//直接將輸入值放入空間的位置,Score分數
        char grades[] = new char[Score.length];//grades成绩

        System.out.print("Enter " + Score.length + " scores: ");
        for (int i = 0; i < Score.length; i++) {
            Score[i] = input.nextDouble();
        }

        getGrades(Score,grades);//使用getGrades方法

        for (int i = 0; i < Score.length; i++) {
            System.out.println("Student " + i + " score is " +
                    Score[i] + " and grade is " + grades[i]);
        }
    }
    //判斷分數最大值
    public static double Max(double[] array) { //因為判斷完的值要給main以外的方法使用,所以需要回傳
        Double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    //判斷評分
    public static void getGrades(double[] Score,char[] grades){
        double best = Max(Score);
        for (int i =0;i< Score.length;i++){
            if (Score[i] >= best - 10) {
                grades[i] = 'A';
            } else if (Score[i] >= best - 20) {
                grades[i] = 'B';
            } else if (Score[i] >= best - 30) {
                grades[i] = 'C';
            } else if (Score[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
}
