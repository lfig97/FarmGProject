public class Froilan extends Farmer{
    private Farm farm;

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    @Override
    public String toString() {
        return "Froilan{" +
                "farm=" + farm +
                '}';
    }
}
