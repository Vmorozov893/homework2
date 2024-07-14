//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1\n");

        int apple = 123456;
        byte cat = 123;
        short dog = 12345;
        long cup = 123_456_789_123L;
        float literWater = 123.456F;
        double kilogramGold = 1234.4356789;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной dog с типом short равно " + dog);
        System.out.println("Значение переменной cup с типом long равно " + cup);
        System.out.println("Значение переменной literWater с типом float равно " + literWater);
        System.out.println("Значение переменной kilogramGold с типом double равно " + kilogramGold + "\n");

        System.out.println("Задание 2\n");

        float  foodCat = 27.12F;
        long allCat = 987678965549L;
        double vaccine = 2.786;
        short cat1 = 569;
        short mouse = -159;
        int cat2 = 27897;
        byte cat3 = 67;

        System.out.println("Задание 3\n");

        int paper = 480;
        byte student1 = 23 ;
        byte student2 = 27;
        byte student3 = 30;
        int student = student1 + student2 + student3;
        int paperEvery = paper / student;
        System.out.println("На каждого ученика рассчитано" + paperEvery + "листов бумаги\n");

        System.out.println("Задание 4\n");

        byte bottle1 = 16;
        byte time1 = 2;
        byte bottleMinute = (byte) (bottle1 / time1);
        short time2 = 20;
        short time3 = 24*60;
        short time4 = 3*24*60;
        int time5 = 30*24*60;
        short bottle2 = (short) (bottleMinute*time2);
        short bottle3 = (short) (bottleMinute*time3);
        int bottle4 = (bottleMinute*time4);
        int bottle5 = (bottleMinute*time5);
        System.out.println("За 20 минут машина произвела " + bottle2 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottle3 + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + bottle4 + " штук бутылок");
        System.out.println("За месяц (30 суток) машина произвела " + bottle5 + " штук бутылок\n");

        System.out.println("Задание 5\n");

        byte cansPaints = 120;
        byte cansWhite = 2;
        byte cansBrown = 4;
        byte classTotal = (byte) (cansPaints/(cansWhite+cansBrown));
        byte cansWhiteTotal =(byte) (classTotal*cansWhite);
        byte cansBrownTotal = (byte) (classTotal*cansBrown);
        System.out.println("В школе, где "+ classTotal +" классов, нужно "+ cansWhiteTotal +" банок белой краски и " + cansBrownTotal + " банок коричневой краски\n");

        System.out.println("Задание 6\n");

        int banana = 5*80;
        int milk = (200/100)*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int weightGram = banana + milk + iceCream + eggs;
        float weightKilogram = (float) weightGram / 1000;
        System.out.println("Вес такого завтрака " + weightGram + " грамм или " + weightKilogram + " килограмм.\n");

        System.out.println("Задание 7\n");

        int day1 = 7*1000/500;
        int day2 = 7*1000/250;
        int day3 = (day1+day2)/2;
        System.out.println("Если худеть на 500 грамм в день то потребуется " + day1 + " дней.");
        System.out.println("Если худеть на 250 грамм в день то потребуется " + day2 + " дней.");
        System.out.println("В среднем для похудения потребуется " + day3 + " дней.\n");

        System.out.println("Задание 8\n");

        int incomeMasha1 = 67760;
        int incomeDenis1 = 83690;
        int incomeKristina1 = 76230;
        int incomeMasha2 = (int) (incomeMasha1 * 1.1F);
        int incomeDenis2 = (int) (incomeDenis1 * 1.1F);
        int incomeKristina2 = (int) (incomeKristina1 * 1.1F);
        int yearIncomeMasha1 = incomeMasha1 * 12;
        int yearIncomeMasha2 = incomeMasha2 * 12;
        int yearIncomeDenis1 = incomeDenis1 * 12;
        int yearIncomeDenis2 = incomeDenis2 * 12;
        int yearIncomeKristina1 = incomeKristina1 * 12;
        int yearIncomeKristina2 = incomeKristina2 * 12;
        System.out.println("Маша теперь получает " + incomeMasha2 + " рубля. Годовой доход вырос на " + (yearIncomeMasha2 - yearIncomeMasha1) + " рублей");
        System.out.println("Денис теперь получает " + incomeDenis2 + " рублей. Годовой доход вырос на " + (yearIncomeDenis2 - yearIncomeDenis1) + " рублей");
        System.out.println("Кристина теперь получает " + incomeKristina2 + " рубля. Годовой доход вырос на " + (yearIncomeKristina2 - yearIncomeKristina1) + " рублей");

    }
}