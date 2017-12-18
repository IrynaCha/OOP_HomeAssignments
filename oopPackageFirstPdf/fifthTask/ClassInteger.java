package oopPackageFirstPdf.fifthTask;

/**
 * Created by Kurnosova Iryna on 21.11.2017.
 */

/**
 * 5) Программа с двумя классами. У первого класса есть целочисленное поле. У второго - символьное. В первом классе есть метод, аргументом передается объект второго класса. При вызове этого метода полю объекта, из которого вызывается метод, значением присваивается код символа, являющегося значением поля объекта, переданного аргументом методу.
 */
public class ClassInteger {
    private int digit;

    ClassInteger() {
        digit = 65;
    }

    ClassInteger(int d) {
        this.digit = d;
    }

    void showSecondObject(ClassCharacter objS) {
        this.digit = (int) objS.getSymbol();
    }

    @Override
    public String toString() {
        return "Code of a digit is: " + digit;
    }
}
