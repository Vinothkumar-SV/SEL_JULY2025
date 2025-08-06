package week1.day2;

public class MethodExamples {
    // Method without return type and parameters
    public void greet() {
        System.out.println("Hello!");
    }

    // Method with parameters
    public void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with return type
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodExamples me = new MethodExamples();
        me.greet();
        me.printSum(5, 7);
        int result = me.multiply(3, 4);
        System.out.println("Multiplication: " + result);
    }
}
