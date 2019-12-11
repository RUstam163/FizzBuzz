import java.util.stream.IntStream;

public class FizzBuzzOne {
    public static void getFizzBuzz(String str) {
        try {
            int n = Integer.parseInt(str);
            if (n <= 0) {
                System.out.println("Число должно быть больше 0");
            }
            IntStream.rangeClosed(1, n)
                    .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                    .forEach(System.out::println);
        } catch (NumberFormatException e) {
            System.out.println("Вы вводите не корректное значение");
        }
    }
}
