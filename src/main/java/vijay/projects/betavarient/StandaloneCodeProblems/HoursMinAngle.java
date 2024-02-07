package vijay.projects.betavarient.StandaloneCodeProblems;

public class HoursMinAngle {
    private static final double minMultiplier = 360 / 60;

    private static final double hourMultiplier = minMultiplier / 12;

    private static final double completeHoursMultiplier = 360 / 12;

    public static double findAngle(int hours, int minutes) {
        double hoursAngle = hours * completeHoursMultiplier + hourMultiplier * minutes;
        double minutesAngle = minMultiplier * minutes;

        return (hoursAngle > minutesAngle ? hoursAngle - minutesAngle : minutesAngle - hoursAngle) % 360;
    }

    public static void main(String[] args) {
        System.out.println(findAngle(12,0));
    }
}
