public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i++;
            System.out.println(" месяц " + i + " cумма накоплений равна " + total + " рублей");
        }
        System.out.println(" Задание 2 ");
        int c = 1;
        while (c <= 10) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println();
        for (int d = 10; d > 0; d--) {
            System.out.print(d + " ");
        }
        System.out.println(" Задание 3 ");
        int population = 12_000_000;
        float death = (float) 8 / 1000;
        float birth = (float) 17 / 1000;
        for (int a = 1; a < 11; a++) {
            population = population + Math.round(population * birth) - Math.round(population * death);
            System.out.println(" Год " + a + " население " + population);
        }
        System.out.println(" Задание 2.1 ");
        int money = 15_000;
        int month = 1;
        while (money <= 12_000_000) {
            money += money * 0.07;
            System.out.println(" Месяц " + month + " Сумма накоплений равна " + money + " Руб ");
            month++;
        }
        System.out.println(" Задание 2.2 ");
        int money1 = 15_000;
        int month1 = 1;
        for (; money1 <= 12_000_000; month1++) {
            money1 += money1 * 0.07;
            if (month1 % 6 == 0) {
                System.out.println(" Месяц " + month1 + " Сумма накоплений равна " + money1 + " Руб ");
            }
        }
        System.out.println(" Задание 2.3 ");
        int money2 = 15_000;
        int month2 = 1;
        for (; month2 <= 54; month2++) {
            money2 += money2 * 0.07;
            if (month2 % 6 == 0) {
                System.out.println(" Месяц " + month2 + " Сумма накоплений равна " + money2 + " Руб ");
            }
        }
        System.out.println(" Задание 2.4 ");
        int endOfTheMonth = 31;
        int friday = 5;
        while (friday <= endOfTheMonth) {
            System.out.println(" Сегодня пятница " + friday + " -е число. Необходимо подготовить отчет ");
            friday += 7;
        }
        System.out.println(" Задание 3.1 ");
        int nextYear = 0;
        int currentYear = 2022;
        int previousYear = (currentYear - 200);
        for (int year = 0; year <= nextYear; year += 79) {
            nextYear = currentYear + 100;
            if ( previousYear < year && year <= nextYear) {
                System.out.println(year);
            }
        }
            System.out.println(" Задание 3.2 ");
            for (int a = 1; a <= 10; a++) {
                for (int j = 2; j <= 2; j++) {
                    System.out.print(j + " * " + a + " = " + (a * j) + " ");
                }
                System.out.println();
            }
        }
    }