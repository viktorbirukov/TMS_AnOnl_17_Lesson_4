import java.util.Arrays;
import java.util.Scanner;

public class n_chisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (от 6 до 10 включительно): ");
        int size;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("от 6 до 10... Повторите ввод!");
                scanner.next();
            }
            size = scanner.nextInt();
            if (size < 6 || size > 10) {
                System.out.println("от 6 до 10... Повторите ввод!");
            }
        } while (size < 6 || size > 10);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Четных элементов нет");
        } else {
            int[] arrayOfEven = new int[count];
            for (int j = 0, readNumber = 0; readNumber < array.length; readNumber++) {
                if (array[readNumber] % 2 == 0) {
                    arrayOfEven[j++] = array[readNumber];
                }
            }
            System.out.println(Arrays.toString(arrayOfEven));
        }
    }
}