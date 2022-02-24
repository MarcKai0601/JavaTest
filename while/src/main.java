public class main {
    public static void main(String[] args){
        while(true){
            int number =(int) (Math.random()*10);
            System.out.println(number);
            if(number==5)
                break;
        }
        System.out.println("i hit 5");
    }
}
