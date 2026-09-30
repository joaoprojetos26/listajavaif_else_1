import java.util.Scanner;

public class at_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma nota");
        double nota1 =sc.nextDouble();
        System.out.println("digte novamente");
        double nota2 =sc.nextDouble();
        System.out.println("digite novamente");
        double nota3 =sc.nextDouble();
        System.out.println("digite novamente");
        double nota4 =sc.nextDouble();
        System.out.println("media das notas digitadas: "+((nota1+nota2+nota3+nota4)/4));
        sc.close();
    }
}
