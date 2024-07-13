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
        long cup = 123456789L;
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


    }
}