public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        byte byteVar = 120;
        System.out.println("byte" + byteVar);
        short shortVar = 32000;
        System.out.println("short" + shortVar);
        int intVar = 2_000_000;
        System.out.println("int" + intVar);
        long longVar = 9_223_372_036_854_775_807L;
        System.out.println("long" + longVar);
        float floatVar = 3.14f;
        System.out.println("float" + floatVar);
        double doubleVar = 2.718281828459045;
        System.out.println("double" + doubleVar);

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

        short totalCans = 120;
        byte whitePerClass = 2, brownPerClass = 4;
        byte totalClasses = (byte) (totalCans / (whitePerClass + brownPerClass));
        short totalWhite = (short) (totalClasses * whitePerClass);
        short totalBrown = (short) (totalClasses * brownPerClass);
        System.out.println("В школе, где " + totalClasses + " классов, нужно "
                + totalWhite + " банок белой краски и "
                + totalBrown + " банок коричневой краски.");

        short bananaWeight = 80, milkWeightPer100ml = 105, iceCreamWeight = 100, eggWeight = 70;
        short bananas = 5, milkVolume = 200, iceCreamBricks = 2, eggs = 4;
        int totalBananaWeight = bananas * bananaWeight;
        int totalMilkWeight = (milkVolume / 100) * milkWeightPer100ml; // 200 мл → 2 * 105 г
        int totalIceCreamWeight = iceCreamBricks * iceCreamWeight;
        int totalEggWeight = eggs * eggWeight;
        int totalWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        float totalWeightKg = totalWeightGrams / 1000f;
        System.out.println("Общий вес спортзавтрака: " + totalWeightGrams + " грамм (" + totalWeightKg + " кг).");

        short weightToLose = 7000;
        short minLossPerDay = 250, maxLossPerDay = 500;
        short daysAtMinRate = (short) (weightToLose / minLossPerDay);
        short daysAtMaxRate = (short) (weightToLose / maxLossPerDay);
        float averageDays = (daysAtMinRate + daysAtMaxRate) / 2f;
        System.out.println("Если терять по " + minLossPerDay + " грамм в день, понадобится " + daysAtMinRate + " дней.");
        System.out.println("Если терять по " + maxLossPerDay + " грамм в день, понадобится " + daysAtMaxRate + " дней.");
        System.out.println("В среднем потребуется " + averageDays + " дней.");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;
        int annualIncomeMashaOld = salaryMasha * 12;
        int annualIncomeDenisOld = salaryDenis * 12;
        int annualIncomeKristinaOld = salaryKristina * 12;
        int annualIncomeMashaNew = (int) (newSalaryMasha * 12);
        int annualIncomeDenisNew = (int) (newSalaryDenis * 12);
        int annualIncomeKristinaNew = (int) (newSalaryKristina * 12);
        int differenceMasha = annualIncomeMashaNew - annualIncomeMashaOld;
        int differenceDenis = annualIncomeDenisNew - annualIncomeDenisOld;
        int differenceKristina = annualIncomeKristinaNew - annualIncomeKristinaOld;
        System.out.println("Маша теперь получает " + (int)newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + (int)newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + (int)newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
    }
}