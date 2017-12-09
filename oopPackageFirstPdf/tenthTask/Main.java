package oopPackageFirstPdf.tenthTask;

/**
 * Created by Kurnosova Iryna on 22.11.2017.
 */

import static oopPackageFirstPdf.tenthTask.ListOfObjects.*;

/**
 * 10) Программа с классом - есть целочисленное поле и ссылка на объект того же класса.
 * Описать статический метод, кот. создает замкнутую цепочку объектов данного класса
 * (каждый объект ссылается на предыдущий, последний ссылается на первый).
 * Результат метода - ссылка на первый объект в цепочке.
 * Значения целочисленных полей объектов - ряд натуральных чисел.
 * Описать статический метод, которому передается объект данного класса.
 * Метод отображает значения целочисленных полей всех объектов в цепочке.
 */
public class Main {
    public static void main(String[] args) {
        ListOfObjects newObjTask = createList(19);
        showList(newObjTask);
    }
}
