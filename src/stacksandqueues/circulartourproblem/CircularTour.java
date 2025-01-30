package stacksandqueues.circulartourproblem;

public class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalSurplus = 0, currSurplus = 0, start = 0;

        for (int i = 0; i < n; i++) {
            int balance = petrol[i] - distance[i];
            totalSurplus += balance;
            currSurplus += balance;

            if (currSurplus < 0) {
                start = i + 1;
                currSurplus = 0;
            }
        }

        return (totalSurplus >= 0) ? start : -1;
    }


}
