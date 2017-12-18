package oopPackageFirstPdf.eighthTask;

/**
 * Created by Kurnosova Iryna on 22.11.2017.
 */

/**
 * 8) Напишите программу с классом, в котором есть целочисленный массив.
 * Описать перегруженный статический метод, кот. на основании объекта этого класса вернет копию массива (из данного объекта), а на основании переданного аргументом массива создает объект соответствующего класса.
 */
public class Main {
    public static void main(String[] args) {
        int[] arrMain = new int[5];

        System.out.println("***************");
        IntArrClass arrClass = new IntArrClass();
        IntArrClass.showArr(arrClass.getArr());
        System.out.println();
        arrMain = IntArrClass.returnMethod(arrClass);
        IntArrClass.showArr(arrMain);
    }
}
