package oopPackageFirstPdf.secondTask;

/**
 * Created by Kurnosova Iryna on 19.11.2017.
 */

/**
 * 2) Программа с классом - есть символьное поле. Класс имеет описание перегруженного метода для присваивания значений полю без аргументом, с символьным аргументом и с текстовым аргументом. По умолчанию - 'A', второй - переданный символ, третий - первая буква текста, кот. передан в качестве аргумента.
 */
public class Main {
    public static void main(String[] args) {
        OverloadingMethodClass obj = new OverloadingMethodClass();
        System.out.println(obj);
        obj.setSymbol('f');
        System.out.println(obj);
        obj.setSymbol("Lorem ipsum");
        System.out.println(obj);
    }
}
