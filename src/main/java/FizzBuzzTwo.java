public class FizzBuzzTwo {
    public static void getFizzBuzz(String str) {
        try {
            int n = Integer.parseInt(str);
            if (n <= 0) {
                System.out.println("Число должно быть больше 0");
            }
            for (int i = 1; i <= n; i++) {
                if (((i % 3) == 0) && ((i % 5) == 0))
                    System.out.println("FizzBuzz");
                else if ((i % 3) == 0)
                    System.out.println("Fizz");
                else if ((i % 5) == 0)
                    System.out.println("Buzz");
                else {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы вводите не корректное значение");
        }
    }
}
