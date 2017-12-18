package oopPackageFirstPdf.fifthTask;

/**
 * Created by Kurnosova Iryna on 21.11.2017.
 */

/**
 * 5) Программа с двумя классами. У первого класса есть целочисленное поле. У второго - символьное. В первом классе есть метод, аргументом передается объект второго класса. При вызове этого метода полю объекта, из которого вызывается метод, значением присваивается код символа, являющегося значением поля объекта, переданного аргументом методу.
 */
public class ClassCharacter {
    private char symbol;

    ClassCharacter() {
        symbol = 'B';
    }

    ClassCharacter(char s) {
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
        return "ClassCharacter{" +
                "symbol=" + symbol +
                '}';
    }
}
