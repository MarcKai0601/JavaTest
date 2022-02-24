package Hanoi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TowerOfHanoi {

    //三個數組列表分別表示三根柱子，count表示調換次數,numberOfDisks表示盤子總數
    private   ArrayList<Integer> A = new ArrayList<>();
    private   ArrayList<Integer> B = new ArrayList<>();
    private   ArrayList<Integer> C = new ArrayList<>();
    private   PrintWriter output;
    private   int count = 0;
    private   int numberOfDisks =0;

    public static void main(String[] args) throws FileNotFoundException{

        for(int i=1;i<=5;i++) {
            //調用方法解決問題
            new TowerOfHanoi(i).moveDisks();
        }

    }

    public TowerOfHanoi(int n) throws FileNotFoundException {

        this.numberOfDisks = n;

        //在當前目錄新建TowerOfHanoi_n.txt用於存儲調換過程
        this.output = new PrintWriter(new File("TowerOfHanoi_"+n+".txt"));

        //初始化柱子
        for(int i=n;i>0;i--) {
            this.A.add(i);
        }

        //把初始狀態存入文件
        this.output.println("總盤子數目："+n);
        this.output.println("---------初始狀態---------");
        this.output.print("A: ");
        for(Integer i:this.A) this.output.print(i+" ");
        this.output.println();
        this.output.print("B: ");
        for(Integer i:this.B) this.output.print(i+" ");
        this.output.println();
        this.output.print("C: ");
        for(Integer i:this.C) this.output.print(i+" ");
        this.output.println();

    }


    public void moveDisks() {
        this.moveDisks(this.numberOfDisks,this.A,this.B,this.C);
        this.output.close();
        System.out.println("已完成調換");
    }

    public void moveDisks(int n, ArrayList<Integer> fromTower, ArrayList<Integer> toTower, ArrayList<Integer> auxTower) {
        if(n == 1) {
            move(fromTower,toTower); //當需要移動的盤子只有1個時，可以直接進行移動，而不需要遞歸

            //每一次調換均輸出當前A、B、C柱的情況到文件中做記錄
            this.output.println("--------第"+(++this.count)+"次調換--------");
            this.output.print("A: ");
            for(Integer i:this.A) this.output.print(i+" ");
            this.output.println();
            this.output.print("B: ");
            for(Integer i:this.B) this.output.print(i+" ");
            this.output.println();
            this.output.print("C: ");
            for(Integer i:this.C) this.output.print(i+" ");
            this.output.println();
            System.out.println("已完成第"+this.count+"次調換");

        }
        else {
            //把上面（n-1）個盤子當做一個整體，從fromTower移動到auxTower
            moveDisks(n-1,fromTower,auxTower,toTower);
            //把fromTower僅剩下的最大半徑的盤子移動到toTower（即只有一個盤子需要移動的情況）
            moveDisks(1,fromTower,toTower,auxTower);
            //把剛剛移動到C柱的（n-1）個盤子作爲整體從auxTower移動到toTower
            moveDisks(n-1,auxTower,toTower,fromTower);
        }

    }

    public static void move(ArrayList<Integer> fromTower, ArrayList<Integer> toTower) {
        //fromTower最大索引元素（即柱子最上面的盤子）的值添加到toTower，然後把這個元素從fromTower刪除，
        //通過這兩步模擬盤子的移動
        toTower.add(fromTower.get(fromTower.size()-1));
        fromTower.remove(fromTower.size()-1);

    }


}