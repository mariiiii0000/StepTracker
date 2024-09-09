public class Converter {
    int convertToKm(int steps){
        int km = (steps*75) / 100000;
        return km;

    }
    int convertStepsToKilo(int steps){
        int kilo = (steps * 50) / 1000;
        return kilo;
    }
}
