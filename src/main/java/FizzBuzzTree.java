import java.util.*;

public class FizzBuzzTree {
    public static void getFizzBuzz(String str) {
        try {
            int n = Integer.parseInt(str);
            if (n <= 0) {
                System.out.println("Число должно быть больше 0");
            }
            print(rec(new ArrayList<>(), n, n));
        } catch (NumberFormatException e) {
            System.out.println("Вы вводите не корректное значение");
        }
    }

    public static <T> void print(List<T> list) {
        Collections.reverse(list);
        list.forEach(System.out::println);
    }

    public static List<String> rec(List<String> list, Integer n, Integer index) {
        if (list.size() == index)
            return list;
        if (((n % 3) == 0) && ((n % 5) == 0))
            list.add("FizzBuzz");
        else if ((n % 3) == 0)
            list.add("Fizz");
        else if ((n % 5) == 0)
            list.add("Buzz");
        else {
            list.add(n.toString());
        }
        return rec(list, n - 1, index);
    }
}