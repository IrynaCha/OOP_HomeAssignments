package oopPackageFirstPdf.fourthTaskClasses;

/**
 * Created by Kurnosova Iryna on 20.11.2017.
 */

/**
 * 4) Программа с классом, есть 2 поля(символьное и целочисленное) и метод, которому передается объект того же класса. При вызове метода объекту, из которого вызывается метод, присваиваются значения полей объекта, переданного аргументом методу. У объекта, переданного аргументом методу, значения полей увеличиваются на единицу.
 */
public class Main {
    public static void main(String[] args) {
        MyClass objectFirst = new MyClass();
        System.out.println(objectFirst);

        objectFirst.returnData(objectFirst);
        System.out.println(objectFirst);
    }
}
