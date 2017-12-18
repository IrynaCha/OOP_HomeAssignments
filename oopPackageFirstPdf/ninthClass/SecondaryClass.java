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
public class SecondaryClass {
    private int digit;

    SecondaryClass() {
        digit = 1;
    }

    SecondaryClass(int num) {
        this.digit = num;
    }

    int getDigit(){
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }
}
