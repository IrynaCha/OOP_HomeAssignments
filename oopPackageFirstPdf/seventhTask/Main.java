package oopPackageFirstPdf.seventhTask;

/**
 * Created by Kurnosova Iryna on 21.11.2017.
 */

/**
 * 7) Напишите программу с классом, в котором есть целочисленное поле.
 * В классе опишите перегруженный нестатический метод, который позволяет создавать копию объекта,
 * из которого метод вызывается (без аргументов).
 * Если метод вызывается с целочисленным аргументом, то переданное аргументом значение
 * присваивается полю объекта, из которого вызывается метод.
 * Значение поля создаваемого объекта определяется "старым" значение поля объекта, из которого вызывается метод.
 */
public class Main {
    public static void main(String[] args) {
        IntegerClass obj = new IntegerClass();
        obj.showResult();
        IntegerClass objTwin = new IntegerClass(5);
        objTwin.showResult();
        obj.copyObject(objTwin);
        obj.showResult();
    }
}
