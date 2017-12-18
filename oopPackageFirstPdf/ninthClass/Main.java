package oopPackageFirstPdf.ninthClass;

/**
 * Created by Kurnosova Iryna on 22.11.2017.
 */

/**
 * 9) Программа с классом - есть целочисленное поле.
 * Создать массив таких объектов.
 * Поля объектов заполнить случайными числами.
 * Описать статический метод, который в массиве объектов находит объект с наибольшим значением поля и возвращает результатом текст с указанием индекса объекта и значением его поля.
 */
public class Main {
    static void returnValues(SecondaryClass[] obj) {
        int max = obj[0].getDigit();
        int index = 0;
        int value = 0;
        for (int i = 1; i < obj.length; i++) {
            if (obj[i].getDigit() >= max) {
                max = obj[i].getDigit();
                index = i;
                value = max;
            } else {
                continue;
            }
        }
        System.out.println("Index of a max digit is: " + index);
        System.out.println("Value of a max digit is: " + value);
    }

    public static void main(String[] args) {
        int k = 15;
        int d;
        int f = 10;
        SecondaryClass[] arr = new SecondaryClass[k];
        for (int i = 0; i < k; i++) {
            d = (int) (Math.random() * f + 1);
            arr[i] = new SecondaryClass();
            arr[i].setDigit(d);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getDigit() + "\t");
        }
        System.out.println();
        returnValues(arr);
    }
}
