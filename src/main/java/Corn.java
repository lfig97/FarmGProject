public class Corn extends Crop{
    private Corn corn;

    @Override
    public Edible yield() {
        if (isHasBeenHarvested()&&isHasBeenFertilized()){
            Corn c = new Corn();
            this.corn = c;
        }
        return corn;
    }
}
