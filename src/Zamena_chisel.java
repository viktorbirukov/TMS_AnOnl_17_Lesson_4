import java.util.Arrays;

public class Zamena_chisel {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, -7, -9, 11, 12, 13};
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Элементы с нечетным индексом заменены на 0: " + Arrays.toString(array));
    }
}