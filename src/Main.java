import java.util.Random;
/*
1. Создать массив большого размера (миллион элементов).
2. Написать методы удаления, добавления, поиска элемента массива.
3. Заполнить массив случайными числами.
4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
*/

public class Main {

    private final static int SIZE = 1000; //Здесь можно поставить 10000000, но зачем так долго ждать?

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < SIZE; i++) {
            array.insert(rnd.nextInt());
        }
        long tmp = System.currentTimeMillis();
        array.selectionSort();
        System.out.println("Сортировка методом выбора: " + (System.currentTimeMillis() - tmp) + " мс");

        rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < SIZE; i++) {
            array.insert(rnd.nextInt());
        }
        tmp = System.currentTimeMillis();
        array.insertionSort();
        System.out.println("Сортировка методом вставки: " + (System.currentTimeMillis() - tmp) + " мс");
        rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < SIZE; i++) {
            array.insert(rnd.nextInt());
        }
        tmp = System.currentTimeMillis();
        array.bubbleSort();
        System.out.println("Пузырьковая сортировка: " + (System.currentTimeMillis() - tmp) + " мс");
    }
}  