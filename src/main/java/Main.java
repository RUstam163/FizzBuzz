import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("какой метод расчета выберете? введите число от 1 до 3");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int method = 0;
        try {
            method = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("вы ввели не корректное значение :" + e);
        }
        System.out.println("Введите целое число больше 0");
        try {
            String str = br.readLine();
            switch (method) {
                case (1):
                    FizzBuzzOne.getFizzBuzz(str);
                    break;
                case (2):
                    FizzBuzzTwo.getFizzBuzz(str);
                    break;
                case (3):
                    FizzBuzzTree.getFizzBuzz(str);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
