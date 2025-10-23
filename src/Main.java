//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numberOne = 2147483647;
        byte numberTwo = 127;
        short numberThree = 32767;
        long numberFour = 9223372036854775807L;
        float numberFive = 4.5353f;
        double numberSix = 4.3223867238967;
        System.out.println("Задача 1:");
        System.out.println("Целочисленные переменные:");
        System.out.println("Значение переменной с типом int = " + numberOne + "; Значение переменной c типом byte = " + numberTwo + "; Значение переменной с типом short = " + numberThree + "; Значение переменной с типом long = " + numberFour + ";");
        System.out.println("Значения с плавающей точкой:");
        System.out.println("Значение переменной с типом float = " + numberFive + "; Значение переменной с типом dooble = " + numberSix + ";");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short totalQuantity = 480;
        int quantityStudents = teacher1 + teacher2 + teacher3;
        int quantitySheets = totalQuantity / quantityStudents;
        System.out.println("Задача 3:");
        System.out.println("На каждого ученика рассчитано по " + quantitySheets + " листов бумаги");

        byte productivity1 = 20;
        short productivity2 = 1440;
        short productivity3 = 4320;
        int productivity4 = 43200;
        byte minuteProductivity = 16/2;
        int result1 = minuteProductivity * productivity1;
        int result2 = minuteProductivity * productivity2;
        int result3 = minuteProductivity * productivity3;
        int result4 = minuteProductivity * productivity4;
        System.out.println("Задача 4:");
        System.out.println("За " + productivity1 + " минут машина произвела " + result1 + " штук бутылок");
        System.out.println("За " + productivity2 + " минут машина произвела " + result2 + " штук бутылок");
        System.out.println("За " + productivity3 + " минут машина произвела " + result3 + " штук бутылок");
        System.out.println("За " + productivity4 + " минут машина произвела " + result4 + " штук бутылок");

        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int paintConsumption = whitePaint + brownPaint;
        int quantityClass = totalPaint / paintConsumption;
        int quantityWhitePaint = quantityClass * whitePaint;
        int quantityBrownPaint = quantityClass * brownPaint;
        System.out.println("Задача 5:");
        System.out.println("В школе, где " + quantityClass + " классов, нужно " + quantityWhitePaint + " банок белой краски и " + quantityBrownPaint + " банок коричневой краски");

        byte bananMass = 80;
        byte bananaQuantity = 5;
        byte milkMass = 105;
        byte milkQuantity = 2;
        byte iceCreamMass = 100;
        byte iceCreamQuantity = 2;
        byte eggMass = 70;
        byte eggQuantity = 4;
        int totalMass1 = bananMass * bananaQuantity + milkMass * milkQuantity + iceCreamMass * iceCreamQuantity + eggMass * eggQuantity;
        float totalMass2 = totalMass1 / 1000f;
        System.out.println("Задача 6:");
        System.out.println("Коктейль весит " + totalMass1 + " граммов");
        System.out.println("Коктейль весит " + totalMass2 + " кг");

        short mass1 = 250;
        short mass2 = 500;
        short summMass = 7000;
        int quantityDays1 = summMass / mass1;
        int quantityDays2 = summMass / mass2;
        int quantityDays3 = (quantityDays1 + quantityDays2) / 2;
        System.out.println("Задача 7:");
        System.out.println("Нужно " + quantityDays1 + " дней, если скидывать по 250 грамм в день");
        System.out.println("Нужно " + quantityDays2 + " дней, если скидывать по 500 грамм в день");
        System.out.println(quantityDays3 + " дней средний результат");

        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        float masha2 = masha * 1.1f;
        float denis2 = denis * 1.1f;
        float christina2 = christina * 1.1f;
        float masha3 = masha2 - masha;
        float denis3 = denis2 - denis;
        float christina3 = christina2 - christina;
        System.out.println("Задача 8:");
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + masha3 + " рублей");
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + denis3 + " рублей");
        System.out.println("Кристина теперь получает " + christina2 + " рублей. Годовой доход вырос на " + christina3 + " рублей");

    }
}
