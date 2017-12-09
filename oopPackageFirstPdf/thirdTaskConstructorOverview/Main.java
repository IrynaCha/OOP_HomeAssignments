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
public class Main {
    public static void main(String[] args) {
        MyConstructor obj = new MyConstructor();
        obj.show();                                 //default method
        obj.setSymbol('y');                         //first part
        obj.show();
        obj.setSymbol('r', '#');               //second part
        obj.show();
        obj.set("people love");                     //third part
        obj.show();
        obj.show("people love");                 //just to show the string from a previous task
    }
}
