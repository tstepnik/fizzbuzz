import java.util.ArrayList;
import java.util.List;

public class Number {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i + 1);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0) {
                System.out.println(numbers.get(i) + " Fizz");
            }
            if (numbers.get(i) % 5 == 0) {
                System.out.println(numbers.get(i) + " Buzz");
            }
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                System.out.println(numbers.get(i) + " FizzBuzz");
            }
        }
    }
}
