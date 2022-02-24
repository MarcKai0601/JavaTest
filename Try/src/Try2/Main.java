package Try2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("ant");
        stringList.add("bear");
        stringList.add("cat");
        stringList.add("dog");

        // 一般使用for loop走訪的方法
        for (int i=0; i<stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        // 使用iterator走訪
        /**/Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }/*

        // 使用Enhanced for loop
        /*for (String s:stringList) {
            System.out.println(s);
        }*/

        // 使用Enhanced for loop走訪String array
        String[] sArray = new String[] {"ant", "beat", "cat", "dog"};
        for (String s:sArray) {
            System.out.println(s);
        }
    }
}
