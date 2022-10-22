public class BonusMilesService {
    public int calculate(int cost) {
        int milesAmount = cost / 20;

        if (milesAmount <= 0) {
            milesAmount = 0;
        }
        return milesAmount;
    }
}