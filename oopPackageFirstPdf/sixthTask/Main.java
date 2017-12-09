package oopPackageFirstPdf.sixthTask;

/**
 * Created by Kurnosova Iryna on 21.11.2017.
 */

/**
 * 6) Программа с классом, есть символьное поле. В главном классе описать статический метод, который создаст объект соответствующего класса на основании символьного аргумента.
 */
public class Main {
    public static void myMethod(char s) {
        SixthCharClass charSymb = new SixthCharClass();
    }

    public static void main(String[] args) {
        Main.myMethod('s');
    }
}
