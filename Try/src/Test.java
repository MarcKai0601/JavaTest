public class Test {
    public static void main(String[] args){
        int B = 12345;

        while (B > 0) {
            System.out.print((B % 10));
            System.out.println();
            B /= 10;
            System.out.print(B);
            System.out.println();
            //System.out.println(number);
        }


    }
}
