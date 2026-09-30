import java.util.Scanner;

public class at_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome ");
        String nome = sc.nextLine();
        System.out.println("digite um numero");
        int num1 = sc.nextInt();
        System.out.println("digite um numero novamente");
        int num2 = sc.nextInt();
        System.out.println("nome digitado :"+nome);
        System.out.println("divisao dos numeros: "+num1/num2);
        sc.close();
    }
}
