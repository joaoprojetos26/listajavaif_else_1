import java.util.Scanner;

public class at_6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "numero elevado a quadrado: "+(num*num),
                "",
                javax.swing.JOptionPane.QUESTION_MESSAGE);

        sc.close();

    }
}
