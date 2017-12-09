package oopPackageFirstPdf.firstTask;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class FirstClass {
    String txt;
    char symbol;

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

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Text is: " + txt + " and symbol is: " + symbol;
    }
}