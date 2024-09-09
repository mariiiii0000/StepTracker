import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();

    StepTracker(Scanner scan){
        scanner = scan;

        for (int i = 0; i < monthToData.length; i ++ ){
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay(){
        System.out.println("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12){
            System.out.println("Введите номер дня (от 1 до 30 вкл): ");
            int dayNumber = scanner.nextInt();
            if (dayNumber >= 1 && dayNumber <= 30){
                System.out.println("Введите количество шагов: ");
                int stepNumber = scanner.nextInt();
                if (stepNumber > 0){
                    System.out.println("ура, все успешно ");
                    MonthData monthData = monthToData[monthNumber-1];
                    monthData.days[dayNumber - 1] += stepNumber;
                }

            }
        }else{
            System.out.println("Что-то не то((");
        }
    }
    int goalsBystepsPerDay = 10000;
    void changeStepGoal(){
        System.out.println("Введите новую цель: ");
        goalsBystepsPerDay = scanner.nextInt();
        if (goalsBystepsPerDay < 0) {
            System.out.println("Naaaahh");

        }
    }
    void printStatistic(){
        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();
        MonthData monthData = monthToData[month - 1];
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Сумма шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println("Максимальное количество шагов за месяц: " + monthData.maxStep());
        System.out.println("Сколько килокалорий было сожжено: " + converter.convertStepsToKilo(monthData.sumStepsFromMonth()));
        System.out.println("Пройденное количество шагов в км: " + converter.convertToKm(monthData.sumStepsFromMonth()));
        System.out.println("Лучшая серия: "+ monthData.bestSeries(goalsBystepsPerDay));
        System.out.println("Всё)) " );

    }

}




