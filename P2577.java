import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        int a, b, c;
        int mul;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        mul = a * b * c;
        int[] count = new int[10];

        int i = 0;
        while (true) {
            count[mul % 10]++;
            mul /= 10;
            i++;

            if (mul == 0)
                break;
        }


        for (int l = 0; l < 10; l++)
            System.out.println(count[l]);


    }
}

