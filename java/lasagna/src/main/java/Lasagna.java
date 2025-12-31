public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int remaining) {
        int expected = expectedMinutesInOven();
        return expected - remaining;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int lasagnaCount) {
        return lasagnaCount * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int lasagnaCount, int minute) {
        int preparationTime = preparationTimeInMinutes(lasagnaCount);
        return preparationTime + minute;
    }
}
