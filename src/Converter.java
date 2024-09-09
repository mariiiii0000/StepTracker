public class Converter {
    int convertToKm(int steps){
        // Yellow
        // Переменная создана, чтобы сразу вернуть значение из нее
        // Можно сразу возвращать значение выражения
        // return steps * 75 / 100000;
        int km = (steps*75) / 100000;
        return km;

    }
    int convertStepsToKilo(int steps){
        // Yellow
        // Переменная создана, чтобы сразу вернуть значение из нее
        // Можно сразу возвращать значение выражения
        int kilo = (steps * 50) / 1000;
        return kilo;
    }
}
