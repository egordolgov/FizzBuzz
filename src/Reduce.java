public class Reduce {

    // Define the method outside the main method
    public static int method1(int n) {
        int counter = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
                counter++;
            } else {
                n = n - 1;
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int result = method1(10);
        System.out.println("Result: " + result);
    }
}


