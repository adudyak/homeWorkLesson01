//1. Создать три переменные с типом данных int, double, String соответственно.
//        Присвоить значение только переменной с типом int. Запарсить её значение как строку и присвоить переменной с типом String.
//        Запарсить значение стринговой переменной как double и присвоить её в переменную с типом double.
//        Double присвоить обратно в int, Вывести в консоль значение каждой переменной.

package homework;

public class DataTypes {
    public static void main(String[] args) {
        int intA = 5;
        double doubleB;
        String stringC;

        stringC = String.valueOf(intA);
        doubleB = Double.parseDouble(stringC);
        intA = (int) doubleB;

        System.out.println("int: " + intA);
        System.out.println("double: " + doubleB);
        System.out.println("string: " + intA);



    }
}
