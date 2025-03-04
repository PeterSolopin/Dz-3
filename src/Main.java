//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       System.out.println("Задача 1");
        int a = 90125;
        System.out.println("Значение переменной с типом int равно " + a);
        byte b = 100;
        System.out.println("Значение переменной с типом byte равно " + b);
        short c = 30000;
        System.out.println("Значение переменной с типом short равно " + c);
        long d = 30l;
        System.out.println("Значение переменной с типом long равно " + d);
        float e = 3.40f;
        System.out.println("Значение переменной с типом float равно " + e);
        double f = 10.15f;
        System.out.println("Значение переменной с типом double равно " + f);

        System.out.println("Задача 2");

        double type1 = 27.12;
        System.out.println("Значение переменной с типом double равно " + type1);
        long type2 = 987678965549L;
        System.out.println("Значение переменной с типом long равно " + type2);
        float type3 = 2.786f;
        System.out.println("Значение переменной с типом float равно " + type3);
        short type4 = 569;
        System.out.println("Значение переменной с типом short равно " + type4);
        int type5 = -159;
        System.out.println("Значение переменной с типом int равно " + type5);
        int type6 = 27897;
        System.out.println("Значение переменной с типом int равно " + type6);
        byte type7 = 67;
        System.out.println("Значение переменной с типом byte равно " + type7);

        System.out.println("Задача 3");

        int paper = 480;
        int pavlovna = 23;
        int sergeevna = 27;
        int andreevna = 30;
        int totalStudents = pavlovna + sergeevna + andreevna;
        int totalNumber = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + totalNumber + " листов бумаги");

        System.out.println("Задача 4");
        int bottleMakingMachinePerformance1 = 16;
        int bottleMakingMachinePerformance = 60;
        int day = 24;
        int month = 30;
        int per20Minutes = (bottleMakingMachinePerformance1 / 2) * 20;
        System.out.println("За 20 минут машина произвела " + per20Minutes + " штук бутылок");
        int bottlesDay = (bottleMakingMachinePerformance1 / 2) * bottleMakingMachinePerformance * day;
        System.out.println("За сутки машина произвела " + bottlesDay + " штук бутылок");
        int bottles3Days = bottlesDay * 3;
        System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок");
        int bottlesMonth = bottlesDay * month;
        System.out.println("За 1 месяц машина произвела " + bottlesMonth + " штук бутылок");

        System.out.println("Задача 5");
        byte cansOfPaint = 120;
        byte cansOfWhite = 2;
        byte cansOfBrown = 4;
        int classes = cansOfPaint /(cansOfWhite + cansOfBrown);
        int whitePaint = cansOfWhite * classes;
        int brownPaint = cansOfBrown * classes;
        System.out.println("В шокле, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски ");

        System.out.println("Задача 6");
        int banans = 5;
        int banansGrams = 80;
        int milk = 200;
        int milk100 = 105;
        int iceCream = 2;
        int iceCreamGrams = 100;
        int eggsCount = 4;
        int eggGrams = 70;
        int totalBanans = banans * banansGrams;
        int totalMilk = (milk / 100) * milk100;
        int totalCream = iceCream * iceCreamGrams;
        int totalEggs = eggsCount * eggGrams;
        int totalGrams = totalBanans + totalMilk + totalCream + totalEggs;
        double totalKilograms = totalGrams / 1000.0;
        System.out.println("Вес завтрака " + totalGrams + " грамм " + totalKilograms + " кг");

        System.out.println("Задача 7");
        int needToReset = 7000;
        short loseWeight = 250;
        short loseTwoPounds = 500;
        int daysMin = needToReset / loseWeight;
        int daysMax = needToReset / loseTwoPounds;
        int averageDays = ( daysMin + daysMax) / 2;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то на похудение уйдет " + daysMin + " дней");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то на похудение уйдет " + daysMax + " дней");
        System.out.println("В среднем может потребоваться " + averageDays + " дней для достижения результата");

        System.out.println("Задача 8");
        double mashaGets = 67760;
        double denisGets = 83690;
        double kristinaGets = 76230;
        double increaseSalary = 0.10;
        double mashaNewSalary = mashaGets * (1 + increaseSalary);
        double denisNewSalary = denisGets * (1 + increaseSalary);
        double kristinaNewSalary = kristinaGets * (1 + increaseSalary);
        double mashaAnnualOld = mashaGets * 12;
        double mashaAnnualNew = mashaNewSalary * 12;
        double denisAnnualOld = denisGets * 12;
        double denisAnnualNew = denisNewSalary * 12;
        double kristinaAnnualOld = kristinaGets * 12;
        double kristinaAnnualNew = kristinaNewSalary * 12;
        double mashaDifference = mashaAnnualNew - mashaAnnualOld;
        double denisDifference = denisAnnualNew - denisAnnualOld;
        double kristinaDifference = kristinaAnnualNew - kristinaAnnualOld;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. годовой доход вырос на " + kristinaDifference + " рублей");
    }
}