public class Main {
    public static void main(String[] args) {

        int exampleOne = 356;
        System.out.println("Значение переменной exampleOne с типом int равно " + exampleOne );
        byte exampleTwo = 121;
        System.out.println("Значение переменной exampleTwo с типом byte равно " + exampleTwo);
        short exampleThree = 22222;
        System.out.println("Значение переменной exampleThree с типом short равно " + exampleThree);
        long exampleFour = 9825735121L;
        System.out.println("Значение переменной exampleFour с типом long равно " + exampleFour );
        float f = 1.53f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 35.6;
        System.out.println("Значение переменной d с типом double равно " + d);

        double dbl = 27.12;
        System.out.println(dbl);
        long exampleLong = 987678965549L;
        System.out.println(exampleLong);
        char c = 50;
        System.out.println(c);
        short sh = 786;
        System.out.println(sh);
        boolean isAdult = false;
        System.out.println(isAdult);
        int i = 569;
        System.out.println(i);
        float fl = -159.00f;
        System.out.println(fl);
        int iTwo = 27897;
        System.out.println(iTwo);
        byte b = 67;
        System.out.println(b);

        int LudPal = 23;
        int AnSer = 27;
        int EkAn = 30;
        int TotalNum = LudPal + AnSer + EkAn;
        int sheetsOfPaper = 480;
        int SheetsOneStud = sheetsOfPaper / TotalNum;
        System.out.println("На каждого ученика рассчитано " + SheetsOneStud + " листов бумаги");

        int BottlesInTwoMin = 16;
        int TwoMin = 2;
        int NumBottlesInOneMin = BottlesInTwoMin / TwoMin;
        int a1 = 20;
        int x1 = NumBottlesInOneMin * a1;
        System.out.println("За " + a1 + " минут машина произвела " + x1 + " бутылок!");
        int a2 = TwoMin / 2 * 60 * 24;
        int x2 = NumBottlesInOneMin * a2;
        System.out.println("За сутки машина произвела " + x2 + " бутылок");
        int a3 = a2 * 3;
        int x3 = NumBottlesInOneMin * a3;
        System.out.println("За 3 дня машина произвела " + x3 + " бутылок");
        int a4 = a2 * 30;
        int x4 = NumBottlesInOneMin * a4;
        System.out.println("За месяц машина произвела " + x4 + " бутылок");

        int TotalNumberOfCans = 120;
        int WhitePaintForOneClass = 2;
        int BrownPaintForOneClass = 4;
        int TotalPaintForOneClass = WhitePaintForOneClass + BrownPaintForOneClass;
        int NumberOfClasses = TotalNumberOfCans / TotalPaintForOneClass;
        System.out.println("Количество классов в школе - " + NumberOfClasses);
        int TotalCansOfWhitePaint = WhitePaintForOneClass * NumberOfClasses;
        int TotalCansOfBrownPaint = BrownPaintForOneClass * NumberOfClasses;
        System.out.println("В школе, где " + NumberOfClasses + " классов, нужно " + TotalCansOfWhitePaint + " банок белой краски и " + TotalCansOfBrownPaint + " банок коричневой краски");

        int Bananas = 5;
        int WeightOneBanana = 80;
        int TotalWeightOfBananas = WeightOneBanana * Bananas;
        int MilkMl = 200;
        int Weight100MlOfMilk = 105;
        double TotalWeightOfMilk = Weight100MlOfMilk / 100.0 * MilkMl;
        int IceCream = 2;
        int WeightOfOneIceCream = 100;
        int TotalWeightOfIceCream = WeightOfOneIceCream * IceCream;
        int Eggs = 4;
        int WeightOneEgg = 70;
        int TotalWeightOfEggs = WeightOneEgg * Eggs;
        double BreakfastWeightInGrams = TotalWeightOfBananas + TotalWeightOfMilk + TotalWeightOfIceCream + TotalWeightOfEggs;
        double BreakFastWeightInKilograms = BreakfastWeightInGrams / 1000.0;
        System.out.println("Вес спорт-завтрака в граммах - " + BreakfastWeightInGrams + " граммов, а в килограммах - " + BreakFastWeightInKilograms + " кг");

        int NeedToResetInKg = 7;
        int NeedToResetInGr = NeedToResetInKg * 1000;
        int DaysOfDietForWeightLoss250gPerDay = NeedToResetInGr / 250;
        int DaysOfDietForWeightLoss500gPerDay = NeedToResetInGr / 500;
        int AverageValue = (DaysOfDietForWeightLoss500gPerDay + DaysOfDietForWeightLoss250gPerDay) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250г, то на похудение уйдет " + DaysOfDietForWeightLoss250gPerDay + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500г, то на похудение уйдет " + DaysOfDietForWeightLoss500gPerDay + " дней");
        System.out.println("В среднем, чтобы добиться результата похудения, может потребоваться " + AverageValue + " день");



    }
}