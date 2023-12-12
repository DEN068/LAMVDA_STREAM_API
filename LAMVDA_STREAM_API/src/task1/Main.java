package task1;

// Напишите программу, которая использует Stream API для обработки списка чисел.
// Программа должна вывести на экран среднее значение всех четных чисел в списке.

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создаем список чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Используем Stream API для вычисления среднего значения всех четных чисел в списке
        double averageOfEvenNumbers = numbers.stream()          // Преобразуем список в поток элементов
                .filter(n -> n % 2 == 0)                       // Фильтруем только четные числа
                .mapToDouble(n -> n)                            // Преобразуем Integer в double
                .average()                                      // Вычисляем среднее значение
                .orElse(0);                                     // Если среднее значение отсутствует, возвращаем 0

        System.out.println("Среднее значение всех четных чисел: " + averageOfEvenNumbers);
    }
}