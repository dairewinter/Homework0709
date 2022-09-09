import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int investments = 29_000;
        int accumulations = 0;
        while (accumulations < 2_439_000) {
            accumulations = accumulations + accumulations / 100;
            accumulations = accumulations + investments;
            System.out.println("Сумма накоплений в месяце равна " + accumulations);
        }

        //Task 2
        int i = 1;
        int b = 10;
        while (i < 11) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (b = 10; b > 0; b--) {
            System.out.print(b + " ");
            System.out.println();
        }

        //Task 3
        int population = 12_000_000;
        int birthrate = 17 * (population / 1000);
        int deathrate = 8 * (population / 1000);
        int populationIncrease = population + birthrate - deathrate;
        for (int yearNumber = 2022; yearNumber < 2033; yearNumber++) {
            populationIncrease = populationIncrease + (birthrate - deathrate);
            System.out.println("Год " + yearNumber + ", численность населения составляет " + populationIncrease);
        }

        //Task 4
        int depositAmmount = 15_000;
        int sevenPercents = (depositAmmount / 100) * 7;
        for (int monthNumber = 1; depositAmmount < 12_000_001; monthNumber++) {
            depositAmmount = depositAmmount + sevenPercents;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений - " + depositAmmount);

        }

        //Task 5
        int depositAmmounts = 15_000;
        int sevenPercent = (depositAmmounts / 100) * 7;
        for (int monthNumbers = 1; depositAmmounts < 12_000_001; monthNumbers++) {
            depositAmmounts = depositAmmounts + sevenPercent;
            if (monthNumbers % 6 == 0) {
                System.out.println("Месяц " + monthNumbers + ", сумма накоплений - " + depositAmmounts);
            }

        }

        //Task 6
        int VasiliyDepositAmmounts = 15_000;
        int VasiliySevenPercent = (VasiliyDepositAmmounts / 100) * 7;
        for (int monthNumbers = 1; monthNumbers < 109; monthNumbers++) {
            VasiliyDepositAmmounts = VasiliyDepositAmmounts + VasiliySevenPercent;
            if (monthNumbers % 6 == 0) {
                System.out.println("Месяц " + monthNumbers + ", сумма накоплений за полгода - " + VasiliyDepositAmmounts);
            }
        }

        //Task 7
        int friday = 5;
        int daysOfTheWeek = 7;
        for (int days = 5; days < 27; days += daysOfTheWeek) {
            {
                System.out.println("Сегодня пятница, " + days + " число, пора сдавать отчет!");
            }
        }

        //Task 8
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int year200 = year - 200;
        int year100 = year + 100;
        for (int years = 0; years <= year100; years += 79) {
            if (years > year200 && years < year100) ;
            System.out.println(years);
        }

        //Task 9
        for (int s=1; s<=10; s++){
            System.out.println("2 x "+ s + " = " + 2 * s);
        }
    }
}
