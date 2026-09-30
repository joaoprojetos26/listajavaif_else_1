import java.util.Scanner;

public class at_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma nota");
        double nota1 = sc.nextDouble();
        System.out.println("digie novamente");
        double nota2 = sc.nextDouble();
        System.out.println("media ponderada: "+((nota1*2)+(nota2*3)/5));
        sc.close();
    }
}
