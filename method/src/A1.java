public class A1 {
    public static void main(String[] args) {
        A2 a = new A2();
        A2 b = new A2();
        A2 c = new A2();

        a.height = 1.7f;
        a.weight = 60.0f;


        System.out.println(a.bmi());
    }
}
