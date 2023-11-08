package Apple;

import java.util.Scanner;

public class IvanApple {
    public static void main(String[] args) {
        Scanner Value = new Scanner(System.in);
        int i = Value.nextInt();


        if (i == 0 || i > 5 && i <= 100) {
            System.out.println("Иван хранит " + i + " яблок");
        }
        if (i == 1) {
            System.out.println("Иван хранит " + i + " яблоко");
        }
        if (i == 2 || i == 3 || i == 4) {
            System.out.println("Иван хранит " + i + " яблока");
        }
    }
}
