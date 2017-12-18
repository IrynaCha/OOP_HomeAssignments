package oopPackageFirstPdf.firstTask;
/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */

/**
 * 1) Программа с классом - есть 2 поля(текст+символ), методы присваивания значений полям и метод вывода значений в консоль.
 */
public class Main {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        firstClass.setTxt("Sth_v");
        firstClass.setSymbol('k');
        System.out.println(firstClass);
    }
}
