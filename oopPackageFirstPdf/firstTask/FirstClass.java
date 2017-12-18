package oopPackageFirstPdf.firstTask;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class FirstClass {
    private String txt;
    private char symbol;

    FirstClass() {
        this.txt = "Lorem ipsum";
        this.symbol = 't';
    }

    FirstClass(String str, char sym) {
        this.txt = str;
        this.symbol = sym;
    }

    public String getTxt() {
        return txt;
    }

    private void setTxt(String txt) {
        this.txt = txt;
    }

    public char getSymbol() {
        return symbol;
    }

    private void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Text is: " + txt + " and symbol is: " + symbol;
    }
}