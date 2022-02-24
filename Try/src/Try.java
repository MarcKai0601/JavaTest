import java.util.*;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int na = scanner.nextInt();
        int nb = scanner.nextInt();
        int[] aa = new int[na];
        int[] bb = new int[nb];
        int i = 0;
        while (scanner.hasNext()) {
            aa[i++] = scanner.nextInt();
            if (i == aa.length) {
                break;
            }
        }
        i = 0;
        while (scanner.hasNext()) {
            bb[i++] = scanner.nextInt();
            if (i == bb.length) {
                break;
            }
        }

        for (int j = 0; j < aa.length; j++) {
            System.out.print(aa[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < bb.length; j++) {
            System.out.print(bb[j] + " ");
        }
    }
}
