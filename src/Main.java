import java.util.Scanner;

// Green
// Очень здорово, что ни в одном классе нет лишних импортов
// или лишних комментариев, молодец!

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker(scanner);
        // Red
        // Созданный объект создан, но нигде не используется
        // Надо удалить строку и стараться избегать создания лишних объектов
        MonthData data = new MonthData();
        while (true) {
            System.out.println("Выберите действие:");
            printMenu();
            int command = scanner.nextInt();

            if (command == 1){
                tracker.addNewNumberStepsPerDay();
            } else if (command == 2){
                tracker.changeStepGoal();
            }else if (command == 3){
                tracker.printStatistic();
            } else if (command == 4){
                System.out.println("Пока!!");
                return;
            } else {
                System.out.println("Такой команды нет(((");
            }
        }
    }
    public static void printMenu(){

        System.out.println("1 - Ввести количество шагов за определённый день.");
        System.out.println("2 - Изменить цель по количеству шагов в день.");
        System.out.println("3 - Напечатать статистику за определённый месяц.");
        System.out.println("4 - Выйти из приложения. ");


    }
}