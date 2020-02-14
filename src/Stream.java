import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {

        IntStream numbersStream = IntStream.iterate(0, x -> x + 1);
        List<Integer> numbers = numbersStream.limit(100)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> fizzbuzz = numbers.stream()
                .filter(x -> x%3 ==0)
                .peek(x -> System.out.println("fizz " + x))
                .filter(x -> x%5 ==0)
                .peek(x -> System.out.println("buzz " + x))
                .filter(x -> x%3==0 && x%5==0)
                .peek(x -> System.out.println("fizzbuzz " + x))
                .collect(Collectors.toList());

        fizzbuzz.forEach(x -> System.out.print(""));

//        java.util.stream.Stream<Integer> =
//        int[] numbers = (numbersStream.toArray());
//        List<int[]> ints = Arrays.asList(numbers);

    }
}
