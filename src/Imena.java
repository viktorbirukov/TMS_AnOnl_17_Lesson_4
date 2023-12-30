import java.util.Arrays;

public class Imena {
    public static void main(String[] args) {
        String[] array = {"Вася", "Ваня", "Вика", "Витя", "Вова"};
        Arrays.sort(array);
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}