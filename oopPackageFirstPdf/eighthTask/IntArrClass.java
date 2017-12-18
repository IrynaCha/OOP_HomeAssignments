package oopPackageFirstPdf.eighthTask;

/**
 * Created by Kurnosova Iryna on 22.11.2017.
 */

/**
 * 8) Напишите программу с классом, в котором есть целочисленный массив.
 * Описать перегруженный статический метод, кот. на основании объекта этого класса вернет копию массива (из данного объекта), а на основании переданного аргументом массива создает объект соответствующего класса.
 */
public class IntArrClass {
    private int[] arr = {1, 5, 7, 9, 99};

    public IntArrClass() {
        super();
    }

    public void setArr(int[] intArray) {
        this.arr = intArray;
    }

    public int[] getArr() {
        return arr;
    }

    public static int[] returnMethod(IntArrClass obj) {
        int[] iArr = new int[obj.arr.length];
        System.arraycopy(obj.arr, 0, iArr, 0, obj.arr.length);
        return iArr;
    }

    public static IntArrClass returnMethod(int[] arrB) {
        IntArrClass iArr = new IntArrClass();
        iArr.arr = arrB;
        return iArr;
    }

    public static void showArr(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + "\t");
        }
    }
}