import java.util.Arrays;

public class ChickenCoop {
    private Chicken[] chickens;

    public Chicken[] getChicken() {
        return chickens;
    }

    public void setChicken(Chicken[] chicken) {
        this.chickens = chicken;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "chickens=" + Arrays.toString(chickens) +
                '}';
    }
}
