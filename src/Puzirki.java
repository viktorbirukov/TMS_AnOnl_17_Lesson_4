import java.util.Arrays;

public class Puzirki {
    public static void main(String[] args) {
        int[] array = {9, 3, 5, -7, 1, 11};

        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
}