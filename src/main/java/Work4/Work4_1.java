package Work4;

public class Work4_1 {
    public static void main(String[] args) {
        int number = 5;
        String convertedNumber = Work4_1.convertNumber(number);
        System.out.println(convertedNumber);
    }
    public static String convertNumber (int number) {
        String result;
        {
            result = (number > 0) ? (number % 7 < 4) ? ("positive-m") : ("positive-p")
                    : (number == 0) ? ("zero")
                    : (number % 7 > -4) ? ("negative-n") : ("negative-p");
        }
        return result;
    }
}
