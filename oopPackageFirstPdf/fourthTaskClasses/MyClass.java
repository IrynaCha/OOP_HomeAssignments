package oopPackageFirstPdf.fourthTaskClasses;

/**
 * Created by Kurnosova Iryna on 20.11.2017.
 */

/**
 * 4) Программа с классом, есть 2 поля(символьное и целочисленное) и метод, которому передается объект того же класса. При вызове метода объекту, из которого вызывается метод, присваиваются значения полей объекта, переданного аргументом методу. У объекта, переданного аргументом методу, значения полей увеличиваются на единицу.
 */
public class MyClass {
    char symbol;
    int digit;

    MyClass() {
        digit = 7;
        symbol = 'F';
    }

    MyClass(char s, int d) {
        this.symbol = s;
        this.digit = d;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    @Override
    public String toString() {
        return "symbol is: " + symbol + " digigt is: " + digit;
    }

    void returnData(MyClass obj) {
        obj.digit += 1;
        obj.symbol += 1;
    }
}
