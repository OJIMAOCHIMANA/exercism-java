public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed <= 0 || speed > 10) {
            return 0;
        }

        double successRate;

        if (speed <= 4) {
            successRate = 1.0;
        } else if (speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }

        return 221 * speed * successRate;
        /*if (speed > 0 && speed <= 4){
            return 221 * speed;
        } else if (speed >=5 && speed <= 8) {
            return 221 * speed * 0.9;
        } else if (speed == 9) {
            return 221 * speed * 0.8;
        } else if (speed == 10) {
            return 221 * speed * 0.77;
        }
        return 0;*/
    }

    public int workingItemsPerMinute(int speed) {
       return (int) (productionRatePerHour(speed) / 60);
    }
}
