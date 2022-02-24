public class Product {
    public String name;
    public int originalPrice;
    private int discount;

    public Product(){
        name = "???";
        originalPrice = 0;
    }

    public  float getPrice(){
        return originalPrice * (discount / 10.0f);
    }
    public void setDiscount(int inputDiscount){
        if(inputDiscount >= 0 && inputDiscount <=10){
            discount = inputDiscount;
        }else{
            System.out.println("invalid discount!!!");
        }

    }

    public void print(){
        System.out.println("name:"+name+", price:"+originalPrice * (discount / 10.0f));
    }
}
