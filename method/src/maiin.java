public class maiin {
    public static void main(String[] args){

        initData(100,10);
        initData(3.14,2.9);
    }

    public static void initData(int x, int y){
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }

    private static void initData(double x, double y){
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
