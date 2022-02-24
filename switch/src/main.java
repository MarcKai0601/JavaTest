public class main {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        //long startTime = System.currentTimeMillis();

        String strVal = "999";
        switch (strVal){
            case "1":
                System.out.println(strVal);
                break;
            case "2":
                System.out.println(strVal);
                break;
            case "3":
                System.out.println(strVal);
                break;
            case "4":
                System.out.println(strVal);
                break;
            case "5":
                System.out.println(strVal);
                break;
            case "6":
                System.out.println(strVal);
                break;
            case "7":
                System.out.println(strVal);
                break;
            case "8":
                System.out.println(strVal);
                break;
            case "9":
                System.out.println(strVal);
                break;
            default:
                System.out.println(strVal);
                break;
        }
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);
    }
}
