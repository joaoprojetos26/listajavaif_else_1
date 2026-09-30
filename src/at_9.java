import java.util.Scanner;

public class at_9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero por favor ");
        int num = sc.nextInt();
        System.out.println("seu dobro: "+(num*2));
        System.out.println("seu triplo: "+(num*3));
        sc.close();
    }
}
