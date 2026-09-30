import java.util.Scanner;

public class at_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = sc.nextInt();
        System.out.println("digite novamente");
        int num2 = sc.nextInt();
        System.out.println("digite novamente");
        int num3 = sc.nextInt();
        System.out.println("digite novamente");
        int num4 = sc.nextInt();
        System.out.println("digite novamente");
        int num5 = sc.nextInt();
        System.out.println("resultado final :" + ((num1 + num2 + num3 + num4) / num5));
        sc.close();
    }
}
