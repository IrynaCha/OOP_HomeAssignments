package oopPackageFirstPdf.fifthTask;

/**
 * Created by Kurnosova Iryna on 21.11.2017.
 */

/**
 * 5) Программа с двумя классами. У первого класса есть целочисленное поле. У второго - символьное. В первом классе есть метод, аргументом передается объект второго класса. При вызове этого метода полю объекта, из которого вызывается метод, значением присваивается код символа, являющегося значением поля объекта, переданного аргументом методу.
 */
public class Main {
    public static void main(String[] args) {
        ClassInteger intObj = new ClassInteger();
        ClassCharacter charObj = new ClassCharacter();
        intObj.showSecondObject(charObj);
        System.out.println(intObj);
    }
}
