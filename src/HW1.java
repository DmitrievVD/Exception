import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        int[] myArr = new int[]{1, 2, 5, 6};

        int[] myArr2 = new int[]{5, 2, 1, 4, 3};

        String[][] strings = new String[][]{
                {"asd", "gdf", "hjy"},
                {"asd", "gdf", "hjy"}
        };

//        System.out.println(foo(4, 0));
//        System.out.println(getValue(myArr, 4));
//        stackOwerflow(1);


//        System.out.println(sum2d(strings));

        System.out.println(Arrays.toString(sumArreys(myArr,myArr2)));


    }

    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    private static int foo(int a, int b) { // ArithmeticException
        return a / b;
    }

    private static int getValue(int[] arr, int index) { // ArrayIndexOutOfBoundsException
        return arr[index];
    }

    private static void stackOwerflow(int num) { // StackOverflowError
        stackOwerflow(num + 1);
    }


    // Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]); // Тип данных другой мы передаем строку, а метод ждет фарат целочисленного цисла
                sum += val;
            }
        }
        return sum;
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен разности
    // элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.

    private static int[] sumArreys(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) throw new RuntimeException("Длины массивов не равны!!!");
        else {
            int[] newArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                newArr[i] = arr1[i] - arr2[i];
            }
            return newArr;
        }
    }




}
