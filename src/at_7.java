import java.util.Scanner;

public class at_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero por favor");
        int num = sc.nextInt();
        System.out.println("antecessor do numero digitado: "+(num-1));
        System.out.println("o sucessor do numero: "+(num+1));
        sc.close();
    }
}
