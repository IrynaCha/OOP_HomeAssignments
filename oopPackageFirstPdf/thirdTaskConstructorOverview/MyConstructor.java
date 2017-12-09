package oopPackageFirstPdf.thirdTaskConstructorOverview;

/**
 * Created by Kurnosova Iryna on 20.11.2017.
 */

/**
 * 3) Программа с классом, в котором есть 2 символьных поля и конструкторы, передают
 * 1) один символ(значения полей)
 * 2) два символа(значения полей)
 * 3) текст(значения полей - первая и последняя буква в тексте)
 */

class MyConstructor {
    private char symb;
    private char symbTwo;

    MyConstructor() {
        symb = 'g';
        symbTwo = '$';
    }

    MyConstructor(char s, char sTwo) {
        this.symb = s;
        this.symbTwo = sTwo;
    }

    MyConstructor setSymbol(char p) {
        this.symb = p;
        return MyConstructor.this;
    }

    MyConstructor setSymbol(char p, char q) {
        this.symb = p;
        this.symbTwo = q;
        return MyConstructor.this;
    }

    MyConstructor set(String str) {
        this.symb = str.charAt(0);
        this.symbTwo = str.charAt(str.length() - 1);
        return this;
    }

    void show() {
        System.out.println("First symbol is: " + symb + " second symbol is: " + symbTwo);
    }

    void show(String str) {
        System.out.println("The string is: " + str);
    }
}