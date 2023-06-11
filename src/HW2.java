import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) throws Exception {
//        System.out.println(request());

//    tusk2();
//        tusk3();
        System.out.println(tusk4());

    }

    // Задание 1
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float request(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");

        float number = 0;
        try {
            number = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("Вы ввели неправильное значение");
            request();
        }
        return number;
    }

    // Задание 2
    // Если необходимо, исправьте данный код
    public static void tusk2(){
        try {
            int d = 0;
            double catchedRes1 = (double) 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


    // Задание 3
    // Дан следующий код, исправьте его там, где требуется
    public static void tusk3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    // Задание 4
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static String tusk4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String result = scanner.nextLine();
        if (result.length() < 1) throw new RuntimeException("Строка пуская!!! Пустые строки вводить нельзя");
        return result;
    }

}
