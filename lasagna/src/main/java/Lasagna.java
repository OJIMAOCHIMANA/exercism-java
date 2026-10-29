public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }


    public int remainingMinutesInOven(int timeSpent) {
        return expectedMinutesInOven() - timeSpent;
    }


    public int preparationTimeInMinutes(int layersPrepared) {
        return layersPrepared * 2;
    }


    public int totalTimeInMinutes(int numOfLayers, int minsInOven) {
        return preparationTimeInMinutes(numOfLayers) + minsInOven;
    }


}
