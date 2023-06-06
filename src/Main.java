import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int limit = 10;

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 3, 5, 8};
//
//        System.out.println(geLinght(arr, 4));

//        int[][] arr2 = new int[][]{
//                {1,0,1,1,0},
//                {0,1,0,1,1},
//                {1,0,0,1,0},
//                {0,1,0,1,1},
//                {1,1,1,1,0}
//        };
//
//        System.out.println(sum(arr2));


        Integer[] arr = {0, 5, 54, null, 1, 4};
        checkArrey(arr);
    }

    private static int geLinght(int[] arrey, int limit) {
        if (arrey.length < limit) return -1;
        else return arrey.length;
    }

    private static int getIndex(int[] arrey, int num) {
        if (arrey == null) return -3;
        else if (arrey.length < limit) return -1;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] == num) return i;
        }
        System.out.println("Искомый элемент не найден!!!");
        return -2;
    }

    private static int sum(int[][] arrey){
        if (isNotSquareArrey(arrey)) throw new RuntimeException("Массив должен быть квадратным!");
        if (isNotArgsCorrect(arrey)) throw new RuntimeException("В массиве должны быть только 0 и 1");
        int result = 0;
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey.length; j++) {
                result += arrey[i][j];
            }
        }
        return result;
    }
    private static boolean isNotSquareArrey(int[][] arrey){
        for (int[] elum: arrey) {
            if (elum.length != arrey.length) return true;
        }
        return false;
    }
    private static boolean isNotArgsCorrect(int[][] arrey){
        List<Integer> list = List.of(0,1);
        for (int i = 0; i < arrey.length; i++) {
            for (int j = 0; j < arrey.length; j++) {
                if (!list.contains(arrey[i][j])) return true;
            }
        }
        return false;
    }

    private static void checkArrey(Integer[] arrey){
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] == null) System.out.println("Есть значение null в " + i + " индексе");
        }
    }
}