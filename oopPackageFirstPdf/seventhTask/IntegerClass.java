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
public class IntegerClass {
    private int digit;

    IntegerClass() {
        digit = 1;
    }

    IntegerClass(int d) {
        this.digit = d;
    }

    IntegerClass setDigit(int number){
        this.digit = number;
        return this;
    }

    public IntegerClass copyObject(){
        return this;
    }

    public IntegerClass copyObject(IntegerClass other){

        this.digit = other.digit;
        return this;
    }
    void showResult(){
        System.out.println("Initial value is: " + digit);
    }
}