package week1.day2;

public class StaticKeywordExamples {
    static int count = 0; // static variable

    public StaticKeywordExamples() {
        count++;
    }

    static void displayCount() { // static method
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        new StaticKeywordExamples();
        new StaticKeywordExamples();
        StaticKeywordExamples.displayCount();
    }
}
