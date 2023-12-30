import java.util.Arrays;
import java.util.Scanner;

public class Udalenie_Chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {41, 42, 43, 43, 42, 41};
        System.out.print("Массив до удаления: ");
        System.out.println(Arrays.toString(array));

        System.out.print("\nВведите число, которое хотите удалить из массива: ");
        int target = scanner.nextInt();

        if (!searcher(array, target)) {
            System.out.println("Такого числа в массиве нет!");
        } else {
            removeElement(array, target);
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean searcher(int array[], int target) {
        for (int number : array) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }

    private static int[] removeElement(int array[], int target) {
        int number = 0;
        for (int readNumber = 0; readNumber < array.length; readNumber++) {
            if (array[readNumber] != target) {
                array[number++] = array[readNumber];
            }
        }
        while (number < array.length) {
            array[number++] = 0;
        }
        return array;
    }
}