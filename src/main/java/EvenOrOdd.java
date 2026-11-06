public class EvenOrOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String check(int number) {
        return isEven(number) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println(number + " is " + check(number));
    }
}
