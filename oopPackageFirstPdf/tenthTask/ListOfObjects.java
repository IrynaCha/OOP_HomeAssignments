package oopPackageFirstPdf.tenthTask;

/**
 * Created by Kurnosova Iryna on 22.11.2017.
 */

/**
 * 10) Программа с классом - есть целочисленное поле и ссылка на объект того же класса.
 * Описать статический метод, кот. создает замкнутую цепочку объектов данного класса
 * (каждый объект ссылается на предыдущий, последний ссылается на первый).
 * Результат метода - ссылка на первый объект в цепочке.
 * Значения целочисленных полей объектов - ряд натуральных чисел.
 * Описать статический метод, которому передается объект данного класса.
 * Метод отображает значения целочисленных полей всех объектов в цепочке.
 */
public class ListOfObjects {
    private int digit;
    private ListOfObjects next;

    public ListOfObjects() {
        super();
    }

    public ListOfObjects(int digit, ListOfObjects next) {
        this.digit = digit;
        this.next = next;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public ListOfObjects getNext() {
        return next;
    }

    public void setNext(ListOfObjects next) {
        this.next = next;
    }

    static ListOfObjects createList(int n) {
        ListOfObjects objList = new ListOfObjects();
        objList.digit = 1;
        ListOfObjects value = objList;
        for (int i = 0; i < n; i++) {
            value.next = new ListOfObjects();
            value.next.digit = value.digit + 1;
            value = value.next;
        }
        value.next = null;
        return objList;
    }

    static void showList(ListOfObjects obj) {
        String txt = "";
        ListOfObjects newObj = obj;

        do {
            txt += newObj.digit + "\t";
            newObj = newObj.next;
        } while (newObj != null);
        System.out.println(txt);
    }
}