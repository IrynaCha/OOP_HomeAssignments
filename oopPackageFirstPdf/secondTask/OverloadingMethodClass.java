package oopPackageFirstPdf.secondTask;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */
public class OverloadingMethodClass {
    private char symbol;

    OverloadingMethodClass() {
        symbol = 'A';
    }

    char getSymbol() {
        return symbol;
    }

    void setSymbol(char s) {
        this.symbol = s;
    }

    void setSymbol(String str) {
        this.symbol = str.charAt(0);
    }

    @Override
    public String toString() {
        return "Your symbol is: " + symbol;
    }
}