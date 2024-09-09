public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth(){
        for (int i = 0;i < days.length; i++ ){
            System.out.println((i+1) +" День: "+ days[i] );
        }
    }
    int sumStepsFromMonth(){
        int sumStep = 0;
        for (int i = 0; i < days.length; i ++){
            sumStep += days[i];
        }
        return sumStep;

    }
    int maxStep(){
        int max = 0;
        for (int i =0; i < days.length; i++){
            if (max < days[i]){
                max = days[i];

            }
        }
        return max;
    }

    // Green
    // Метод работает при всех возможных случаев и не дает сбоев! Молодец :)

    // Yellow
    // Название переменной "goalsBystepsPerDay"
    // не удовлетворяет соглашению LowerCamelCase
    int bestSeries(int goalsBystepsPerDay){
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i ++){
            if (days[i] >= goalsBystepsPerDay){
                currentSeries += 1;
                if (currentSeries > finalSeries)
                    finalSeries = currentSeries;

            } else {
                currentSeries = 0;
            }

        }

        return finalSeries;


    }

}
