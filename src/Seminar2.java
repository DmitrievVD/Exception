import java.util.InputMismatchException;
import java.util.Scanner;

public class Seminar2 {
    public static void main(String[] args) {
        run();
    }
    private static void run(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива в который хотите записать значение 1: ");
        try {
            int index = scanner.nextInt();
            arr[index] = 1;
        } catch (IndexOutOfBoundsException e){
            System.err.println("Указан индекс за пределами массива!");
        }catch (InputMismatchException e){
            System.err.println(e.getMessage() + " Не строка!");
        }
    }

}
