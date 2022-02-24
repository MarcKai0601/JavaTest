package Try1;
public class Main {
    public static void main(String[] args){
        Calculate aaa = new Calculate();
        Calculate bbb = new Calculate();

        aaa.name = "bootle";
        aaa.originalPrice = 10;
        aaa.setDiscount(-1);
        bbb.name = "cookie";
        bbb.originalPrice = 30;
        bbb.setDiscount(9);
        //ccc.name = "bootle";
        //ccc.price = 10;

        if(aaa.getPrice()<bbb.getPrice()){
        System.out.println("A is cheaper");
        }else{
        System.out.println("B is cheaper");
        }

        aaa.print();
        bbb.print();
        }
}
