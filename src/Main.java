public class Main {
    public static void main(String[] args) {
        byte a = (byte) 5;
        short b = (short) 1000;
        int c = 134;
        long d = 123456789L;
        float e = 0.15f;
        double f = 0.156;
        char g = 'a';
        boolean isTrue = false;
        String text = "Hello!";
        System.out.println(calculation(1,2,3,4));
        System.out.println(isNumberInInterval(-1,19));
        positiveOrNegative(3);
        System.out.println(isNumberNegative(0));
        printHello("Игорь");
        leapYear(2020);
    }

    public static double calculation (double a, double b, double c, double d) {
        return (a * (b + (c / d)));
    }

    public static boolean isNumberInInterval (int a, int b) {
        return (a+b >= 10) && (a+b <= 20);
    }

    public static void positiveOrNegative (int a) {
        if (a >= 0) System.out.println("положительное число");
        else System.out.println("отрицательное число");
    }

    public static boolean isNumberNegative (int a) {
        return a < 0;
    }

    public static void printHello (String name) {
        System.out.println("Привет, " + name +"!");
    }

    public static void leapYear (int year) {
        if (((year % 4) != 0) || ((year % 100) == 0) && ((year % 400) !=0)) System.out.println("Невисокосный год");
        else System.out.println("Високосный год");
    }
}
