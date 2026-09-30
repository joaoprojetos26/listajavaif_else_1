import java.util.Scanner;

public class at_8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero por favor");
        int num=sc.nextInt();
        System.out.println("digite novamente");
        int num2=sc.nextInt();
        System.out.println("o resto da divisao dos numeros e :"+(num%num2));
        sc.close();
    }
}
