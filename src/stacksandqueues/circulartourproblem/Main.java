package stacksandqueues.circulartourproblem;

public class Main {

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int startIndex = CircularTour.findStartingPoint(petrol, distance);

        if (startIndex != -1) {
            System.out.println("Starting pump index: " + startIndex);
        } else {
            System.out.println("No valid start point for circular tour.");
        }
    }
}
