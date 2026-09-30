import java.util.Scanner;

public class at_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = sc.nextInt();
        System.out.println("digite novamente");
        int num2 = sc.nextInt();
        System.out.println("a subtraçao dos dois numeros e :"+(num1-num2));
        sc.close();
    }
}
