package oopPackageFirstPdf.sixthTask;

/**
 * Created by Kurnosova Iryna on 21.11.2017.
 */

/**
 * 6) Программа с классом, есть символьное поле. В главном классе описать статический метод, который создаст объект соответствующего класса на основании символьного аргумента.
 */
public class SixthCharClass {
    private char symbol;

    SixthCharClass() {
        symbol = 'D';
    }

    SixthCharClass(char s) {
        this.symbol = s;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Symbol is" + symbol;
    }
}
