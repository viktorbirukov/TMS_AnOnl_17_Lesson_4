import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMax_chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Размер массива должен быть целым числом.");
            return;
        }

        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом.");
            return;
        }

        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}