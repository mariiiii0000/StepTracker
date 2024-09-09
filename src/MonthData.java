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

    int bestSeries(int goalsByStepsPerDay){
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i ++){
            if (days[i] >= goalsByStepsPerDay){
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
