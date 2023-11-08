package Apple;

import java.util.Scanner;

public class IvanApple {
    public static void main(String[] args) {
        Scanner Value = new Scanner(System.in);
        int digit = Value.nextInt();


        if (digit % 10 == 1 && digit % 100 != 11) {
            System.out.print(digit + " яблоко");
        } else if (digit % 10 >= 2 && digit % 10 <= 4 && (digit % 100 < 10 || digit % 100 >= 20)) {
            System.out.print(digit + " яблока");
        } else {
            System.out.print(digit + " яблок");
        }
    }
}