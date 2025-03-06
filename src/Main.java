public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        byte smallNumber = 120;
        short mediumNumber = 32000;
        int largeNumber = 2_000_000;
        long veryLargeNumber = 9_223_372_036_854_775_807L;
        float piApproximation = 3.14f;
        double eApproximation = 2.718281828459045;

        System.out.println("Значение smallNumber с типом byte равно " + smallNumber);
        System.out.println("Значение mediumNumber с типом short равно " + mediumNumber);
        System.out.println("Значение largeNumber с типом int равно " + largeNumber);
        System.out.println("Значение veryLargeNumber с типом long равно " + veryLargeNumber);
        System.out.println("Значение piApproximation с типом float равно " + piApproximation);
        System.out.println("Значение eApproximation с типом double равно " + eApproximation);

        float VarFloat= 27.12f;
        long Varlong = 987_678_965_549L;
        double VarDouble = 2.786;
        short VarShort = 569;
        short shortVarNegative = -159;
        int VarInt = 27897;
        byte byteVarPositive = 67;
        System.out.println("floatVar: " + VarFloat + "\n" + "longVar: " + Varlong + "\n" +
                "doubleVar: " +VarDouble + "\n" + "shortVar: " + VarShort + "\n" +
                "shortVarNegative: " + shortVarNegative + "\n" + "intVar: " + VarInt + "\n" +
                "byteVarPositive: " + byteVarPositive);

        byte  studentsLudmila = 23;
        byte  studentsAnna = 27;
        byte studentsEkaterina = 30;
        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        short totalSheets = 480;
        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("Общее количество учеников: " + totalStudents + ", общее количество бумаги: "
                + totalSheets + ", на каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");

        short bottlesPerTwoMinutes = 16;
        byte bottlesPerMinute = (byte) (bottlesPerTwoMinutes / 2);
        short bottlesPer20Minutes = (short) (bottlesPerMinute * 20);
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок.\n" +
                "За сутки машина произвела " + bottlesPerDay + " штук бутылок.\n" +
                "За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок.\n" +
                "За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок.");

        short totalPaintCans = 120;
        byte whiteCansPerClass = 2, brownCansPerClass = 4;
        byte totalClasses = (byte) (totalPaintCans / (whiteCansPerClass + brownCansPerClass));
        short totalWhiteCans = (short) (totalClasses * whiteCansPerClass);
        short totalBrownCans = (short) (totalClasses * brownCansPerClass);

        System.out.println("В школе, где " + totalClasses + " классов, нужно "
                + totalWhiteCans + " банок белой краски и "
                + totalBrownCans + " банок коричневой краски.");

        short bananaWeight = 80, milkWeightPer100ml = 105, iceCreamWeight = 100, eggWeight = 70;
        short bananaCount = 5, milkVolume = 200, iceCreamBricks = 2, eggCount = 4;
        int totalBreakfastWeightGrams = bananaCount * bananaWeight +
                (milkVolume / 100) * milkWeightPer100ml +
                iceCreamBricks * iceCreamWeight +
                eggCount * eggWeight;
        float totalBreakfastWeightKg = totalBreakfastWeightGrams / 1000f;

        System.out.println("Общий вес спортзавтрака: " + totalBreakfastWeightGrams + " грамм (" + totalBreakfastWeightKg + " кг).");

        short weightToLoseGrams = 7000;
        short minDailyLoss = 250, maxDailyLoss = 500;
        short daysAtMinRate = (short) (weightToLoseGrams / minDailyLoss);
        short daysAtMaxRate = (short) (weightToLoseGrams / maxDailyLoss);
        float averageDaysToLoseWeight = (daysAtMinRate + daysAtMaxRate) / 2f;

        System.out.println("Если терять по " + minDailyLoss + " грамм в день, понадобится " + daysAtMinRate + " дней.");
        System.out.println("Если терять по " + maxDailyLoss + " грамм в день, понадобится " + daysAtMaxRate + " дней.");
        System.out.println("В среднем потребуется " + averageDaysToLoseWeight + " дней.");

        int salaryMasha = 67760, salaryDenis = 83690, salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;
        int annualIncomeMashaNew = (int) (newSalaryMasha * 12);
        int annualIncomeDenisNew = (int) (newSalaryDenis * 12);
        int annualIncomeKristinaNew = (int) (newSalaryKristina * 12);
        int differenceMasha = annualIncomeMashaNew - (salaryMasha * 12);
        int differenceDenis = annualIncomeDenisNew - (salaryDenis * 12);
        int differenceKristina = annualIncomeKristinaNew - (salaryKristina * 12);

        System.out.println("Маша теперь получает " + (int)newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + (int)newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + (int)newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
    }
}